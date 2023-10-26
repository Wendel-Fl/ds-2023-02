package org.example.observer;

import lombok.Getter;
import org.example.annotation.Observer;

import java.util.ArrayList;
import java.util.List;

@Getter
public class Observable {
    private static String identificador;
    private static final List<ObserverInterface> observerInterfaces = new ArrayList<>();

    public Observable(String identificador) {
        Observable.identificador = identificador;
    }

    public static <T> void associarObserver(T observer) {
        Class<?> observerClass = observer.getClass();

        observerInterfaces.forEach(observerInterface -> {
            if (observerClass.isAnnotationPresent(Observer.class)) {
                Observer annotation = observerClass.getAnnotation(Observer.class);

                if (annotation.value().equals(identificador)) {
                    System.out.println("Associando Observer a " + identificador);
                }
            }
        });
    }

    public void addObserver(ObserverInterface observerInterface) {
        observerInterfaces.add(observerInterface);
    }

    public void removeObserver(ObserverInterface observerInterface) {
        observerInterfaces.remove(observerInterface);
    }

    public void notifyObservers() {
        observerInterfaces.forEach(ObserverInterface::update);
    }
}

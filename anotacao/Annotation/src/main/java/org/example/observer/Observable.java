package org.example.observer;

import lombok.Getter;
import org.example.annotation.Observer;

import java.util.ArrayList;
import java.util.List;

@Getter
public class Observable {
    private final String identificador;
    private final List<ObserverInterface> observerInterfaces = new ArrayList<>();

    public Observable(String identificador) {
        this.identificador = identificador;
    }

    public void associarObserver(Object observer) {
        Class<?> observerClass = observer.getClass();

        if (observerClass.isAnnotationPresent(Observer.class)) {
            Observer annotation = observerClass.getAnnotation(Observer.class);

            if (annotation.value().equals(identificador)) {
                System.out.println("Associando Observer a " + identificador);
            }
        }
    }

    public void addObserver(ObserverInterface observerInterface) {
        observerInterfaces.add(observerInterface);
    }

    public void removeObserver(ObserverInterface observerInterface) {
        observerInterfaces.remove(observerInterface);
    }

    public void notifyObservers() {
        for (ObserverInterface observerInterface : observerInterfaces) {
            if (observerInterface.getValue().equals(identificador)) {
                observerInterface.update();
            }
        }
    }
}

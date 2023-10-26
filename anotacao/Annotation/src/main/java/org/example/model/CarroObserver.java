package org.example.model;

import org.example.annotation.Observer;
import org.example.observer.ObserverInterface;

@Observer(value = "carro")
public class CarroObserver implements ObserverInterface {

    @Override
    public String getValue() {
        Observer annotation = CarroObserver.class.getAnnotation(Observer.class);
        if (annotation != null) {
            return annotation.value();
        }
        return "";
    }

    @Override
    public void update() {
        System.out.println("CarroObserver foi notificado.");
    }
}

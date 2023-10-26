package org.example;

import org.example.model.CarroObserver;
import org.example.observer.Observable;

public class Main {
    public static void main(String[] args) {
        Observable carro = new Observable("carro");

        CarroObserver observer = new CarroObserver();
        carro.addObserver(observer);

        carro.associarObserver(observer);

        // Algum evento no objeto observado
        carro.notifyObservers();

    }
}
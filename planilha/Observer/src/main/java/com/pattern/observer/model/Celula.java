package com.pattern.observer.model;

import com.pattern.observer.observer.Observer;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;


public class Celula {

    @Getter
    private double valorX;

    @Getter
    private double valorY;

    @Getter
    private double valorZ;

    private final List<Observer> observers = new ArrayList<>();

    public Celula(double valorX, double valorY, double valorZ) {
        this.valorX = valorX;
        this.valorY = valorY;
        this.valorZ = valorZ;
    }

    public void setValorX(double valorX) {
        this.valorX = valorX;
        notifyObservers();
    }

    public void setValorY(double valorY) {
        this.valorY = valorY;
        notifyObservers();
    }

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void notifyObservers() {
        observers.forEach(observer -> observer.update(this));
    }
}

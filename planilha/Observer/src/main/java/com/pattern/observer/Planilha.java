package com.pattern.observer;

import com.pattern.observer.model.Celula;
import com.pattern.observer.model.Listener;

public class Planilha {
    public static void main(String[] args) {

        double valorX = 100.00;
        double valorY = 200.00;
        double valorZ = valorX + valorY;
        Celula celula = new Celula(valorX, valorY, valorZ);
        Listener celulaListener = Listener.builder().nomeCelula("Listener").build();
        celula.addObserver(celulaListener);
        celula.setValorX(valorX);
        celula.setValorY(valorY);
    }
}

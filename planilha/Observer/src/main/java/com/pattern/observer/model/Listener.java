package com.pattern.observer.model;

import com.pattern.observer.observer.Observer;
import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class Listener implements Observer {
    private String nomeCelula;

    @Override
    public void update(Celula celula) {
        double valorX = celula.getValorX();
        double valorY = celula.getValorY();
//        double valorZ = valorX + valorY;

        System.out.println("Reavaliar " + nomeCelula + " por mudança ocorrida em " + valorX + " ou " + valorY);
    }
}

package org.decorator.model;

import org.decorator.interfaces.Expressao;

public class Multiplica implements Expressao {

    private final Expressao valorA;
    private final Expressao valorB;

    public Multiplica(Expressao valorA, Expressao valorB) {
        this.valorA = valorA;
        this.valorB = valorB;
    }

    @Override
    public float valor() {
        return this.valorA.valor() * this.valorB.valor();
    }
}

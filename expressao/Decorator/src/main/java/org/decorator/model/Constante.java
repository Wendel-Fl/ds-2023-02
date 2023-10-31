package org.decorator.model;

import org.decorator.interfaces.Expressao;

public class Constante implements Expressao {

    private final float valor;

    public Constante(float valor) {
        this.valor = valor;
    }

    @Override
    public float valor() {
        return this.valor;
    }
}

package org.decorator;

import org.decorator.model.Constante;
import org.decorator.model.Multiplica;
import org.decorator.model.Soma;

public class Main {

    public static void main(String[] args) {

        Soma soma = new Soma(new Constante(5), new Multiplica(new Constante(2), new Constante(3)));

        System.out.println(soma.valor());

    }
}
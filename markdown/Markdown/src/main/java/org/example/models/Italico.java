package org.example.models;

import org.example.interfaces.Markdown;

public class Italico implements Markdown {
    private final Markdown texto;

    public Italico(Markdown texto) {
        this.texto = texto;
    }

    @Override
    public String exibe() {
        return "*" + texto.exibe() + "*";
    }
}

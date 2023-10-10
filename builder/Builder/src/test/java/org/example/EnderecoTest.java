package org.example;


import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EnderecoTest {


    @Test
    public void builder() {
        Endereco endereco = Endereco.builder()
                .rua("Rua 1004")
                .setor("Setor Pedro Ludovico")
                .cep("74000-000")
                .numero(1)
                .cidade("Goiânia")
                .estado("GO")
                .bloco("Bloco 1")
                .quadra("Quadra 1")
                .complemento("Complemento 1")
                .build();

        assertEquals("Rua 1004", endereco.getRua());
        assertEquals("Setor Pedro Ludovico", endereco.getSetor());
        assertEquals("74000-000", endereco.getCep());
        assertEquals(1, endereco.getNumero());
        assertEquals("Goiânia", endereco.getCidade());
        assertEquals("GO", endereco.getEstado());
        assertEquals("Bloco 1", endereco.getBloco());
        assertEquals("Quadra 1", endereco.getQuadra());
        assertEquals("Complemento 1", endereco.getComplemento());
    }
}
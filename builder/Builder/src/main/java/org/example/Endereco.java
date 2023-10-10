package org.example;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class Endereco {
    private final String rua;
    private final String setor;
    private final String cep;
    private final int numero;
    private final String cidade;
    private final String estado;
    private final String bloco;
    private final String quadra;
    private final String complemento;
    
}
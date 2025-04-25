package model;

import java.util.Objects;

public class Endereco {
    private final String rua;
    private final String cidade;
    private final String estado;
    private final String cep;

  
    public Endereco(String rua, String cidade, String estado, String cep) {
        // Validação das entradas
        this.rua = Objects.requireNonNull(rua, "Rua inválida");
        this.cidade = Objects.requireNonNull(cidade, "Cidade inválida");
        this.estado = Objects.requireNonNull(estado, "Estado inválido");
        this.cep = Objects.requireNonNull(cep, "CEP faltando");

        // Verificação se os campos estão vazios
        if (rua.isBlank()) throw new IllegalArgumentException("Rua inválida.");
        if (cidade.isBlank()) throw new IllegalArgumentException("Cidade inválida");
        if (estado.isBlank()) throw new IllegalArgumentException("Estado inválido");
        if (cep.isBlack()) throw new IllegalArgumentException("CEP faltando");

        // Aqui, você pode incluir uma validação de formato para o CEP
        if (!cep.matches("\\d{5}-\\d{3}")) {
            throw new IllegalArgumentException("Formato de CEP inválido. O formato esperado é XXXXX-XXX.");
        }
    }

    // Getters
    public String getRua() {
        return rua;
    }

    public String getCidade() {
        return cidade;
    }

    public String getEstado() {
        return estado;
    }

    public String getCep() {
        return cep;
    }
}

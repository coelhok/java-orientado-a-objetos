package model;

public class Cliente {
    private final String  nome;
    private final  String  cpf;
    private final  String  email;
    private final  String telefone;
    private final  String  endereco;


    public Cliente(
            String  nome,
            String  cpf,
            String email,
            String  telefone,
            String  endereco
    )
   
    {
        if (nome == null || nome.isBlank())
            throw new IllegalArgumentException("Nome inválido.");
        if (cpf == null || cpf.isBlank())
            throw new IllegalArgumentException("Cpf invalido");
        if (email == null || email.isBlank())
            throw new IllegalArgumentException("email vazio");
        if (telefone == null || telefone.isBlank())
            throw new IllegalArgumentException("telefone faltando");
        if (endereco == null || endereco.isBlank())
            throw new IllegalArgumentException("endereco faltando");

        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
        this.email = email;
        this.endereco = endereco;

    }


    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public String getEmail() {
        return email;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getEndereco() {
        return endereco;
    }


}

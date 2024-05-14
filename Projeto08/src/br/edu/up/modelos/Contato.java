package br.edu.up.modelos;

public abstract class Contato {
    private static int proximoCodigo = 1;

    private int codigo;
    private String nome;
    private String telefone;

    public Contato(String nome, String telefone) {
        this.codigo = proximoCodigo++;
        this.nome = nome;
        this.telefone = telefone;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    @Override
    public String toString() {
        return "Código: " + codigo + ", Nome: " + nome + ", Telefone: " + telefone;
    }
}

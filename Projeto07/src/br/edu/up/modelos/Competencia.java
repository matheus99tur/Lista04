package br.edu.up.modelos;

public class Competencia {
  private String nome;
    private boolean necessaria;

    public Competencia(String nome, boolean necessaria) {
        this.nome = nome;
        this.necessaria = necessaria;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public boolean isNecessaria() {
        return necessaria;
    }

    public void setNecessaria(boolean necessaria) {
        this.necessaria = necessaria;
    }
}

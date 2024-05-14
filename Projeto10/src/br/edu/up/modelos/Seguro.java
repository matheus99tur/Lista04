package br.edu.up.modelos;

public abstract class Seguro {
    private String numeroApolice;
    private String descricao;
    private double valor;

    public Seguro(String numeroApolice, String descricao, double valor) {
        this.numeroApolice = numeroApolice;
        this.descricao = descricao;
        this.valor = valor;
    }

    public String getNumeroApolice() {
        return numeroApolice;
    }

    public void setNumeroApolice(String numeroApolice) {
        this.numeroApolice = numeroApolice;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "Número Apólice: " + numeroApolice + ", Descrição: " + descricao + ", Valor: " + valor;
    }
}

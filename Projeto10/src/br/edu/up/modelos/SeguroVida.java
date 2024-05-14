package br.edu.up.modelos;

public class SeguroVida extends Seguro {
    private int idadeSegurado;

    public SeguroVida(String numeroApolice, String descricao, double valor, int idadeSegurado) {
        super(numeroApolice, descricao, valor);
        this.idadeSegurado = idadeSegurado;
    }

    public int getIdadeSegurado() {
        return idadeSegurado;
    }

    public void setIdadeSegurado(int idadeSegurado) {
        this.idadeSegurado = idadeSegurado;
    }

    @Override
    public String toString() {
        return super.toString() + ", Idade Segurado: " + idadeSegurado;
    }
}

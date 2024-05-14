package br.edu.up.modelos;

public class ContatoComercial extends Contato {
    private String empresa;

    public ContatoComercial(String nome, String telefone, String empresa) {
        super(nome, telefone);
        this.empresa = empresa;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    @Override
    public String toString() {
        return super.toString() + ", Empresa: " + empresa;
    }
}

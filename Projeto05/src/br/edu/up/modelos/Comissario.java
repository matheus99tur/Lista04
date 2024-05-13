package br.edu.up.modelos;

public class Comissario extends Tripulacao {
    private String idiomasFluencia;

    public Comissario(String nome, String rg, String identificacaoAeronautica, String matriculaFuncionario, String idiomasFluencia) {
        super(nome, rg, identificacaoAeronautica, matriculaFuncionario);
        this.idiomasFluencia = idiomasFluencia;
    }

    public String getIdiomasFluencia() {
        return idiomasFluencia;
    }

    public void setIdiomasFluencia(String idiomasFluencia) {
        this.idiomasFluencia = idiomasFluencia;
    }
}

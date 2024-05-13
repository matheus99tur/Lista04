package br.edu.up.modelos;

public class Tripulacao extends Pessoas {
    private String idAeronautica;
    private String matriculaFuncionario;

    public Tripulacao(String nome, String rg, String idAeronautica, String matriculaFuncionario){
        super(nome, rg);
        this.idAeronautica = idAeronautica;
        this.matriculaFuncionario = matriculaFuncionario;
    }

    public String getIdAeronautica(){
        return idAeronautica;
    }

    public void setIdAeronautica(String idAeronautica){
        this.idAeronautica = idAeronautica;
    }

    public String getMatriculaFuncionario() {
        return matriculaFuncionario;
    }

    public void setMatriculaFuncionario(String matriculaFuncionario) {
        this.matriculaFuncionario = matriculaFuncionario;
    }
}

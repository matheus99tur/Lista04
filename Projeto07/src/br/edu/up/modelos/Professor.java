package br.edu.up.modelos;

public class Professor {
  private String nome;
    private String rg;
    private String matricula;
    private String curriculoLattes;
    private String titulacao;

    public Professor(String nome, String rg, String matricula, String curriculoLattes, String titulacao) {
        this.nome = nome;
        this.rg = rg;
        this.matricula = matricula;
        this.curriculoLattes = curriculoLattes;
        this.titulacao = titulacao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getCurriculoLattes() {
        return curriculoLattes;
    }

    public void setCurriculoLattes(String curriculoLattes) {
        this.curriculoLattes = curriculoLattes;
    }

    public String getTitulacao() {
        return titulacao;
    }

    public void setTitulacao(String titulacao) {
        this.titulacao = titulacao;
    }
}

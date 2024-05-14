package br.edu.up.modelos;

public class Disciplina {
  private String nome;
    private int identificador;
    private String curriculo;
    private Competencia[] competencias;
    private Professor professor;
    private Aluno[] alunosMatriculados;

    public Disciplina(String nome, int identificador, String curriculo, Competencia[] competencias, Professor professor) {
        this.nome = nome;
        this.identificador = identificador;
        this.curriculo = curriculo;
        this.competencias = competencias;
        this.professor = professor;
        this.alunosMatriculados = new Aluno[100]; // Máximo de 100 alunos por disciplina
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdentificador() {
        return identificador;
    }

    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }

    public String getCurriculo() {
        return curriculo;
    }

    public void setCurriculo(String curriculo) {
        this.curriculo = curriculo;
    }

    public Competencia[] getCompetencias() {
        return competencias;
    }

    public void setCompetencias(Competencia[] competencias) {
        this.competencias = competencias;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public Aluno[] getAlunosMatriculados() {
        return alunosMatriculados;
    }

    public void setAlunosMatriculados(Aluno[] alunosMatriculados) {
        this.alunosMatriculados = alunosMatriculados;
    }
}

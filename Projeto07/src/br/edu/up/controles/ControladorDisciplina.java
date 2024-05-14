package br.edu.up.controles;

import br.edu.up.modelos.Aluno;
import br.edu.up.modelos.Competencia;
import br.edu.up.modelos.Disciplina;
import br.edu.up.modelos.Professor;

public class ControladorDisciplina {
  private Disciplina[] disciplinas;
    private int quantidadeDisciplinas;
    private static final int MAX_DISCIPLINAS = 100;

    public ControladorDisciplina() {
        this.disciplinas = new Disciplina[MAX_DISCIPLINAS];
        this.quantidadeDisciplinas = 0;
    }

    public void adicionarDisciplina(String nome, int identificador, String curriculo, Competencia[] competencias, Professor professor) {
        if (quantidadeDisciplinas < MAX_DISCIPLINAS) {
            Disciplina disciplina = new Disciplina(nome, identificador, curriculo, competencias, professor);
            disciplinas[quantidadeDisciplinas] = disciplina;
            quantidadeDisciplinas++;
            System.out.println("Disciplina adicionada com sucesso!");
        } else {
            System.out.println("Limite máximo de disciplinas atingido!");
        }
    }

    public void listarDisciplinas() {
        System.out.println("\nDisciplinas:");
        for (int i = 0; i < quantidadeDisciplinas; i++) {
            System.out.println((i + 1) + ". " + disciplinas[i].getNome() + " - " + disciplinas[i].getIdentificador());
        }
    }

    public void matricularAluno(Disciplina disciplina, Aluno aluno) {
        if (disciplina != null && aluno != null) {
            Aluno[] alunosMatriculados = disciplina.getAlunosMatriculados();
            for (int i = 0; i < alunosMatriculados.length; i++) {
                if (alunosMatriculados[i] == null) {
                    alunosMatriculados[i] = aluno;
                    System.out.println("Aluno matriculado com sucesso na disciplina " + disciplina.getNome());
                    return;
                }
            }
            System.out.println("Não foi possível matricular o aluno. Limite máximo de alunos atingido!");
        } else {
            System.out.println("Disciplina ou aluno inválidos!");
        }
    }
}

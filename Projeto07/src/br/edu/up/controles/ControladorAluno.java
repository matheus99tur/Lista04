package br.edu.up.controles;

import br.edu.up.modelos.Aluno;

public class ControladorAluno {
  private Aluno[] alunos;
    private int quantidadeAlunos;
    private static final int MAX_ALUNOS = 100;

    public ControladorAluno() {
        this.alunos = new Aluno[MAX_ALUNOS];
        this.quantidadeAlunos = 0;
    }

    public void adicionarAluno(Aluno aluno) {
        if (quantidadeAlunos < MAX_ALUNOS) {
            alunos[quantidadeAlunos] = aluno;
            quantidadeAlunos++;
            System.out.println("Aluno adicionado com sucesso!");
        } else {
            System.out.println("Limite máximo de alunos atingido!");
        }
    }

    public void listarAlunos() {
        System.out.println("\nAlunos:");
        for (int i = 0; i < quantidadeAlunos; i++) {
            System.out.println((i + 1) + ". " + alunos[i].getNome() + " - " + alunos[i].getMatricula());
        }
    }
}

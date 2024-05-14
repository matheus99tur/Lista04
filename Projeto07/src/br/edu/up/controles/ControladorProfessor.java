package br.edu.up.controles;

import br.edu.up.modelos.Professor;

public class ControladorProfessor {
  private Professor[] professores;
  private int quantidadeProfessores;
  private static final int MAX_PROFESSORES = 100;

  public ControladorProfessor() {
    this.professores = new Professor[MAX_PROFESSORES];
    this.quantidadeProfessores = 0;
  }

  public void adicionarProfessor(Professor professor) {
    if (quantidadeProfessores < MAX_PROFESSORES) {
      professores[quantidadeProfessores] = professor;
      quantidadeProfessores++;
      System.out.println("Professor adicionado com sucesso!");
    } else {
      System.out.println("Limite máximo de professores atingido!");
    }
  }

  public void listarProfessores() {
    System.out.println("\nProfessores:");
    for (int i = 0; i < quantidadeProfessores; i++) {
      System.out.println((i + 1) + ". " + professores[i].getNome() + " - " + professores[i].getMatricula());
    }
  }

  public Professor[] getProfessores() {
    return professores;
  }
}

package br.edu.up.telas;

import java.util.Scanner;

import br.edu.up.controles.ControladorAluno;
import br.edu.up.controles.ControladorDisciplina;
import br.edu.up.controles.ControladorProfessor;
import br.edu.up.modelos.Aluno;
import br.edu.up.modelos.Competencia;
import br.edu.up.modelos.Professor;

public class Programa {
  public static void main(String[] args) {
        ControladorAluno controladorAluno = new ControladorAluno();
        ControladorProfessor controladorProfessor = new ControladorProfessor();
        ControladorDisciplina controladorDisciplina = new ControladorDisciplina();
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Adicionar aluno");
            System.out.println("2. Listar alunos");
            System.out.println("3. Adicionar professor");
            System.out.println("4. Listar professores");
            System.out.println("5. Adicionar disciplina");
            System.out.println("6. Listar disciplinas");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");

            if (scanner.hasNextInt()) {
                opcao = scanner.nextInt();

                switch (opcao) {
                    case 1:
                        adicionarAluno(controladorAluno, scanner);
                        break;
                    case 2:
                        controladorAluno.listarAlunos();
                        break;
                    case 3:
                        adicionarProfessor(controladorProfessor, scanner);
                        break;
                    case 4:
                        controladorProfessor.listarProfessores();
                        break;
                    case 5:
                        adicionarDisciplina(controladorDisciplina, controladorProfessor, scanner);
                        break;
                    case 6:
                        controladorDisciplina.listarDisciplinas();
                        break;
                    case 0:
                        System.out.println("Saindo...");
                        break;
                    default:
                        System.out.println("Opção inválida!");
                        break;
                }
            } else {
                System.out.println("Opção inválida! Por favor, digite um número.");
                scanner.next(); // Limpar o buffer do scanner
                opcao = -1;
            }

        } while (opcao != 0);

        scanner.close();
    }

    private static void adicionarAluno(ControladorAluno controladorAluno, Scanner scanner) {
        System.out.println("\nAdicionar Aluno:");
        scanner.nextLine(); // Limpar o buffer do scanner
        System.out.print("Nome do aluno: ");
        String nome = scanner.nextLine();
        System.out.print("RG do aluno: ");
        String rg = scanner.nextLine();
        System.out.print("Matrícula do aluno: ");
        String matricula = scanner.nextLine();
        System.out.print("Ano de ingresso do aluno: ");
        int anoIngresso = scanner.nextInt();
        scanner.nextLine(); // Limpar o buffer do scanner
        System.out.print("Curso do aluno: ");
        String curso = scanner.nextLine();
        System.out.print("Turno do aluno: ");
        String turno = scanner.nextLine();

        Aluno aluno = new Aluno(nome, rg, matricula, anoIngresso, curso, turno);
        controladorAluno.adicionarAluno(aluno);
    }

    private static void adicionarProfessor(ControladorProfessor controladorProfessor, Scanner scanner) {
        System.out.println("\nAdicionar Professor:");
        scanner.nextLine(); // Limpar o buffer do scanner
        System.out.print("Nome do professor: ");
        String nome = scanner.nextLine();
        System.out.print("RG do professor: ");
        String rg = scanner.nextLine();
        System.out.print("Matrícula do professor: ");
        String matricula = scanner.nextLine();
        System.out.print("Currículo Lattes do professor: ");
        String curriculoLattes = scanner.nextLine();
        System.out.print("Titulação do professor: ");
        String titulacao = scanner.nextLine();

        Professor professor = new Professor(nome, rg, matricula, curriculoLattes, titulacao);
        controladorProfessor.adicionarProfessor(professor);
    }

    private static void adicionarDisciplina(ControladorDisciplina controladorDisciplina, ControladorProfessor controladorProfessor, Scanner scanner) {
        System.out.println("\nAdicionar Disciplina:");
        scanner.nextLine(); // Limpar o buffer do scanner
        System.out.print("Nome da disciplina: ");
        String nome = scanner.nextLine();
        System.out.print("Identificador da disciplina: ");
        int identificador = scanner.nextInt();
        scanner.nextLine(); // Limpar o buffer do scanner
        System.out.print("Currículo da disciplina: ");
        String curriculo = scanner.nextLine();
        System.out.print("Quantidade de competências necessárias: ");
        int quantidadeNecessarias = scanner.nextInt();
        scanner.nextLine(); // Limpar o buffer do scanner
        Competencia[] competencias = new Competencia[quantidadeNecessarias];
        for (int i = 0; i < quantidadeNecessarias; i++) {
            System.out.print("Nome da competência necessária " + (i + 1) + ": ");
            String nomeCompetencia = scanner.nextLine();
            competencias[i] = new Competencia(nomeCompetencia, true);
        }
        System.out.print("Quantidade de competências complementares: ");
        int quantidadeComplementares = scanner.nextInt();
        scanner.nextLine(); // Limpar o buffer do scanner
        for (int i = 0; i < quantidadeComplementares; i++) {
            System.out.print("Nome da competência complementar " + (i + 1) + ": ");
            String nomeCompetencia = scanner.nextLine();
            Competencia complementar = new Competencia(nomeCompetencia, false);
            Competencia[] temp = new Competencia[competencias.length + 1];
            System.arraycopy(competencias, 0, temp, 0, competencias.length);
            temp[temp.length - 1] = complementar;
            competencias = temp;
        }
        System.out.print("Matrícula do professor responsável: ");
        String matriculaProfessor = scanner.nextLine();
        Professor professor = buscarProfessor(controladorProfessor, matriculaProfessor);
        if (professor != null) {
            controladorDisciplina.adicionarDisciplina(nome, identificador, curriculo, competencias, professor);
        } else {
            System.out.println("Professor não encontrado!");
        }
    }

    private static Professor buscarProfessor(ControladorProfessor controladorProfessor, String matricula) {
        for (Professor professor : controladorProfessor.getProfessores()) {
            if (professor != null && professor.getMatricula().equals(matricula)) {
                return professor;
            }
        }
        return null;
    }
}

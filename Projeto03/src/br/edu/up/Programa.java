package br.edu.up;

import java.util.Scanner;

public class Programa {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    Ano ano = new Ano(2024, true);

    for (int i = 0; i < 12; i++) {
      Mes mes = new Mes(31, i + 1);
      for (int j = 0; j < 31; j++) {
        mes.adicionarDia(new Dia(j + 1));
      }
      ano.adicionarMes(mes);
    }

    int opcao;
    do {
      System.out.println("\nMenu:");
      System.out.println("1. Adicionar compromisso");
      System.out.println("2. Excluir compromisso");
      System.out.println("3. Listar compromissos de um dia");
      System.out.println("4. Listar compromissos de um mês");
      System.out.println("5. Listar todos os compromissos");
      System.out.println("0. Sair");
      System.out.print("Escolha uma opção: ");
      opcao = scanner.nextInt();

      switch (opcao) {
        case 1:
          System.out.println("Digite os dados do compromisso:");
          System.out.print("Pessoa: ");
          scanner.nextLine();
          String pessoa = scanner.nextLine();
          System.out.print("Local: ");
          String local = scanner.nextLine();
          System.out.print("Assunto: ");
          String assunto = scanner.nextLine();
          System.out.print("Hora: ");
          int hora = scanner.nextInt();
          System.out.print("Dia do mês: ");
          int diaMes = scanner.nextInt();
          System.out.print("Mês (número): ");
          int nomeMes = scanner.nextInt();
          ano.adicionarCompromisso(pessoa, local, assunto, hora, diaMes, nomeMes);
          break;
        case 2:
          System.out.print("Dia do mês: ");
          diaMes = scanner.nextInt();
          System.out.print("Mês (número): ");
          nomeMes = scanner.nextInt();
          System.out.print("Hora: ");
          hora = scanner.nextInt();
          ano.excluirCompromisso(nomeMes, diaMes, hora);
          break;
        case 3:
          System.out.print("Dia do mês: ");
          diaMes = scanner.nextInt();
          System.out.print("Mês (número): ");
          nomeMes = scanner.nextInt();
          System.out.println(ano.listarCompromissos(nomeMes, diaMes));
          break;
        case 4:
          System.out.print("Mês (número): ");
          nomeMes = scanner.nextInt();
          System.out.println(ano.listarCompromissos(nomeMes));
          break;
        case 5:
          for (int i = 1; i <= 12; i++) {
            System.out.println("Mês " + i + ":");
            System.out.println(ano.listarCompromissos(i));
          }
          break;
        case 0:
          System.out.println("Saindo...");
          break;
        default:
          System.out.println("Opção inválida!");
          break;
      }
    } while (opcao != 0);

    scanner.close();
  }

}

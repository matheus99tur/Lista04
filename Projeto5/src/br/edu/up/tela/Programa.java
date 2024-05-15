package br.edu.up.tela;

import java.text.ParseException;
import java.util.Scanner;

import br.edu.up.controles.EventoController;
import br.edu.up.controles.ReservaController;

public class Programa {
  public static void main(String[] args) throws ParseException {
    Scanner scanner = new Scanner(System.in);
    EventoController eventoController = new EventoController();
    ReservaController reservaController = new ReservaController();

    int opcao;

    do {
      System.out.println("Selecione uma opção:");
      System.out.println("1. Adicionar evento");
      System.out.println("2. Listar eventos");
      System.out.println("3. Remover evento");
      System.out.println("4. Fazer reserva");
      System.out.println("5. Listar reservas");
      System.out.println("6. Remover reserva");
      System.out.println("7. Sair");

      opcao = scanner.nextInt();
      scanner.nextLine();

      switch (opcao) {
        case 1:
          System.out.println("Nome do evento:");
          String nomeEvento = scanner.nextLine();
          System.out.println("Data do evento (dd/MM/yyyy):");
          String dataEvento = scanner.nextLine();
          System.out.println("Local do evento:");
          String localEvento = scanner.nextLine();
          System.out.println("Lotação máxima do evento:");
          int lotacaoMaxima = scanner.nextInt();
          System.out.println("Preço do ingresso:");
          double precoIngresso = scanner.nextDouble();
          eventoController.adicionarEvento(nomeEvento, dataEvento, localEvento, lotacaoMaxima, precoIngresso);
          break;
        case 2:
          System.out.println("Eventos cadastrados:");
          for (int i = 0; i < eventoController.getEventos().length; i++) {
            if (eventoController.getEventos()[i] != null) {
              System.out.println(eventoController.getEventos()[i]);
            }
          }
          System.out.println();
          break;
        case 3:
          System.out.println("Nome do evento a ser removido:");
          String nomeRemover = scanner.nextLine();
          eventoController.removerEvento(nomeRemover);
          break;
        case 4:
          System.out.println("Nome do evento para reserva:");
          String nomeEventoReserva = scanner.nextLine();
          System.out.println("Nome do responsável pela reserva:");
          String responsavelReserva = scanner.nextLine();
          System.out.println("Quantidade de pessoas:");
          int quantidadePessoas = scanner.nextInt();
          System.out.println("Data da reserva (dd/MM/yyyy):");
          String dataReserva = scanner.nextLine();
          double valorTotal = quantidadePessoas * eventoController.buscarEvento(nomeEventoReserva).getPrecoIngresso();
          reservaController.adicionarReserva(responsavelReserva, quantidadePessoas, dataReserva, valorTotal);
          break;
        case 5:
          System.out.println("Reservas realizadas:");
          for (int i = 0; i < reservaController.getReservas().length; i++) {
            if (reservaController.getReservas()[i] != null) {
              System.out.println(reservaController.getReservas()[i]);
            }
          }
          System.out.println();
          break;
        case 6:
          System.out.println("Nome do responsável pela reserva a ser removida:");
          String responsavelRemover = scanner.nextLine();
          reservaController.removerReserva(responsavelRemover);
          break;
        case 7:
          System.out.println("Saindo...");
          break;
        default:
          System.out.println("Opção inválida!\n");
          break;
      }
    } while (opcao != 7);

    scanner.close();
  }
}

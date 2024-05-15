package br.edu.up.controles;

import br.edu.up.modelos.Reserva;

public class ReservaController {
  private static final int MAX_RESERVAS = 100;
  private Reserva[] reservas;
  private int numReservas;

  public ReservaController() {
    this.reservas = new Reserva[MAX_RESERVAS];
    this.numReservas = 0;
  }

  public void adicionarReserva(String responsavel, int quantidadePessoas, String dataReserva, double valorTotal) {
    if (numReservas < MAX_RESERVAS) {
      reservas[numReservas++] = new Reserva(responsavel, quantidadePessoas, dataReserva, valorTotal);
      System.out.println("Reserva realizada com sucesso!\n");
    } else {
      System.out.println("Não foi possível realizar a reserva. Limite de reservas atingido.\n");
    }
  }

  public Reserva[] getReservas() {
    return reservas;
  }

  public Reserva buscarReserva(String responsavel) {
    for (int i = 0; i < numReservas; i++) {
      if (reservas[i].getResponsavel().equalsIgnoreCase(responsavel)) {
        return reservas[i];
      }
    }
    return null;
  }

  public void removerReserva(String responsavel) {
    for (int i = 0; i < numReservas; i++) {
      if (reservas[i].getResponsavel().equalsIgnoreCase(responsavel)) {
        for (int j = i; j < numReservas - 1; j++) {
          reservas[j] = reservas[j + 1];
        }
        reservas[numReservas - 1] = null;
        numReservas--;
        System.out.println("Reserva removida com sucesso!\n");
        return;
      }
    }
    System.out.println("Reserva não encontrada.\n");
  }
}

package br.edu.up.controles;

import br.edu.up.modelos.Evento;

public class EventoController {
  private static final int MAX_EVENTOS = 100;
  private Evento[] eventos;
  private int numEventos;

  public EventoController() {
    this.eventos = new Evento[MAX_EVENTOS];
    this.numEventos = 0;
  }

  public void adicionarEvento(String nome, String data, String local, int lotacaoMaxima, double precoIngresso) {
    if (numEventos < MAX_EVENTOS) {
      eventos[numEventos++] = new Evento(nome, data, local, lotacaoMaxima, precoIngresso);
      System.out.println("Evento adicionado com sucesso!\n");
    } else {
      System.out.println("Não foi possível adicionar o evento. Limite de eventos atingido.\n");
    }
  }

  public Evento[] getEventos() {
    return eventos;
  }

  public Evento buscarEvento(String nome) {
    for (int i = 0; i < numEventos; i++) {
      if (eventos[i].getNome().equalsIgnoreCase(nome)) {
        return eventos[i];
      }
    }
    return null;
  }

  public void removerEvento(String nome) {
    for (int i = 0; i < numEventos; i++) {
      if (eventos[i].getNome().equalsIgnoreCase(nome)) {
        for (int j = i; j < numEventos - 1; j++) {
          eventos[j] = eventos[j + 1];
        }
        eventos[numEventos - 1] = null;
        numEventos--;
        System.out.println("Evento removido com sucesso!\n");
        return;
      }
    }
    System.out.println("Evento não encontrado.\n");
  }
}

package br.edu.up.modelos;

public class Relatorio {
  private int veiculosEntraram;
  private int veiculosSairam;
  private double valorArrecadado;

  public Relatorio() {
    this.veiculosEntraram = 0;
    this.veiculosSairam = 0;
    this.valorArrecadado = 0.0;
  }

  public void adicionarEntrada() {
    veiculosEntraram++;
  }

  public void adicionarSaida() {
    veiculosSairam++;
  }

  public void adicionarPagamento(double valor) {
    valorArrecadado += valor;
  }

  public void imprimirRelatorio() {
    System.out.println("Relatório do Estacionamento:");
    System.out.println("Veículos entraram: " + veiculosEntraram);
    System.out.println("Veículos saíram: " + veiculosSairam);
    System.out.println("Valor arrecadado: R$ " + valorArrecadado);
  }
}

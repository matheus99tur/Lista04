package br.edu.up.modelos;

public class Estacionamento {
  private static final int CAPACIDADE = 10;
  private Veiculo[] vagas;
  private int quantidadeVeiculos;

  public Estacionamento() {
    this.vagas = new Veiculo[CAPACIDADE];
    this.quantidadeVeiculos = 0;
  }

  public boolean entrar(Veiculo veiculo) {
    if (quantidadeVeiculos < CAPACIDADE) {
      vagas[quantidadeVeiculos] = veiculo;
      quantidadeVeiculos++;
      return true;
    }
    return false;
  }

  public Veiculo sair(String placa) {
    for (int i = 0; i < quantidadeVeiculos; i++) {
      if (vagas[i].getPlaca().equals(placa)) {
        Veiculo veiculo = vagas[i];
        for (int j = i; j < quantidadeVeiculos - 1; j++) {
          vagas[j] = vagas[j + 1];
        }
        vagas[quantidadeVeiculos - 1] = null;
        quantidadeVeiculos--;
        return veiculo;
      }
    }
    return null;
  }

  public int getTotalVeiculos() {
    return quantidadeVeiculos;
  }

  public double calcularPagamento() {
    return quantidadeVeiculos * 5.0;
  }

  public void limparEstacionamento() {
    vagas = new Veiculo[CAPACIDADE];
    quantidadeVeiculos = 0;
  }
}

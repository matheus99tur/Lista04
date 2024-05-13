package br.edu.up;

public class Mes {
  private int nome;
  private int qtdeDias;
  private Dia[] dias;

  public Mes(int qtdeDias, int nome) {
    this.qtdeDias = qtdeDias;
    this.nome = nome;
    this.dias = new Dia[qtdeDias];
  }

  public void adicionarDia(Dia dia) {
    dias[dia.getDiaMes() - 1] = dia;
  }

  public void adicionarCompromisso(Compromissos comp, int diaMes) {
    dias[diaMes - 1].adicionarCompromisso(comp);
  }

  public String listarCompromissos(int diaMes) {
    return dias[diaMes - 1].listarCompromissos();
  }

  public String listarCompromissos() {
    StringBuilder lista = new StringBuilder();
    for (Dia dia : dias) {
      if (dia != null) {
        lista.append("Dia ").append(dia.getDiaMes()).append(":\n");
        lista.append(dia.listarCompromissos());
      }
    }
    return lista.toString();
  }

  // GET E SET DO NOME
  public int getNome() {
    return nome;
  }

  public void setNome(int nome) {
    this.nome = nome;
  }

  // GET E SET DA QUANTIDADE DE DIAS
  public int getQtdeDias() {
    return qtdeDias;
  }

  public void setQtdeDias(int qtdeDias) {
    this.qtdeDias = qtdeDias;
  }

  // GET E SET DOS DIAS
  public Dia[] getDias() {
    return dias;
  }

  public void setDias(Dia[] dias) {
    this.dias = dias;
  }

}

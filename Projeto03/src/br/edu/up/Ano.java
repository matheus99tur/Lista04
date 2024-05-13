package br.edu.up;

public class Ano {
  private int ano;
  private boolean bissexto;
  private Mes[] meses;

  public Ano(int ano, boolean bissexto) {
    this.ano = ano;
    this.bissexto = bissexto;
    meses = new Mes[12];
  }

  public void adicionarMes(Mes mes) {
    meses[mes.getNome() - 1] = mes;
  }

  public void adicionarCompromisso(String pessoa, String local, String assunto, int hora, int diaMes, int nomeMes) {
    meses[nomeMes - 1].adicionarCompromisso(new Compromissos(pessoa, local, assunto, hora), diaMes);
  }

  public void excluirCompromisso(int nomeMes, int diaMes, int hora) {
    meses[nomeMes - 1].adicionarCompromisso(null, diaMes);
  }

  public String listarCompromissos(int nomeMes, int diaMes) {
    return meses[nomeMes - 1].listarCompromissos(diaMes);
  }

  public String listarCompromissos(int nomeMes) {
    return meses[nomeMes - 1].listarCompromissos();
  }

  // GET E SET DO ANO
  public int getAno() {
    return ano;
  }

  public void setAno(int ano) {
    this.ano = ano;
  }

  // GET E SET DO BISSEXTO
  public boolean isBissexto() {
    return bissexto;
  }

  public void setBissexto(boolean bissexto) {
    this.bissexto = bissexto;
  }

  // GET E SET DOS MESES
  public Mes[] getMeses() {
    return meses;
  }

  public void setMeses(Mes[] meses) {
    this.meses = meses;
  }
}

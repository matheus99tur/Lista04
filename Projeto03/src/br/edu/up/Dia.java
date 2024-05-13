package br.edu.up;

public class Dia {
  private int diaMes;
  private Compromissos[] compromissos;

  public Dia(int diaMes) {
    this.diaMes = diaMes;
    this.compromissos = new Compromissos[24];
  }

  public void adicionarCompromisso(Compromissos comp) {
    compromissos[comp.getHora()] = comp;
  }

  public Compromissos consultarCompromisso(int hora) {
    return compromissos[hora];
  }

  public void excluirCompromisso(int hora) {
    compromissos[hora] = null;
  }

  public String listarCompromissos() {
    StringBuilder lista = new StringBuilder();
    for (Compromissos comp : compromissos) {
      if (comp != null) {
        lista.append(comp.toString()).append("\n");
      }
    }
    return lista.toString();
  }

  // GET E SET DO DIA DO MÊS
  public int getDiaMes() {
    return diaMes;
  }

  public void setDiaMes(int diaMes) {
    this.diaMes = diaMes;
  }

  // GET E SET DA LISTA DE COMPROMISSOS
  public Compromissos[] getCompromissos() {
    return compromissos;
  }

  public void setCompromissos(Compromissos[] compromissos) {
    this.compromissos = compromissos;
  }

}

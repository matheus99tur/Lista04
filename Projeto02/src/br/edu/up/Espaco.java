package br.edu.up;

public class Espaco {
  private double p1;
  private double p2;

  public Espaco() {
    this.p1 = 0;
    this.p2 = 0;
  }

  public Espaco(double x, double y) {
    this.p1 = x;
    this.p2 = y;
  }

  public double calcularDistancia(Espaco outroPonto) {
    double distancia = Math.sqrt(Math.pow((this.p1 - outroPonto.p2), 2) + Math.pow((this.p1 - outroPonto.p2), 2));
    return distancia;
  }

  // Get Ponto 1
  public double getP1() {
    return p1;
  }

  public void setP1(double p1) {
    this.p1 = p1;
  }

  // Get Ponto 2
  public double getP2() {
    return p2;
  }

  public void setP2(double p2) {
    this.p2 = p2;
  }
}

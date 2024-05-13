package br.edu.up;

public class Programa {
  public static void main(String[] args) {
    Espaco ponto1 = new Espaco();
    Espaco ponto2 = new Espaco(2, 5);

    double distanciaP1P2 = ponto1.calcularDistancia(ponto2);
    System.out.println("Distância entre ponto1 e ponto2: " + distanciaP1P2);

    Espaco coordenadas = new Espaco(7, 2);
    double distanciaP2Coordenadas = ponto2.calcularDistancia(coordenadas);
    System.out.println("Distância entre ponto2 e coordenadas (7,2): " + distanciaP2Coordenadas);

    ponto1.setP1(10);

    ponto1.setP2(3);

    ponto1.setP1(10);
    ponto1.setP2(3);

    System.out.println("Novas coordenadas do ponto1: (" + ponto1.getP1() + ", " + ponto1.getP2() + ")");

  }
}

package br.edu.up.modelos;

public class SituacaoAluno {
  public static final int MINIMO_COMPETENCIAS_NECESSARIAS = 100;
  public static final int MINIMO_COMPETENCIAS_COMPLEMENTARES = 50;

  public static String verificarSituacao(int percentualNecessarias, int percentualComplementares) {
      if (percentualNecessarias >= MINIMO_COMPETENCIAS_NECESSARIAS && percentualComplementares >= MINIMO_COMPETENCIAS_COMPLEMENTARES) {
          return "APROVADO";
      } else if (percentualNecessarias < MINIMO_COMPETENCIAS_NECESSARIAS || percentualComplementares < MINIMO_COMPETENCIAS_COMPLEMENTARES) {
          return "REPROVADO";
      } else {
          return "PENDENTE";
      }
  }
}

package br.edu.up.modelos;

public class Comandante extends Tripulacao {
   
    private int totalHorasVoo;

    public Comandante(String nome, String rg, String identificacaoAeronautica, String matriculaFuncionario, int totalHorasVoo) {
        super(nome, rg, identificacaoAeronautica, matriculaFuncionario);
        this.totalHorasVoo = totalHorasVoo;
    }

    public int getTotalHorasVoo() {
        return totalHorasVoo;
    }

    public void setTotalHorasVoo(int totalHorasVoo) {
        this.totalHorasVoo = totalHorasVoo;
    }
}


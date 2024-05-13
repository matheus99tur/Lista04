package br.edu.up.modelos;

import java.util.Date;

public class Passagem {
    private int numeroAcento;
    private String classeAcento;
    private Date dataVoo;

    public Passagem(int numeroAcento, String classeAcento, Date dataVoo) {
        this.numeroAcento = numeroAcento;
        this.classeAcento = classeAcento;
        this.dataVoo = dataVoo;
    }

    public int getNumeroAcento() {
        return numeroAcento;
    }

    public void setNumeroAcento(int numeroAcento) {
        this.numeroAcento = numeroAcento;
    }

    public String getClasseAcento() {
        return classeAcento;
    }

    public void setClasseAcento(String classeAcento) {
        this.classeAcento = classeAcento;
    }

    public Date getDataVoo() {
        return dataVoo;
    }

    public void setDataVoo(Date dataVoo) {
        this.dataVoo = dataVoo;
    }
}

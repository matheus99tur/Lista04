package br.edu.up.modelos;

public class Pessoas {
    private String nome;
    private String rg;

    public Pessoas(String nome, String rg){
        this.nome = nome;
        this.rg = rg;
    }
    
    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getRg(){
        return rg;
    }

    public void setRg(String rg){
        this.rg = rg;
    }
    
}
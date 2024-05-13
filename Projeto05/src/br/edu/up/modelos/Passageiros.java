package br.edu.up.modelos;

public class Passageiros extends Pessoas {
    private String identificadorBagagem;
    private Passagem passagem;

    public Passageiros(String nome, String rg, String identificadorBagagem, Passagem passagem){
        super(nome, rg);
        this.identificadorBagagem = identificadorBagagem;
        this.passagem = passagem;
    }
    
    public String getIdentificadorBagagem(){
        return identificadorBagagem;
    }

    public void setIdentificadorBagagem(String identificadorBagagem) {
        this.identificadorBagagem = identificadorBagagem;
    }

    public Passagem getPassagem(){
        return passagem;
    }

    public void setPassagem(Passagem passagem) {
        this.passagem = passagem;
    }
}

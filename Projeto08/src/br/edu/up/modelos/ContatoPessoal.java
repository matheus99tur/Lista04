package br.edu.up.modelos;

public class ContatoPessoal extends Contato {
    private String email;

    public ContatoPessoal(String nome, String telefone, String email) {
        super(nome, telefone);
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return super.toString() + ", Email: " + email;
    }
}

package br.edu.up.controles;

public class AeroportoView {
    public void exibirMenu() {
        System.out.println("===== Aeroporto =====");
        System.out.println("1. Adicionar passageiro");
        System.out.println("2. Adicionar tripulante");
        System.out.println("3. Listar passageiros");
        System.out.println("4. Listar tripulantes");
        System.out.println("5. Sair");
    }

    public void exibirMensagem(String mensagem) {
        System.out.println(mensagem);
    }
}

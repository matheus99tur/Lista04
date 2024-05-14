package br.edu.up.controles;

import br.edu.up.modelos.Contato;

import java.util.List;
import java.util.Scanner;

public class Agenda {
    private Scanner scanner;

    public Agenda() {
        this.scanner = new Scanner(System.in);
    }

    public int exibirMenu() {
        System.out.println("===== Agenda de Contatos =====");
        System.out.println("1. Incluir contato pessoal");
        System.out.println("2. Incluir contato comercial");
        System.out.println("3. Excluir contato pelo código");
        System.out.println("4. Consultar contato pelo código");
        System.out.println("5. Listar todos os contatos");
        System.out.println("6. Sair do programa");
        System.out.println("Escolha uma opção:");
        return scanner.nextInt();
    }

    public void exibirContato(Contato contato) {
        System.out.println(contato);
    }

    public void exibirContatos(List<Contato> contatos) {
        System.out.println("===== Lista de Contatos =====");
        for (Contato contato : contatos) {
            System.out.println(contato);
        }
    }

    public int lerCodigo() {
        System.out.println("Digite o código do contato:");
        return scanner.nextInt();
    }

    public void exibirMensagem(String mensagem) {
        System.out.println(mensagem);
    }

    public Contato lerContato() {
        scanner.nextLine(); // Limpar o buffer
        System.out.println("Digite o nome do contato:");
        String nome = scanner.nextLine();
        System.out.println("Digite o telefone do contato:");
        String telefone = scanner.nextLine();
        return new Contato(nome, telefone) {}; // Instancia um objeto anônimo da classe Contato
    }

    public String lerEmail() {
        System.out.println("Digite o email do contato pessoal:");
        return scanner.nextLine();
    }

    public String lerEmpresa() {
        System.out.println("Digite a empresa do contato comercial:");
        return scanner.nextLine();
    }
}

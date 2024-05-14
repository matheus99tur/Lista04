package br.edu.up.controles;

import br.edu.up.modelos.Seguro;
import java.util.List;
import java.util.Scanner;

public class SeguroTela{
    private Scanner scanner;

    public SeguroTela() {
        this.scanner = new Scanner(System.in);
    }

    public int exibirMenu() {
        System.out.println("===== Menu =====");
        System.out.println("1. Incluir seguro");
        System.out.println("2. Localizar seguro");
        System.out.println("3. Excluir seguro");
        System.out.println("4. Excluir todos os seguros");
        System.out.println("5. Listar todos os seguros");
        System.out.println("6. Ver quantidade de seguros");
        System.out.println("7. Sair");
        System.out.println("Escolha uma opção:");
        return scanner.nextInt();
    }

    public Seguro lerSeguro() {
        scanner.nextLine(); // Limpar o buffer
        System.out.println("Digite o número da apólice:");
        String numeroApolice = scanner.nextLine();
        System.out.println("Digite a descrição:");
        String descricao = scanner.nextLine();
        System.out.println("Digite o valor:");
        double valor = scanner.nextDouble();
        return new Seguro(numeroApolice, descricao, valor) {}; // Instancia um objeto anônimo da classe Seguro
    }

    public String lerNumeroApolice() {
        scanner.nextLine(); // Limpar o buffer
        System.out.println("Digite o número da apólice:");
        return scanner.nextLine();
    }

    public void exibirMensagem(String mensagem) {
        System.out.println(mensagem);
    }

    public void exibirSeguro(Seguro seguro) {
        System.out.println(seguro);
    }

    public void exibirSeguros(List<Seguro> seguros) {
        System.out.println("===== Lista de Seguros =====");
        for (Seguro seguro : seguros) {
            System.out.println(seguro);
        }
    }
}

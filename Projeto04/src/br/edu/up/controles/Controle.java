package br.edu.up.controles;
import java.util.Scanner;
import br.edu.up.modelos.Estacionamento;
import br.edu.up.modelos.Relatorio;
import br.edu.up.modelos.Veiculo;

public class Controle {

    private Estacionamento estacionamento;
    private Relatorio relatorio;

    public Controle() {
        this.estacionamento = new Estacionamento();
        this.relatorio = new Relatorio();
    }

    public void menu() {
        Scanner scanner = new Scanner(System.in);
        int opcao;
        do {
            System.out.println("\nMenu:");
            System.out.println("1. Entrada de veículo");
            System.out.println("2. Saída de veículo");
            System.out.println("3. Emitir relatório");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");

            if (scanner.hasNextInt()) {
                opcao = scanner.nextInt();
                scanner.nextLine(); // Consume newline character
                switch (opcao) {
                    case 1:
                        entradaVeiculo(scanner);
                        break;
                    case 2:
                        saidaVeiculo(scanner);
                        break;
                    case 3:
                        emitirRelatorio();
                        break;
                    case 0:
                        System.out.println("Saindo...");
                        break;
                    default:
                        System.out.println("Opção inválida!");
                        break;
                }
            } else {
                System.out.println("Opção inválida! Por favor, digite um número.");
                scanner.next();
                opcao = -1;
            }

        } while (opcao != 0);

        scanner.close();
    }

    private void entradaVeiculo(Scanner scanner) {
        System.out.println("\nEntrada de Veículo:");
        System.out.print("Modelo: ");
        String modelo = scanner.nextLine();
        System.out.print("Placa: ");
        String placa = scanner.nextLine();
        System.out.print("Cor: ");
        String cor = scanner.nextLine();

        Veiculo veiculo = new Veiculo(modelo, placa, cor);
        if (estacionamento.entrar(veiculo)) {
            relatorio.adicionarEntrada();
            System.out.println("Veículo estacionado com sucesso!");
        } else {
            System.out.println("Estacionamento lotado!");
        }
    }

    private void saidaVeiculo(Scanner scanner) {
        System.out.println("\nSaída de Veículo:");
        System.out.print("Placa do veículo que está saindo: ");
        String placa = scanner.nextLine();

        Veiculo veiculo = estacionamento.sair(placa);
        if (veiculo != null) {
            relatorio.adicionarSaida();
            double valorPago = 5.0;
            relatorio.adicionarPagamento(valorPago);
            System.out.println("Veículo " + veiculo.getModelo() + " saiu do estacionamento. Valor a pagar: R$ " + valorPago);
        } else {
            System.out.println("Veículo não encontrado no estacionamento!");
        }
    }

    private void emitirRelatorio() {
        relatorio.imprimirRelatorio();
    }
}

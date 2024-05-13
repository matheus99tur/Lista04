package br.edu.up.controles;

import br.edu.up.modelos.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AeroportoControle {
    private List<Passageiros> passageiros;
    private List<Tripulacao> tripulantes;
    private AeroportoTela view;

    public AeroportoControle() {
        this.passageiros = new ArrayList<>();
        this.tripulantes = new ArrayList<>();
        this.view = new AeroportoTela();
    }

    public void adicionarPassageiro(String nome, String rg, String identificadorBagagem, Passagem passagem) {
        Passageiros passageiro = new Passageiros(nome, rg, identificadorBagagem, passagem);
        passageiros.add(passageiro);
        view.exibirMensagem("Passageiro adicionado com sucesso.");
    }

    public void adicionarTripulante(String nome, String rg, String identificacaoAeronautica, String matriculaFuncionario) {
        Tripulacao tripulante = new Tripulacao(nome, rg, identificacaoAeronautica, matriculaFuncionario);
        tripulantes.add(tripulante);
        view.exibirMensagem("Tripulante adicionado com sucesso.");
    }

    public void listarPassageiros() {
        view.exibirMensagem("Passageiros:");
        for (Passageiros passageiro : passageiros) {
            view.exibirMensagem("Nome: " + passageiro.getNome() + ", RG: " + passageiro.getRg());
        }
    }

    public void listarTripulantes() {
        view.exibirMensagem("Tripulantes:");
        for (Tripulacao tripulante : tripulantes) {
            view.exibirMensagem("Nome: " + tripulante.getNome() + ", RG: " + tripulante.getRg());
        }
    }

    public void iniciar() {
        Scanner scanner = new Scanner(System.in);
        int opcao;
        do {
            view.exibirMenu();
            opcao = scanner.nextInt();
            scanner.nextLine(); // Limpar o buffer do scanner

            switch (opcao) {
                case 1:
                    // Adicionar passageiro
                    view.exibirMensagem("Digite o nome do passageiro:");
                    String nomePassageiro = scanner.nextLine();
                    view.exibirMensagem("Digite o RG do passageiro:");
                    String rgPassageiro = scanner.nextLine();
                    view.exibirMensagem("Digite o identificador da bagagem:");
                    String identificadorBagagem = scanner.nextLine();
                    // Simulação de dados da passagem
                    Passagem passagem = new Passagem(1, "Econômica", null);
                    adicionarPassageiro(nomePassageiro, rgPassageiro, identificadorBagagem, passagem);
                    break;
                case 2:
                    // Adicionar tripulante
                    view.exibirMensagem("Digite o nome do tripulante:");
                    String nomeTripulante = scanner.nextLine();
                    view.exibirMensagem("Digite o RG do tripulante:");
                    String rgTripulante = scanner.nextLine();
                    view.exibirMensagem("Digite a identificação aeronáutica:");
                    String identificacaoAeronautica = scanner.nextLine();
                    view.exibirMensagem("Digite a matrícula do funcionário:");
                    String matriculaFuncionario = scanner.nextLine();
                    adicionarTripulante(nomeTripulante, rgTripulante, identificacaoAeronautica, matriculaFuncionario);
                    break;
                case 3:
                    // Listar passageiros
                    listarPassageiros();
                    break;
                case 4:
                    // Listar tripulantes
                    listarTripulantes();
                    break;
                case 5:
                    view.exibirMensagem("Encerrando programa...");
                    break;
                default:
                    view.exibirMensagem("Opção inválida. Por favor, digite novamente.");
            }
        } while (opcao != 5);

        scanner.close();
    }
}

package br.edu.up.controles;

import br.edu.up.modelos.Seguro;
import java.util.ArrayList;
import java.util.List;

public class SeguroControle {
    private List<Seguro> seguros;
    private SeguroTela view;

    public SeguroControle() {
        this.seguros = new ArrayList<>();
        this.view = new SeguroTela();
    }

    public void incluirSeguro() {
        Seguro seguro = view.lerSeguro();
        if (verificarExistenciaSeguro(seguro.getNumeroApolice())) {
            view.exibirMensagem("Número de apólice já existe.");
        } else {
            seguros.add(seguro);
            view.exibirMensagem("Seguro incluído com sucesso.");
        }
    }

    public void localizarSeguro() {
        String numeroApolice = view.lerNumeroApolice();
        Seguro seguroEncontrado = null;
        for (Seguro seguro : seguros) {
            if (seguro.getNumeroApolice().equals(numeroApolice)) {
                seguroEncontrado = seguro;
                break;
            }
        }
        if (seguroEncontrado != null) {
            view.exibirSeguro(seguroEncontrado);
        } else {
            view.exibirMensagem("Seguro não encontrado.");
        }
    }

    public void excluirSeguro() {
        String numeroApolice = view.lerNumeroApolice();
        Seguro seguroExcluir = null;
        for (Seguro seguro : seguros) {
            if (seguro.getNumeroApolice().equals(numeroApolice)) {
                seguroExcluir = seguro;
                break;
            }
        }
        if (seguroExcluir != null) {
            seguros.remove(seguroExcluir);
            view.exibirMensagem("Seguro excluído com sucesso.");
        } else {
            view.exibirMensagem("Seguro não encontrado.");
        }
    }

    public void excluirTodosSeguros() {
        view.exibirMensagem("Tem certeza que deseja excluir todos os seguros? (S/N)");
        String confirmacao = view.lerNumeroApolice();
        if (confirmacao.equalsIgnoreCase("S")) {
            seguros.clear();
            view.exibirMensagem("Todos os seguros foram excluídos.");
        }
    }

    public int quantidadeSeguros() {
        return seguros.size();
    }

    public void listarSeguros() {
        view.exibirSeguros(seguros);
    }

    public void iniciar() {
        int opcao;
        do {
            opcao = view.exibirMenu();
            switch (opcao) {
                case 1:
                    incluirSeguro();
                    break;
                case 2:
                    localizarSeguro();
                    break;
                case 3:
                    excluirSeguro();
                    break;
                case 4:
                    excluirTodosSeguros();
                    break;
                case 5:
                    listarSeguros();
                    break;
                case 6:
                    view.exibirMensagem("Quantidade de seguros: " + quantidadeSeguros());
                    break;
                case 7:
                    view.exibirMensagem("Encerrando programa...");
                    break;
                default:
                    view.exibirMensagem("Opção inválida. Por favor, digite novamente.");
            }
        } while (opcao != 7);
    }

    private boolean verificarExistenciaSeguro(String numeroApolice) {
        for (Seguro seguro : seguros) {
            if (seguro.getNumeroApolice().equals(numeroApolice)) {
                return true;
            }
        }
        return false;
    }
}

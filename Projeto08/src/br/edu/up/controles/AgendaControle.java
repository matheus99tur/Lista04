package br.edu.up.controles;

import br.edu.up.modelos.Contato;
import br.edu.up.modelos.ContatoPessoal;
import br.edu.up.modelos.ContatoComercial;

import java.util.ArrayList;
import java.util.List;

public class AgendaControle {
    private List<Contato> contatos;
    private Agenda view;

    public AgendaControle() {
        this.contatos = new ArrayList<>();
        this.view = new Agenda();
    }

    public void incluirContatoPessoal() {
        Contato contato = view.lerContato();
        String email = view.lerEmail();
        ContatoPessoal pessoal = new ContatoPessoal(contato.getNome(), contato.getTelefone(), email);
        contatos.add(pessoal);
        view.exibirMensagem("Contato pessoal adicionado com sucesso.");
    }

    public void incluirContatoComercial() {
        Contato contato = view.lerContato();
        String empresa = view.lerEmpresa();
        ContatoComercial comercial = new ContatoComercial(contato.getNome(), contato.getTelefone(), empresa);
        contatos.add(comercial);
        view.exibirMensagem("Contato comercial adicionado com sucesso.");
    }

    public void excluirContato(int codigo) {
        for (Contato contato : contatos) {
            if (contato.getCodigo() == codigo) {
                contatos.remove(contato);
                view.exibirMensagem("Contato removido com sucesso.");
                return;
            }
        }
        view.exibirMensagem("Contato não encontrado.");
    }

    public void consultarContato(int codigo) {
        for (Contato contato : contatos) {
            if (contato.getCodigo() == codigo) {
                view.exibirContato(contato);
                return;
            }
        }
        view.exibirMensagem("Contato não encontrado.");
    }

    public void listarContatos() {
        view.exibirContatos(contatos);
    }

    public void iniciar() {
        int opcao;
        do {
            opcao = view.exibirMenu();
            switch (opcao) {
                case 1:
                    incluirContatoPessoal();
                    break;
                case 2:
                    incluirContatoComercial();
                    break;
                case 3:
                    int codigoExcluir = view.lerCodigo();
                    excluirContato(codigoExcluir);
                    break;
                case 4:
                    int codigoConsultar = view.lerCodigo();
                    consultarContato(codigoConsultar);
                    break;
                case 5:
                    listarContatos();
                    break;
                case 6:
                    view.exibirMensagem("Encerrando programa...");
                    break;
                default:
                    view.exibirMensagem("Opção inválida. Por favor, digite novamente.");
            }
        } while (opcao != 6);
    }
}

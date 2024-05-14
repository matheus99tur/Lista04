package br.edu.up.controles;

import br.edu.up.modelos.Cidade;
import br.edu.up.modelos.Cliente;
import br.edu.up.modelos.Endereco;

public class ClienteController {
   public Cliente criarCliente(String nome, String telefone, String email, String rua, String numero, String bairro, String cep, String cidadeNome, String cidadeUF, double vlrMaxCredito) {
        Endereco endereco = new Endereco(rua, numero, bairro, cep, new Cidade(cidadeNome, cidadeUF));
        return new Cliente(nome, telefone, email, endereco, vlrMaxCredito) {
            @Override
            public double getSaldo() {
                return vlrMaxCredito - vlrEmprestado;
            }

            @Override
            public String getDados() {
                return "Nome: " + nome + "\nTelefone: " + telefone + "\nEmail: " + email + "\nEndereço: " + endereco.toString() +
                        "\nSaldo devedor: R$ " + vlrEmprestado;
            }
        };
    }
}

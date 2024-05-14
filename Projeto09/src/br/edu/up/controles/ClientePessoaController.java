package br.edu.up.controles;

import br.edu.up.modelos.Cidade;
import br.edu.up.modelos.ClientePessoa;
import br.edu.up.modelos.Endereco;

public class ClientePessoaController {
  public ClientePessoa criarClientePessoa(String nome, String telefone, String email, String rua, String numero, String bairro, String cep, String cidadeNome, String cidadeUF, double vlrMaxCredito, String CPF, double peso, double altura) {
        Endereco endereco = new Endereco(rua, numero, bairro, cep, new Cidade(cidadeNome, cidadeUF));
        return new ClientePessoa(nome, telefone, email, endereco, vlrMaxCredito, CPF, peso, altura);
    }
}

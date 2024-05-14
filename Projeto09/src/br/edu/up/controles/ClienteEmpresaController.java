package br.edu.up.controles;

import br.edu.up.modelos.Cidade;
import br.edu.up.modelos.ClienteEmpresa;
import br.edu.up.modelos.Endereco;

public class ClienteEmpresaController {
  public ClienteEmpresa criarClienteEmpresa(String nome, String telefone, String email, String rua, String numero, String bairro, String cep, String cidadeNome, String cidadeUF, double vlrMaxCredito, String CNPJ, String inscEstadual, int anoFundacao) {
        Endereco endereco = new Endereco(rua, numero, bairro, cep, new Cidade(cidadeNome, cidadeUF));
        return new ClienteEmpresa(nome, telefone, email, endereco, vlrMaxCredito, CNPJ, inscEstadual, anoFundacao);
    }
}

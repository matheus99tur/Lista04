package br.edu.up.tela;

import java.util.Scanner;

import br.edu.up.controles.ClienteEmpresaController;
import br.edu.up.controles.ClientePessoaController;
import br.edu.up.modelos.ClienteEmpresa;
import br.edu.up.modelos.ClientePessoa;

public class Programa {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    ClientePessoaController clientePessoaController = new ClientePessoaController();
    ClienteEmpresaController clienteEmpresaController = new ClienteEmpresaController();

    int opcao;
    ClientePessoa clientePessoa = null;
    ClienteEmpresa clienteEmpresa = null;

    do {
      System.out.println("Selecione uma opção:");
      System.out.println("1. Incluir cliente pessoa");
      System.out.println("2. Incluir cliente empresa");
      System.out.println("3. Mostrar dados cliente pessoa");
      System.out.println("4. Mostrar dados cliente empresa");
      System.out.println("5. Emprestar para cliente pessoa");
      System.out.println("6. Emprestar para cliente empresa");
      System.out.println("7. Devolução de cliente pessoa");
      System.out.println("8. Devolução de cliente empresa");
      System.out.println("9. Sair");

      opcao = scanner.nextInt();
      scanner.nextLine(); // Limpar o buffer do scanner

      switch (opcao) {
        case 1:
          System.out.println("Nome:");
          String nome = scanner.nextLine();
          System.out.println("Telefone:");
          String telefone = scanner.nextLine();
          System.out.println("Email:");
          String email = scanner.nextLine();
          System.out.println("Rua:");
          String rua = scanner.nextLine();
          System.out.println("Número:");
          String numero = scanner.nextLine();
          System.out.println("Bairro:");
          String bairro = scanner.nextLine();
          System.out.println("CEP:");
          String cep = scanner.nextLine();
          System.out.println("Cidade:");
          String cidadeNome = scanner.nextLine();
          System.out.println("UF:");
          String cidadeUF = scanner.nextLine();
          System.out.println("Valor máximo de crédito:");
          double vlrMaxCredito = scanner.nextDouble();
          scanner.nextLine(); // Limpar o buffer do scanner
          System.out.println("CPF:");
          String CPF = scanner.nextLine();
          System.out.println("Peso:");
          double peso = scanner.nextDouble();
          System.out.println("Altura:");
          double altura = scanner.nextDouble();
          clientePessoa = clientePessoaController.criarClientePessoa(nome, telefone, email, rua, numero, bairro, cep,
              cidadeNome, cidadeUF, vlrMaxCredito, CPF, peso, altura);
          System.out.println("Cliente pessoa cadastrado com sucesso!\n");
          break;
        case 2:
          System.out.println("Nome:");
          nome = scanner.nextLine();
          System.out.println("Telefone:");
          telefone = scanner.nextLine();
          System.out.println("Email:");
          email = scanner.nextLine();
          System.out.println("Rua:");
          rua = scanner.nextLine();
          System.out.println("Número:");
          numero = scanner.nextLine();
          System.out.println("Bairro:");
          bairro = scanner.nextLine();
          System.out.println("CEP:");
          cep = scanner.nextLine();
          System.out.println("Cidade:");
          cidadeNome = scanner.nextLine();
          System.out.println("UF:");
          cidadeUF = scanner.nextLine();
          System.out.println("Valor máximo de crédito:");
          vlrMaxCredito = scanner.nextDouble();
          scanner.nextLine(); // Limpar o buffer do scanner
          System.out.println("CNPJ:");
          String CNPJ = scanner.nextLine();
          System.out.println("Inscrição Estadual:");
          String inscEstadual = scanner.nextLine();
          System.out.println("Ano de Fundação:");
          int anoFundacao = scanner.nextInt();
          scanner.nextLine(); // Limpar o buffer do scanner
          clienteEmpresa = clienteEmpresaController.criarClienteEmpresa(nome, telefone, email, rua, numero, bairro, cep,
              cidadeNome, cidadeUF, vlrMaxCredito, CNPJ, inscEstadual, anoFundacao);
          System.out.println("Cliente empresa cadastrado com sucesso!\n");
          break;
        case 3:
          if (clientePessoa != null) {
            System.out.println(clientePessoa.getDados());
          } else {
            System.out.println("Cliente pessoa não cadastrado.");
          }
          break;
        case 4:
          if (clienteEmpresa != null) {
            System.out.println(clienteEmpresa.getDados());
          } else {
            System.out.println("Cliente empresa não cadastrado.");
          }
          break;
        case 5:
          if (clientePessoa != null) {
            System.out.println("Informe o valor do empréstimo:");
            double valorEmprestimo = scanner.nextDouble();
            clientePessoa.emprestar(valorEmprestimo);
          } else {
            System.out.println("Cliente pessoa não cadastrado.");
          }
          break;
        case 6:
          if (clienteEmpresa != null) {
            System.out.println("Informe o valor do empréstimo:");
            double valorEmprestimo = scanner.nextDouble();
            clienteEmpresa.emprestar(valorEmprestimo);
          } else {
            System.out.println("Cliente empresa não cadastrado.");
          }
          break;
        case 7:
          if (clientePessoa != null) {
            System.out.println("Informe o valor da devolução:");
            double valorDevolucao = scanner.nextDouble();
            double valorDevolvido = clientePessoa.devolver(valorDevolucao);
            System.out.println("Valor devolvido: R$ " + valorDevolvido);
          } else {
            System.out.println("Cliente pessoa não cadastrado.");
          }
          break;
        case 8:
          if (clienteEmpresa != null) {
            System.out.println("Informe o valor da devolução:");
            double valorDevolucao = scanner.nextDouble();
            double valorDevolvido = clienteEmpresa.devolver(valorDevolucao);
            System.out.println("Valor devolvido: R$ " + valorDevolvido);
          } else {
            System.out.println("Cliente empresa não cadastrado.");
          }
          break;
        case 9:
          System.out.println("Saindo...");
          break;
        default:
          System.out.println("Opção inválida!");
          break;
      }
    } while (opcao != 9);

    scanner.close();
  }
}

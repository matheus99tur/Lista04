package br.edu.up.modelos;

public class ClientePessoa extends Cliente {
  private String CPF;
  private double peso;
  private double altura;

  public ClientePessoa(String nome, String telefone, String email, Endereco endereco, double vlrMaxCredito, String CPF, double peso, double altura) {
      super(nome, telefone, email, endereco, vlrMaxCredito);
      this.CPF = CPF;
      this.peso = peso;
      this.altura = altura;
  }

  public String getCPF() {
      return CPF;
  }

  public void setCPF(String CPF) {
      this.CPF = CPF;
  }

  public double getPeso() {
      return peso;
  }

  public void setPeso(double peso) {
      this.peso = peso;
  }

  public double getAltura() {
      return altura;
  }

  public void setAltura(double altura) {
      this.altura = altura;
  }

  public double getVlrEmprestado() {
      return vlrEmprestado;
  }

  public void setVlrEmprestado(double vlrEmprestado) {
      this.vlrEmprestado = vlrEmprestado;
  }

  public void emprestar(double valor) {
      if (valor > 0 && (vlrEmprestado + valor) <= vlrMaxCredito) {
          vlrEmprestado += valor;
          System.out.println("Empréstimo realizado com sucesso!");
      } else {
          System.out.println("Valor indisponível para empréstimo.");
      }
  }

  public double devolver(double valor) {
      if (valor > 0 && valor <= vlrEmprestado) {
          vlrEmprestado -= valor;
          System.out.println("Devolução realizada com sucesso!");
          return valor;
      } else {
          System.out.println("Valor inválido para devolução.");
          return 0;
      }
  }

  @Override
  public double getSaldo() {
      return vlrMaxCredito - vlrEmprestado;
  }

  public String getDados() {
      return "Nome: " + nome + "\nTelefone: " + telefone + "\nEmail: " + email + "\nEndereço: " + endereco.toString() +
              "\nCPF: " + CPF + "\nPeso: " + peso + " kg\nAltura: " + altura + " m" + "\nSaldo devedor: R$ " + vlrEmprestado;
  }
}

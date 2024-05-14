package br.edu.up.modelos;

public class ClienteEmpresa  extends Cliente{
  private String CNPJ;
    private String inscEstadual;
    private int anoFundacao;

    public ClienteEmpresa(String nome, String telefone, String email, Endereco endereco, double vlrMaxCredito, String CNPJ, String inscEstadual, int anoFundacao) {
        super(nome, telefone, email, endereco, vlrMaxCredito);
        this.CNPJ = CNPJ;
        this.inscEstadual = inscEstadual;
        this.anoFundacao = anoFundacao;
    }

    public String getCNPJ() {
        return CNPJ;
    }

    public void setCNPJ(String CNPJ) {
        this.CNPJ = CNPJ;
    }

    public String getInscEstadual() {
        return inscEstadual;
    }

    public void setInscEstadual(String inscEstadual) {
        this.inscEstadual = inscEstadual;
    }

    public int getAnoFundacao() {
        return anoFundacao;
    }

    public void setAnoFundacao(int anoFundacao) {
        this.anoFundacao = anoFundacao;
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
                "\nCNPJ: " + CNPJ + "\nInscrição Estadual: " + inscEstadual + "\nAno de Fundação: " + anoFundacao + 
                "\nSaldo devedor: R$ " + vlrEmprestado;
    }
}

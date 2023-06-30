package modelos;

import interfaces.IConta;

public class Conta {
    private String nomeCliente;
    private String cpfCliente;
    private String dataCadastro;
    private double saldo;

    public Conta(String nomeCliente, String cpfCliente, String dataCadastro, double saldo) {
        this.nomeCliente = nomeCliente;
        this.cpfCliente = cpfCliente;
        this.dataCadastro = dataCadastro;
        this.saldo = saldo;
    }

    public String getSaldoDisponivel() {
        return "Saldo Disponivel: " +this.saldo;
    }
    public String getDataCadastro() {
        return "Cadastro Feito Em: "+ this.dataCadastro;
    }
    public String getNomeCliente() {
        return "Nome do Cliente: " + this.nomeCliente;
    }
    public String getCPFCliente() {
        return "CPF do Cliente: "+ this.cpfCliente;
    }
    public String getInformacoesConta () {
        return getNomeCliente()+"\n"+getCPFCliente()+"\n"+getDataCadastro()+"\n"+getSaldoDisponivel();

    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public String getCpfCliente() {
        return cpfCliente;
    }

    public void setCpfCliente(String cpfCliente) {
        this.cpfCliente = cpfCliente;
    }

    public void setDataCadastro(String dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}

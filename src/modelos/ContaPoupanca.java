package modelos;

import interfaces.IConta;

public class ContaPoupanca extends Conta implements IConta {

    public ContaPoupanca(String nomeCliente, String cpfCliente, String dataCadastro, double saldo) {
        super(nomeCliente, cpfCliente, dataCadastro, saldo);
    }

    @Override
    public void depositar(double valor) {
        setSaldo(getSaldo()+valor);
    }

    @Override
    public void sacar(double valor) {
        setSaldo(getSaldo()-valor);
    }
}

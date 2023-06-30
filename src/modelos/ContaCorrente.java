package modelos;

import interfaces.IConta;

public class ContaCorrente extends Conta implements IConta {


    public ContaCorrente(String nomeCliente, String cpfCliente, String dataCadastro, double saldo) {
        super(nomeCliente, cpfCliente, dataCadastro, saldo);
    }

    @Override
    public void depositar(double valor) {
        setSaldo(getSaldo()+ valor);
    }

    @Override
    public void sacar(double valor) {
        setSaldo(getSaldo()-(valor+0.5));
    }
}

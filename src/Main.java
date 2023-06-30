import modelos.Conta;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String nome = "Jose";
        String cpf = "000.000.000-00";
        String tipoConta = "Corrente";
        String dataCadastro = "dd/MM/yyyy";
        double saldo = 1599.99;
        int opcao = 0;
        Conta conta = new Conta(nome,cpf,dataCadastro,saldo);
        System.out.println("*********************************");
        System.out.println(conta.getInformacoesConta());
        System.out.println("*********************************");

        String menu = """
                ** Digite sua Opção: **
                1 - Consultar Saldo
                2 - Transferir Valor
                3 - Receber Valor
                4 - Sair
                """;
        Scanner leitor = new Scanner(System.in);
        while(opcao != 4){
            System.out.printf("\n\n"+menu);
            opcao = leitor.nextInt();

            if(opcao==1) {
                System.out.printf("\nO saldo atualizado é: " + conta.getSaldo());
            }else if(opcao == 2){
                System.out.printf("\nValor da transferência: ");
                double valor = leitor.nextDouble();
                if (valor > saldo) {
                    System.out.printf("\nNão há saldo para realizar a tranferência");
                } else {
                    saldo -= valor;
                    System.out.printf("\nNovo Saldo: "+saldo);
                }
            }else if(opcao == 3) {
                System.out.printf("\nValor Recebido: ");
                double novoValor = leitor.nextDouble();
                saldo += novoValor;
                System.out.printf("\nNovo Saldo: "+saldo);
            }else if(opcao != 4) {
                System.out.printf("\nOpção Inválida");
            }
        }

    }
}
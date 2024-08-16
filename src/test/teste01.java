package test;

import dominio.Banco;
import dominio.ContaBancaria;

public class teste01 {
    public static void main(String[] args) {
        Banco banco = new Banco();

        ContaBancaria contaBancaria = new ContaBancaria("marcelo", "202");
        ContaBancaria contaBancaria1 = new ContaBancaria("tiago", "300");
        ContaBancaria contaBancaria3 = new ContaBancaria("davi", "002");

        banco.adicionarConta(contaBancaria);
        banco.adicionarConta(contaBancaria1);
        banco.adicionarConta(contaBancaria3);

        ContaBancaria conta1 = banco.buscarConta("202");
        ContaBancaria conta2 = banco.buscarConta("002");
        ContaBancaria conta3 = banco.buscarConta("300");


        System.out.println(conta1.verificarSaldo());

        conta1.depositar(1000);

        System.out.println(conta1.verificarSaldo());

        conta1.sacar(50);

        System.out.println(conta1.verificarSaldo());

        conta1.transferir(conta2, 50);

        System.out.println("saldo conta 1: " + conta1.verificarSaldo());

        System.out.println("saldo conta 2: " + conta2.verificarSaldo());

        banco.listarContas();


    }
}

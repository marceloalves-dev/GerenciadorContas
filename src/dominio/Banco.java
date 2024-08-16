package dominio;

import java.util.ArrayList;

public class Banco {
    ArrayList<ContaBancaria> contas = new ArrayList<>();

    public void adicionarConta(ContaBancaria conta) {
        contas.add(conta);
    }

    public ContaBancaria buscarConta(String numeroConta) {
        for (ContaBancaria conta : contas) {
            if (conta.getNumeroConta() == numeroConta) {
                return conta;
            }
        }
        System.out.println("conta nao encontrada");
        return null;
    }

    public void listarContas() {
        for (ContaBancaria conta : contas) {
            System.out.print("Conta: { ID " + conta.getNumeroConta() + ", Titular ");
            System.out.print(conta.getTitular() + ", Saldo R$");
            System.out.println(conta.verificarSaldo() + "}");
        }
    }
}

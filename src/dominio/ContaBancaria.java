package dominio;

public class ContaBancaria {
    private String titular;
    private String numeroConta;
    private double saldo;

    public ContaBancaria(String titular, String numeroConta) {
        this.titular = titular;
        this.numeroConta = numeroConta;
    }

    public void depositar(double valor) {
        if (valor <= 0) return;
        this.saldo += valor;
    }

    public void sacar(double valor) {
        if (valor <= 0 && valor > saldo) {
            System.out.println("saldo indisponivel");
        } else {
            saldo -= valor;
        }
    }

    public double verificarSaldo() {
        return saldo;
    }

    public void transferir(ContaBancaria contaDestino, double valor) {
        if (valor <= 0 && valor > saldo) return;
        saldo -= valor;
        contaDestino.depositar(valor);
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }

}

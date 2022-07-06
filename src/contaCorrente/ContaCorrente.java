package contaCorrente;

public class ContaCorrente {

    String numeroDaConta;
    String nomeDoCorrentista;
    double saldo = 0;

    public ContaCorrente(String numeroDaConta, String nomeDoCorrentista, double saldo) {
        this.numeroDaConta = numeroDaConta;
        this.nomeDoCorrentista = nomeDoCorrentista;
        this.saldo = saldo;
    }

    public ContaCorrente(String numeroDaConta, String nomeDoCorrentista) {
        this.numeroDaConta = numeroDaConta;
        this.nomeDoCorrentista = nomeDoCorrentista;
    }
}

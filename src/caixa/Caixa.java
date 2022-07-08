package caixa;

public class Caixa {
    double saldo;

    public Caixa() {
        this.saldo = 1000;
    }

    public double credito(double valor){
        return saldo=this.saldo+valor;
    }

    public double debito(double valor){
        return saldo=this.saldo-valor;
    }

    public double getSaldo() {
        return saldo;
    }
}

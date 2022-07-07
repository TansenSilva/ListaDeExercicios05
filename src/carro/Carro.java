package carro;

public class Carro {
    int quantidadeDePortas;
    double potencia = 2.0;
    String modelo;
    String marca;

    boolean ligaCarro;

    public Carro(int quantidadeDePortas, double potencia, String modelo, String marca,boolean ligaCarro) {
        this.quantidadeDePortas = quantidadeDePortas;
        this.potencia = potencia;
        this.modelo = modelo;
        this.marca = marca;
        this.ligaCarro = false;
    }

    public Carro(int quantidadeDePortas, String modelo, String marca) {
        this.quantidadeDePortas = quantidadeDePortas;
        this.modelo = modelo;
        this.marca = marca;
    }

    public void ligarCarro(){
        this.ligaCarro = true;
        System.out.println("O carro está ligado: "+ligaCarro);
    }

    public Carro() {

    }
}

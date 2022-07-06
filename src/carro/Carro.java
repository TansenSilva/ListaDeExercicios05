package carro;

public class Carro {
    int quantidadeDePortas;
    double potencia = 2.0;
    String modelo;
    String marca;

    public Carro(int quantidadeDePortas, double potencia, String modelo, String marca) {
        this.quantidadeDePortas = quantidadeDePortas;
        this.potencia = potencia;
        this.modelo = modelo;
        this.marca = marca;
    }

    public Carro(int quantidadeDePortas, String modelo, String marca) {
        this.quantidadeDePortas = quantidadeDePortas;
        this.modelo = modelo;
        this.marca = marca;
    }

    public Carro() {

    }
}

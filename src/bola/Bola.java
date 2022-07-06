package bola;

public class Bola {
    double circunferencia;
    double velocidade;
    String cor;
    String marca;

    String material;

    public Bola(double circunferencia, double velocidade, String cor, String marca) {
        this.circunferencia = circunferencia;
        this.velocidade = velocidade;
        this.cor = cor;
        this.marca = marca;
    }

    public Bola(double circunferencia, String cor, String material) {
        this.circunferencia = circunferencia;
        this.cor = cor;
        this.material = material;
    }

    public String mostraCor (){
        System.out.println(cor);
        return cor;
    }

    public String trocaCor () {
        if (cor != "branco") {
            cor = "branco";
        } else {
            cor = "verde";
        }
        return cor;
    }
}




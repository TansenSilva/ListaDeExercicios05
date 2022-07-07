package quadrado;

import java.util.Scanner;

public class Quadrado {

    double tamanhoDoLado;

    public Quadrado(double tamanhoDoLado) {
        this.tamanhoDoLado = tamanhoDoLado;
    }

    public Quadrado(){

    }

    public double getTamanhoDoLado() {
        return tamanhoDoLado;
    }

    public void setTamanhoDoLado(double tamanhoDoLado) {
        this.tamanhoDoLado = tamanhoDoLado;
    }

    public void mudarValorDoLado(){
        Scanner input = new Scanner(System.in);
        System.out.print("Digite o novo tamanho do Lado do Quadrado: ");
        tamanhoDoLado=input.nextDouble();
    }

    public Double retornarValorDoLado(){
        return tamanhoDoLado;
    }

    public void calculoAreaDoQuadrado(){
        double area = tamanhoDoLado * tamanhoDoLado;
        System.out.println(area);
    }


}

package retangulo;

import java.util.Scanner;

public class Retangulo {

    double base;
    double altura;

    public Retangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public void mudarValorDosLados(){
        Scanner input = new Scanner(System.in);
        System.out.print("Digite o novo tamanho da base: ");
        base=input.nextDouble();
        System.out.print("Digite o novo tamanho da altura: ");
        altura= input.nextDouble();
    }

    public void retornarValorLados(){
        System.out.println("O valor da Base é: "+base);
        System.out.println("O valor da Altura é: "+altura);
    }

    public double calculoAreaDoRetangulo() {
        return base * altura;
    }

    public double calculoPerimetroRetangulo(){
        return base+base+altura+altura;
    }


}

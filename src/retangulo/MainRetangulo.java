package retangulo;

import quadrado.Quadrado;

import java.util.Scanner;

public class MainRetangulo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int troca = 0;
        Retangulo retangulo1 = new Retangulo(12,18);
        //retornando os valores
        retangulo1.retornarValorLados();

        // mudança dos valores dos lados do retângulo

        System.out.print("Deseja alterar os valores dos lados do retângulo? (1) Sim (2) Não: ");
        troca = input.nextInt();

        switch (troca){
            case 1:
                retangulo1.mudarValorDosLados();
                break;
            case 2:
                System.out.println("Valores não foram alterados");
                break;
            default:
                System.out.println("Valor inválido: Os valores não foram alterados");
        }
        //retornando os novos valores
        retangulo1.retornarValorLados();

        //calculo da área do retangulo
        System.out.println("A área do retangulo é: "+retangulo1.calculoAreaDoRetangulo());

        //calculo do perímetro do retangulo
        System.out.println("O perímetro do retangulo é: "+retangulo1.calculoPerimetroRetangulo());

    }
}

package quadrado;

import java.util.Scanner;

public class MainQuadrado {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Quadrado quadrado1 = new Quadrado(15);
        String mudanca;
        System.out.println("O tamanho do lado do quadrado é: " + quadrado1.retornarValorDoLado());

        //mudar valor tamanho lado do quadrado
        System.out.println("Você gostaria de mudar o tamanho dos lados do quadrado? S/N");
        mudanca = input.next();
        if (mudanca.equals("S")){
            quadrado1.mudarValorDoLado();
        }else{
            System.out.println("Ok! O valor permanecerá o mesmo.");
        }

        //calculo da área do quadrado
        System.out.println("A área do quadrado é: ");
        quadrado1.calculoAreaDoQuadrado();

    }
}

package caixa;

import java.util.Scanner;

public class MainCaixa {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Caixa caixa = new Caixa();
        int escolha = 0;
        int lancamentos;

        System.out.print("Digite quantos lançamentos você deseja fazer: ");
        lancamentos= input.nextInt();

        for (int i=0;i<lancamentos;i++) {

            System.out.print("Escolha do tipo de lançamento: (1) para crédito (2) para débito: ");
            escolha = input.nextInt();
            switch (escolha) {
                case 1:
                    System.out.print("Digite o valor do lançamento: ");
                    caixa.credito(input.nextDouble());
                    break;
                case 2:
                    System.out.print("Digite o valor do lançamento: ");
                    caixa.debito(input.nextDouble());
                    break;
                default:
                    System.out.println("Valor inválido");

            }
            System.out.println("Saldo parcial: R$"+caixa.getSaldo());
        }
        System.out.println();
        System.out.println("O valor final do saldo é: R$ "+caixa.getSaldo());




    }
}

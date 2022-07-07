package carro;

public class MainCarro {
    public static void main(String[] args) {
        Carro carro1 = new Carro(4,1.0,"gol","Volks",false);

        carro1.ligarCarro();

        Carro carro2 = new Carro(5,"Fusca","Volks");
        System.out.println(carro2.potencia);

    }
}

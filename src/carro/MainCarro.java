package carro;

public class MainCarro {
    public static void main(String[] args) {
        Carro carro1 = new Carro();
        carro1.marca = "Fiat";
        carro1.modelo = "Uno";
        carro1.quantidadeDePortas = 5;
        System.out.println("Especificações do Veículo\nMarca: "+carro1.marca + "\nModelo: "+carro1.modelo+ "\nQuantidade de Portas: "+carro1.quantidadeDePortas+"\nPotência: "+carro1.potencia);

        Carro carro2 = new Carro(5,"Fusca","Volks");
        System.out.println(carro2.potencia);

    }
}

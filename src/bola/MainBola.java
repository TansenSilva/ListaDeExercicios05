package bola;

public class MainBola {
    public static void main(String[] args) {
        Bola primeiraBola = new Bola(10,5,"Azul","Adidas");
        Bola segundaBola = new Bola(15,8,"Verde","Nike");
        Bola jabulani = new Bola(35,"branco","couro");

        System.out.println("Cor primeiraBola: "+primeiraBola.cor);
        System.out.println("Marca primeiraBola: "+primeiraBola.marca);
        System.out.println("Cor segundaBola: "+segundaBola.cor);
        System.out.println("Marca segundaBola: "+segundaBola.marca);

        System.out.println("A cor da Jabulani é: "+jabulani.mostraCor());
        System.out.println("A nova cor da Jabulani é: "+jabulani.trocaCor());
        jabulani.mostraCor();






    }
}

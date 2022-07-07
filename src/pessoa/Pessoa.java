package pessoa;

public class Pessoa {
    String nome;
    int idade;
    double peso = 0;
    double altura;

    public Pessoa(String nome, int idade, double peso, double altura) {
        this.nome = nome;
        this.idade = idade;
        this.peso = peso;
        this.altura = altura;
    }
    public Pessoa(String nome, int idade, double altura) {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
    }
    public void envelhecer(){
        this.idade +=1;
        if (idade<21){
            altura = altura + 0.05;
        }
    }
    public void engordar(double peso) {
        this.peso += peso;
    }
    public void emagrecer(double peso) {
        this.peso -= peso;
    }

}
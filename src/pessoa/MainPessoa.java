package pessoa;

public class MainPessoa {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("Tansen",33,1.75);
        Pessoa pessoa2 = new Pessoa("Bruce",25,87,1.85);
        Pessoa pessoa3 = new Pessoa("Zé",18,1.58);

        System.out.println("o peso do "+pessoa2.nome+" é: "+pessoa2.peso);
        pessoa2.emagrecer(10);
        System.out.println("Seu novo peso é: "+pessoa2.peso);
        pessoa2.engordar(8);
        System.out.println("Seu novo peso é: "+pessoa2.peso);
        System.out.println("a idade do "+pessoa2.nome+" é: "+pessoa2.idade);
        pessoa2.envelhecer();
        System.out.println("Sua nova idade é: "+pessoa2.idade);

        System.out.println("Idade: "+pessoa3.idade);
        System.out.println("Altura: "+pessoa3.altura);
        pessoa3.envelhecer();
        System.out.println("Idade: "+pessoa3.idade);
        System.out.println("Altura: "+pessoa3.altura);

    }
}

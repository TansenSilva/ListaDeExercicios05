package jardinagem;

public class MainJardinagem {
    public static void main(String[] args) {
        Jardinagem jardim = new Jardinagem("Jardim",3,50,40,34,14);
        jardim.usarAdubo();

        System.out.println(jardim.kilosAdubo);
        jardim.precoAdubo();
        System.out.println(jardim.precoAdubo);
        jardim.precoCorteGrama();
        System.out.println(jardim.valorCorteGrama);




    }


}

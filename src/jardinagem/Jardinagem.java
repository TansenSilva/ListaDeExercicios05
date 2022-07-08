package jardinagem;

public class Jardinagem {

    String nomeJardim;
    int qtdPlantas;
    double qtdMetros;
    double qtdMetrosGrama;
    double kilosAdubo;
    double valorAdubo;
    double valorMetroGrama;
    double valorCorteGrama;
    double precoAdubo;

    public Jardinagem(String nomeJardim, int qtdPlantas, double qtdMetros, double qtdMetrosGrama, double valorAdubo,double valorMetroGrama) {
        this.nomeJardim = nomeJardim;
        this.qtdPlantas = qtdPlantas;
        this.qtdMetros = qtdMetros;
        this.qtdMetrosGrama = qtdMetrosGrama;
        this.valorAdubo = valorAdubo;
        this.valorMetroGrama = valorMetroGrama;
    }

    public double usarAdubo(){
        this.kilosAdubo = (this.qtdMetrosGrama/2)*0.100;
        return kilosAdubo;
    }
    public double precoAdubo(){
        this.precoAdubo = kilosAdubo*valorAdubo;
        return precoAdubo;
    }

    public double precoCorteGrama(){
        valorCorteGrama = qtdMetrosGrama*valorMetroGrama;
        return valorCorteGrama;
    }

}

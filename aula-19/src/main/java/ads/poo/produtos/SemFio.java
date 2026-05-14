package ads.poo.produtos;

public class SemFio extends Telefone {
    private double frequencia;
    private int canais;
    private double distanciaOperacao;

    public SemFio(Dimensao dimensao, double peso, String modelo, String numSerie, int codigo, double distanciaOperacao, int canais, double frequencia) {
        super(dimensao, peso, modelo, numSerie, codigo);
        this.distanciaOperacao = distanciaOperacao;
        this.canais = canais;
        this.frequencia = frequencia;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nDistancia Operação: " + distanciaOperacao +
                "\nCanais: " + canais +
                "\nFrequencia: " + frequencia;
    }
}

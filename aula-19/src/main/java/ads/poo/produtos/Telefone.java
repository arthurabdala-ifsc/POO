package ads.poo.produtos;

public class Telefone {
    protected int codigo;
    protected String numSerie;
    protected String modelo;
    protected double peso;
    protected Dimensao dimensao;

    public Telefone(Dimensao dimensao, double peso, String modelo, String numSerie, int codigo) {
        this.dimensao = dimensao;
        this.peso = peso;
        this.modelo = modelo;
        this.numSerie = numSerie;
        this.codigo = codigo;
    }

    @Override
    public String toString() {
        return "Codigo: " + codigo +
                "\nNumero de Serie: " + numSerie +
                "\nModelo: " + modelo +
                "\nPeso: " + peso +
                "\nDimensao: " + dimensao;
    }
}

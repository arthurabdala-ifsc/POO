package ads.poo.produtos;

public class Dimensao {
    private double largura;
    private double altura;

    public Dimensao(double largura, double altura) {
        this.largura = largura;
        this.altura = altura;
    }

    @Override
    public String toString() {
        return "\nLargura: " + largura +
                "\naltura: " + altura;
    }
}

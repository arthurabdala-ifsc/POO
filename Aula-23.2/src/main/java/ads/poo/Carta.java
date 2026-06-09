package ads.poo;


public class Carta {

    private Numero numero;
    private Naipe naipe;

    public Carta(Numero numero, Naipe naipe) {
        this.numero = numero;
        this.naipe = naipe;
    }

    @Override
    public String toString() {
        return numero.ordem + naipe.inicial + ".png";
    }
}

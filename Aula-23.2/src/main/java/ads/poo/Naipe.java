package ads.poo;

public enum Naipe {
    OUROS(1,'o'),
    ESPADAS(2,'e'),
    COPAS(3,'c'),
    PAUS(4,'p');

    public final int valor;
    public final char inicial;

    Naipe(int valor, char inicial){
        this.valor = valor;
        this.inicial = inicial;
    }


}

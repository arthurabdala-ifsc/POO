package ads.poo;

public enum Numero {
    AS(1,"1"),
    DOIS(2,"2"),
    TRES(3,"3"),
    CINCO(5,"5"),
    SEIS(6,"6"),
    SETE(7,"7"),
    OITO(8,"8"),
    NOVE(9,"9"),
    DEZ(10,"10"),
    VALETE(11,"j"),
    DAMA(11,"q"),
    REI(12,"k");


    public final int valor;
    public final String ordem;

    Numero(int valor, String ordem){
        this.valor = valor;
        this.ordem = ordem;
    }


}

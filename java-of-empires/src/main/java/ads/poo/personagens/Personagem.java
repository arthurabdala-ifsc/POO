package ads.poo.personagens;

public class Personagem {
    protected int vida;
    protected int ataque;
    protected double velocidade;

    public Personagem(int vida, int ataque, double velocidade) {
        this.vida = vida;
        this.ataque = ataque;
        this.velocidade = velocidade;
    }

    public String atacar(){
        return "";
    }

    public String mover(){
        return "";
    }
}

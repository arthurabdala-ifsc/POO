package ads.poo.personagens;

public class Arqueiro extends Personagem {
    public Arqueiro() {
        super(35,2,1);
    }

    @Override
    public String atacar() {
        return "Arqueiro atacando com força " + super.ataque;
    }

    public String mover(){
        return "Arqueiro movendo-se com velocidade " + super.velocidade;
    }
}

package ads.poo.personagens;

public class Cavaleiro extends Personagem {
    public Cavaleiro() {
        super(50,3,2);
    }

    @Override
    public String atacar() {
        return "Cavaleiro atacando com força " + super.ataque;
    }

    public String mover(){
        return "Cavaleiro movendo-se com velocidade " + super.velocidade;
    }
}

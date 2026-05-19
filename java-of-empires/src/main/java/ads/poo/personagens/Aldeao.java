package ads.poo.personagens;

public class Aldeao extends Personagem implements Guerreiro {
    public Aldeao() {
        super(25,1,0.8);
    }

    @Override
    public String atacar() {
        return "Aldeao atacando com força " + super.ataque;
    }

    public String mover(){
        return "Aldeao movendo-se com velocidade " + super.velocidade;
    }

}

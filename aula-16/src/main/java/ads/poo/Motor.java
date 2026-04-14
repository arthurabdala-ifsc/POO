package ads.poo;

public class Motor {
    private int hp;
    private int giroAtual;
    private int cilindros;

    public Motor() {
        this.cilindros = 144;
        this.giroAtual = 4;
        this.hp = 0;
    }

    void acelerar(int v){
        giroAtual++;
    }
}

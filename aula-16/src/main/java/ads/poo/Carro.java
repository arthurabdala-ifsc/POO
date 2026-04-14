package ads.poo;

public class Carro {
    private String marca;
    private Motor propulsor;

    public Carro(String marca, Motor propulsor) {
        this.marca = marca;
        this.propulsor = propulsor;
    }

    void acelerar(int v){
        this.propulsor.acelerar(v);
    }

    void trocarMotor(Motor m){
        this.propulsor = m;
    }
}

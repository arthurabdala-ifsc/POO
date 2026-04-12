package ads.poo;

import java.util.Random;

public class Main {
    static void main() {
        Random r = new Random();
        int sorteio = (r.nextInt(100) + 1);
        int tentativa = 0;
        int numero;

        do {
            numero = Integer.parseInt(IO.readln("Adivinhe o numero sorteado: "));
            tentativa++;
            IO.println((numero < sorteio) ? "O numero sorteado eh maior" : "O numero sorteado eh menor");
        } while (numero != sorteio);

        IO.println("Parabens, voce acertou!");
        IO.println("Tentativas: " + tentativa);
    }
}

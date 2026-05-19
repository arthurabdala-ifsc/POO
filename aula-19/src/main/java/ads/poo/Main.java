package ads.poo;

import ads.poo.produtos.Dimensao;
import ads.poo.produtos.SemFio;
import ads.poo.produtos.Telefone;

public class Main {
    void main(){

        Dimensao dimensao = new Dimensao(10,5);

        Telefone t = new Telefone(dimensao, 10.5, "teste", "123-x", 1);
        SemFio sf = new SemFio(dimensao,7.3,"iphone 7", "YA345", 2,25,5,2.4);
        Telefone a = new SemFio(dimensao,7.5,"moto g 8", "AT578", 3,22,5,2.4);

//        sf.getFrequencia();
//        ((SemFio)t).getFrequencia();

        Telefone[] vetor = new Telefone[3];

        vetor[0] = t;
        vetor[1] = sf;
        vetor[2] = a;

        for (Telefone aux : vetor){
            if (aux instanceof SemFio novo){
                IO.println(novo.getFrequencia());
            }
            IO.println(aux.getModelo());
        }

    }
}

package ads.poo;

import java.util.ArrayList;

public class Agenda {
    private ArrayList<Contato> contatos;

    public Agenda() {
        this.contatos = new ArrayList<>();
    }

    public boolean addContato(Contato c){
        if (c == null){
            return false;
        }

        if (!contatos.contains(c)){
            contatos.add(c);
            return true;
        }

        return false;
    }

    public ArrayList findContato(String nome, String sobrenome){

    }

    public boolean removeContato(int indiceContatoNaLista){

    }

    public boolean addTelefone(String rotulo, String valor, int indiceContatoNaLista){

    }

    public boolean addEmail(String rotulo, String valor, int indiceContatoNaLista){

    }

    public boolean updateTelefone(String rotulo, String valor, int indiceContatoNaLista){

    }

    public boolean updateEmail(String rotulo, String valor, int indiceContatoNaLista){

    }

    public boolean removeTelefone(String rotulo, String valor, int indiceContatoNaLista){

    }

    public boolean removeEmail(String rotulo, String valor, int indiceContatoNaLista){

    }

    public String toString(){
        return "";
    }

}

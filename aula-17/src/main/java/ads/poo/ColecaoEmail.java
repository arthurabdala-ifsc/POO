package ads.poo;

import java.util.HashMap;
import java.util.Map;

public class ColecaoEmail {

    private HashMap<String, String> dados;

    public ColecaoEmail(){
        this.dados = new HashMap<>();
    }

    public ColecaoEmail(HashMap<String, String> dados) {
        this.dados = dados;
    }

    public  boolean add(String rotulo, String valor){
        if (!dados.containsKey(rotulo)){
            if (emailValido(valor)) {
                dados.put(rotulo,valor);
                return true;
            }
        }
        return false;
    }

    public boolean remove(String rotulo){
        if (dados.containsKey(rotulo)){
            dados.remove(rotulo);
            return true;
        }
        return false;
    }

    public boolean update(String rotulo, String valor){
        if (dados.containsKey(rotulo)){
            if (emailValido(valor)) {
                dados.replace(rotulo, valor);
                return true;
            }
        }
        return false;
    }

    public boolean emailValido(String valor){
        String eR = "^[\\w-\\+]+(\\.[\\w]+)*@[\\w-]+(\\.[\\w]+)*(\\.[a-z]{2,})$";
        return valor != null && valor.matches(eR);
    }

    @Override
    public String toString(){
        if (dados.isEmpty()){
            return "Nenhum e-mail cadastrado.";
        }

        StringBuilder sb = new StringBuilder();
        sb.append("Emails:\n");

        for (Map.Entry<String, String> entrada : dados.entrySet()){
            sb.append(" - [").append(entrada.getKey()).append("]: ").append(entrada.getValue()).append("\n");
        }
        return sb.toString();
    }
}

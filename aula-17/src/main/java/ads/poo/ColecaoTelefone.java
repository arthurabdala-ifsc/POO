package ads.poo;

import java.util.HashMap;
import java.util.Map;

public class ColecaoTelefone {

    private HashMap<String, String> dados;

    public ColecaoTelefone() {
        this.dados = new HashMap<>();
    }

    public ColecaoTelefone(HashMap<String, String> dados) {
        this.dados = dados;
    }

    public  boolean add(String rotulo, String valor){
        if (!dados.containsKey(rotulo)){
            if (telefoneValido(valor)) {
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
            if (telefoneValido(valor)) {
                dados.replace(rotulo, valor);
                return true;
            }
        }
        return false;
    }

    public boolean telefoneValido(String valor){
        String eR = "^\\d{10,11}$";
        return valor != null && valor.matches(eR);
    }

    @Override
    public String toString(){
        if (dados.isEmpty()){
            return "Nenhum telefone cadastrado.";
        }

        StringBuilder sb = new StringBuilder();
        sb.append("Telefones:\n");

        for (Map.Entry<String, String> entrada : dados.entrySet()){
            String numeroPuro = entrada.getValue();
            String numeroFormatado;

            if (numeroPuro != null && numeroPuro.length() == 11){
                numeroFormatado = FormatadorUtil.formata("(##) #####-####", numeroPuro);
            } else if (numeroPuro != null && numeroPuro.length() == 10) {
                numeroFormatado = FormatadorUtil.formata("(##) ####-####", numeroPuro);
            } else {
                numeroFormatado = numeroPuro;
            }

            sb.append(" - [").append(entrada.getKey()).append("]: ").append(numeroFormatado).append("\n");
        }
        return sb.toString();
    }
}

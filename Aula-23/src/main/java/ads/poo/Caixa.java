package ads.poo;

public class Caixa<T>  {
    private T conteudo;

    public Caixa(T obj){
        this.conteudo = obj;
    }

    public void setConteudo(T conteudo) {
        this.conteudo = conteudo;
    }

    public T getConteudo() {
        return conteudo;
    }
}

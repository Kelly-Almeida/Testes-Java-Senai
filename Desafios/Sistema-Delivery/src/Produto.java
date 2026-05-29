public class Produto {
    private String nome;
    private float valor = 0;

    public Produto (String nome){
        this.nome = nome;

    }

    public String getNome(){
        return this.nome;
    }

    public float getValor(){
        return this.valor;
    }
}

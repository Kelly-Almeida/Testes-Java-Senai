public abstract class Produto {
    private String nome = null;
    private float valor;


    public abstract String getNome();

    public float getValor(){
        return this.valor;
    }

    public void setValor(float calcValor){
        this.valor = calcValor;
    }
}

public class Cerveja extends Produto{
    private String nome;
    private float valor;
    private String marca;

    public Cerveja (String marca){
        this.marca = marca;
        this.nome = "Cerveja " + getMarca();
        if (marca.equalsIgnoreCase("Brahma")) this.valor = 12;
        else if (marca.equalsIgnoreCase(""))
    }

    public String getMarca(){
        return this.marca;
    }
}

public class Cerveja extends Produto{
    private String nome;
    private float valor;
    private String marca;

    public Cerveja (String marca){
        this.marca = marca;
        this.nome = "Cerveja " + getMarca();
        float calcValor = 0;

        if (marca.equalsIgnoreCase("Brahma")) calcValor = 12;
        else if (marca.equalsIgnoreCase("Itaipava")) calcValor = 10;
        else if (marca.equalsIgnoreCase("Skol")) calcValor = 14;
        else if (marca.equalsIgnoreCase("Heineken")) calcValor = 16;
        else calcValor = 18;

        this.setValor(calcValor);
    }

    public String getMarca(){
        return this.marca;
    }

    @Override
    public String getNome(){return this.nome;}
}

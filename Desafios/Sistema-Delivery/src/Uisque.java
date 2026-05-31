public class Uisque extends Produto{
    private String nome, marca;
    private char tam;


    public Uisque (char tam){
        this.tam = tam;
        this.nome = "Uísque " + this.tam;
        float calcValor = 0;

        if (tam == 'P') calcValor = 25;
        else if (tam == 'M') calcValor = 40;
        else if (tam == 'G') calcValor = 55;

        this.setValor(calcValor);
    }

    @Override
    public String getNome() {
        return this.nome;
    }
}

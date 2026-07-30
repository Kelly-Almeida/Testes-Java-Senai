public class Pizza extends Produto{
    private String nome;
    private String sabor;
    private char tam;

    public Pizza(String sabor, char tam){
        float calcValor = 15;
        this.sabor = sabor;
        this.nome = "Pizza de " + getSabor();
        this.tam = tam;

        if (sabor.equalsIgnoreCase("Marguerita")){
            calcValor += 20;
        }else if (sabor.equalsIgnoreCase("Calabresa")){
            calcValor += 25;
        }else if(sabor.equalsIgnoreCase("Portuguesa")){
            calcValor += 30;
        }else {
            calcValor += 10;
        }

        if(tam == 'G'){
            calcValor *= 3;
        }else if(tam == 'M'){
            calcValor *= 2;
        }

        this.setValor(calcValor);
    }

    public String getSabor(){
        return this.sabor;
    }

    @Override
    public String getNome(){
        return this.nome;
    }
}

public class Pizza extends Produto{
    private String nome;
    private float valor;
    private String sabor;
    private char tam;

    public Pizza(String sabor, char tam){
        this.valor = 15;
        this.sabor = sabor;
        this.nome = "Pizza de " + getSabor();
        this.tam = tam;

        if (sabor.equalsIgnoreCase("Marguerita")){
            this.valor += 20;
        }else if (sabor.equalsIgnoreCase("Calabresa")){
            this.valor += 25;
        }else if(sabor.equalsIgnoreCase("Portuguesa")){
            this.valor += 30;
        }else {
            this.valor += 10;
        }

        if(tam == 'G'){
            this.valor *= 3;
        }else if(tam == 'M'){
            this.valor *= 2;
        }
    }

    public String getSabor(){
        return this.sabor;
    }

    @Override
    public String getNome(){
        return getNome() + " de " + getSabor();
    }
}

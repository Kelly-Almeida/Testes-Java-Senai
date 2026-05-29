public class Pizza extends Produto{
    private String nome;
    private float valor;
    private String sabor;
    private int tam;

    public Pizza(String nome, float valor, String sabor, int tam){
        super(nome);
        this.valor = 15;
        this.sabor = sabor;
        this.tam = tam;

        if (sabor.equalsIgnoreCase("Marguerita")){
            this.valor += 20;
        }else if (sabor.equalsIgnoreCase("Calabresa")){
            this.valor += 25;
        }else{
            this.valor += 30;
        }

        if(tam == 3){
            this.valor *= 3;
        }else if(tam == 2){
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

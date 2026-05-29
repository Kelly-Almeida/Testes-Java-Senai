public class Caipirinha extends Produto {
    private String nome;
    private float valor;
    private String sabor;

    public Caipirinha(String sabor){
        this.valor = 10;
        this.sabor = sabor;
        this.nome = "Caipirinha " + getSabor();

        if (sabor.equalsIgnoreCase("Limão")){
            this.valor += 10;
        }else if (sabor.equalsIgnoreCase("Morango")){
            this.valor += 15;
        }else if (sabor.equalsIgnoreCase("Maracujá")){
            this.valor += 12;
        }else if(sabor.equalsIgnoreCase("Mix")){
            this.valor += 18;
        }else{
            this.valor += 8;
        }
    }

    public String getSabor(){
        return this.sabor;
    }
    @Override
    public String getNome(){
        return this.nome + " de " + this.sabor;
    }

}

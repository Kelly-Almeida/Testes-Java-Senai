public class Caipirinha extends Produto {
    private String nome;
    private String sabor;

    public Caipirinha(String sabor){
        float calcValor = 10;
        this.sabor = sabor;
        this.nome = "Caipirinha " + getSabor();

        if (sabor.equalsIgnoreCase("Limão")){
            calcValor += 10;
        }else if (sabor.equalsIgnoreCase("Morango")){
            calcValor += 15;
        }else if (sabor.equalsIgnoreCase("Maracujá")){
            calcValor += 12;
        }else if(sabor.equalsIgnoreCase("Mix")){
            calcValor += 18;
        }else{
            calcValor += 8;
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

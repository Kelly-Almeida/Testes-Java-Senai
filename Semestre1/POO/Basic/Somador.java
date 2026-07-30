public class Somador {
    private int[] numeros;
    //numeros: atributo, que é a caracteristica da classe

    //Metodo construtor: permite qe outras classes utilizem os atributos da classe atual
    public Somador(int[] numeros){
        this.numeros = numeros;
        //this: referência os atributos da classe
    }

    //Metodo: são as ações e comportamentos da classe
    public int calcularSoma(){
        int soma = 0;

        //foreach: for reduzido (clean code)
        for (int n: numeros){
            soma += n;
        }
        return soma;
    }
}

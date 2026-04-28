public class teste2 {

    //Main(""): classe principal (onde tudo funciona)

    //Metodo principal de execução
    public static void main(String[] args){
        int[] numeros = {1,2,3,4,5};

        Somador soma = new Somador(numeros);
        //Somador é uma classe (estrutura do programa)
        //new "Somador": transformando a classe em objeto
        System.out.printf("Soma: %d", soma.calcularSoma());
    }
}

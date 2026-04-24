public class Aluno {
    private int id;
    private String nome;
    private int[] notas;


    public Aluno(int id,String nome, int[] notas) {
        this.id = id;
        this.nome = nome;
        this.notas = notas;
    }

    public void mostrarDados(){
        System.out.println("=====================");
        System.out.println("ID: " + id);
        System.out.println("Nome: " + nome);
    }

    public void mostrarNotas(){
        int soma = 0;

        System.out.println("Notas: ");
        for(int i:notas){
            System.out.printf("%d", notas[i]);
            soma = notas[i];
        }

        float media = soma/4;

        System.out.println("A média final foi de " + media);
    }
}

public class Aluno {
    private int id;
    private String nome;
    private float[] notas;


    public Aluno(int id,String nome, float[] notas) {
        this.id = id;
        this.nome = nome;
        this.notas = notas;
    }

    public int getId(){
        return this.id;
    }

    public void mostrarDados(){
        System.out.println("=====================");
        System.out.println("ID: " + id);
        System.out.println("Nome: " + nome);
    }

    public void mostrarNotas(){
        float soma = 0;

        System.out.println("Notas: ");
        for(int i = 0; i < 4; i++){
            System.out.printf("%d° - %.1f\n", (i + 1),notas[i]);
            soma += notas[i];
        }

        float media = soma/4;

        System.out.println("A média final foi de " + media);
    }
}

public class Burrinho extends Animal{
    private String nome;
    public Burrinho(String nome){
        super(nome);
    }

    @Override
    public void som() {
        System.out.println("\nIONNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN!");
    }

    @Override
    public void mostrarNipe() {
        System.out.println("\nVamos ver nosso burrinho "+setNome());
        System.out.println("Abra o link: ");
        System.out.println("https://www.youtube.com/watch?v=iMqOLvdJL-I");
    }
}

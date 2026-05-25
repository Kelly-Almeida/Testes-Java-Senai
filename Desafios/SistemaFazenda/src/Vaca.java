public class Vaca extends Animal{
    private String nome;

    public Vaca(String nome){
        super(nome);
    }

    @Override
    public void som() {
        System.out.println("\nMUUUUUUUUUUUUUUU!!");
    }

    @Override
    public void mostrarNipe() {
        System.out.println("\nVamos ver nossa vaquinha "+ setNome()+"...");
        System.out.println("Abra o link para ver: ");
        System.out.println("https://www.youtube.com/watch?v=U60CFySfhT4");
    }
}

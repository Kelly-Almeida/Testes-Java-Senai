public class Gato extends Animal{
    private String nome;
    public Gato (String nome){
        super(nome);
    }

    @Override
    public void som(){
        System.out.println("\nMIAUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU!!");
    }

    @Override
    public  void mostrarNipe(){
        System.out.println("\n*O " + setNome()+" sumiu...Você vê suas pegadas e vai atrás dele 🐾*");
        System.out.println("*Você vê algo...*");
        System.out.println("Abra o link para ver :");
        System.out.println("https://www.instagram.com/reel/DHfCA8Quxq1/?hl=pt-br");
    }
}

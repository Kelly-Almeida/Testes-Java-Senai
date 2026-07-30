public class Cachorro extends Animal{
    private String nome, raca;
    private int idade;

    public Cachorro (String raca, String nome, int idade){
        super(raca, nome, idade);

    }

    @Override
    public void som(){
        System.out.println("\nAU AU AU AU!!");
    }

    @Override
    public void mostrarNipe(){
        System.out.println("\n*" + setNome()+" vai até caixa de som*");
        System.out.println("Abra para ver: ");
        System.out.println("https://www.instagram.com/reel/DTQEeWOEQsC/?hl=pt-br");
    }
}

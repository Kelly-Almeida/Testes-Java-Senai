public class Cachorro extends Animal{
    private String nome;

    public Cachorro (String nome){
        super(nome);

    }

    @Override
    public void som(){
        System.out.println("\nAU AU AU AU!!");
    }

    @Override
    public void mostrarNipe(){
        System.out.println("\n*" + setNome()+" vai até caixa de som*");
        System.out.println("Abra para ver: ");
        System.out.println("https://www.reddit.com/r/FunnyAnimals/comments/1lcmdk7/is_this_dog_really_dancing/?tl=pt-br");
    }
}

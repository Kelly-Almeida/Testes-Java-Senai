public abstract class Animal {
    private String nome;

    public Animal (String nome){
        this.nome = nome;
    }

    public abstract void som();

    public abstract void mostrarNipe();

    public String setNome(){
        return this.nome;
    }
}

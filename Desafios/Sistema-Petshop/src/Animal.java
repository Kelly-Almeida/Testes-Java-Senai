public abstract class Animal {
    private String nome;
    private String raca;
    private int idade;

    public Animal (String raca, String nome, int idade){
        this.raca = raca;
        this.nome = nome;
        this.idade = idade;
    }

    public abstract void som();

    public abstract void mostrarNipe();

    public String setNome(){
        return this.nome;
    }
    public String setRaca(){return this.raca;}
    public int setIdade(){return this.idade;}
}

public class Pessoa {
    private String nome;
    private int idade;

    //Metodo: ação e comportamento
    //Metodo Construtor: inicializa os atributos
    public Pessoa(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }

    //Exibição de dados
    public void exibirInformacoes(){
        System.out.println("Nome: "+ nome);
        System.out.println("Idade: " + idade);
    }

    //Teste de maior de idade
    public boolean isMaiorDeIdade(){
        return idade >= 18;
    }
}

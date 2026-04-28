
public class teste1 {
   public static void main(String[] args){
        Gerente gerente = new Gerente("Graggle", 750.0, "Financeiro");

        Desenvolvedor dev = new Desenvolvedor("Levi", 5000.0, "Java");

        System.out.println("--- Dados do Gerente ---");
        System.out.println("Nome: " + gerente.getNome());
        gerente.trabalhar();
        gerente.aprovarVerba();

       System.out.println("--- Dados do desenolvedor ---");
       System.out.println("Nome: " + dev.getNome());
       dev.trabalhar();
       dev.programar();
   }
}

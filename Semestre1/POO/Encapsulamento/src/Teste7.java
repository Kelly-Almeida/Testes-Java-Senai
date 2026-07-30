public class Teste7 {
    public void main(String[] args){
        System.out.println("-- Gerenciando a bateria de um celular --");
        Celular celularX = new Celular();

        System.out.println("\nUsuando o Youtube por um tempo...");
        celularX.usar(20);

        System.out.println("\nJogando um jogo pesado...");
        celularX.usar(40);
        System.out.println("Bateria final após jogo: " + celularX.getNivelBateria() + "%");

        System.out.println("\nConnectando na tomada...");
        celularX.carregar(80);

        System.out.println("\nDeixando carregar mais um pouco...");
        celularX.carregar(30);
        System.out.println("Bateria final após carregar: " + celularX.getNivelBateria() + "%");
    }
}
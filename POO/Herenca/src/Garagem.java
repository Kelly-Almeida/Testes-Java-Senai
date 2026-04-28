public class Garagem {
    public static void main(String[] args){
        Carro meuCarro = new Carro("Toyto", "Corolla", 4);
        Motocicleta minhaMoto = new Motocicleta("Honda", "CB 500", 500);

        System.out.println("--- Ação com carro ---");
        meuCarro.ligar();
        meuCarro.abrirPortaMala();
        meuCarro.desligar();

        System.out.println("\n--- Ações com a Motocicleta ---");
        minhaMoto.ligar();
        minhaMoto.empinar();
        minhaMoto.desligar();
    }
}
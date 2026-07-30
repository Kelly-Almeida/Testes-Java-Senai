public class Teste6 {
    public static void main(String[] args){
        System.out.println("Criando e interagindo com meu fusca");

        Carro fusca = new Carro();

        System.out.println("\nTenando acelerar desligado...");
        fusca.acelerar(20);
        System.out.println("Velocidade atual do Fusca: " + fusca.getVelocidade() + " km/h");

        System.out.println("\nAgora vamos ligar o carro...");
        fusca.ligar();

        //tentando ligar já ligado
        fusca.ligar();

        System.out.println("\nAcelerando...");
        fusca.acelerar(15);
        fusca.acelerar(20);

        System.out.println("Velocidade atual do fusca: " + fusca.getVelocidade() + " km/h");

        System.out.println("\nFreando um pouco...");
        fusca.frear(10);

        System.out.println("Velocidade final do Fusca: " + fusca.getVelocidade() + " km/h");

        System.out.println("\n Vamos desligar nossa máquina");

        //Tentando desligar com aceleração superior a 0
        fusca.desligar();

        //Agora, como não somos loucos
        fusca.frear(fusca.getVelocidade());
        fusca.desligar();
    }
}
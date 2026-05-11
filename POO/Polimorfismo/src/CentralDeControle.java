public class CentralDeControle {
    //Este é o nosso "botão Play" polimórfisco
    //Ele aceita qualque objeto que seja um DispositivoDeMídia.
    public void apertar(DispositivoDeMidia dispositivo){
        System.out.println("Conectando ao dispositivo: " + dispositivo.nomeDoDispositivo);
        //O java se encarrega de chamar a versão CORRETA do metodo reproduzir(),
        //dependendo da forma real do objeto (TV, Celular ouRádio).
        dispositivo.reproduzir();
        System.out.println("---");
    }

    public static void main(String[] args){
        //Criando a nossa central de controle.
        CentralDeControle controle = new CentralDeControle();

        //Criando os objetos com suas fromas especificas.
        SmartTV tvDaSala = new SmartTV("TV da Sala", "Matrix");
        Celular meuCelular = new Celular("iphone 15", "Stairway to Heaven", "Led Zappelin");
        RadioAutomotivo radioDoCarro = new RadioAutomotivo("Rádio do carro", 98.9);

        //USANDO O POLIMORFISMO
        //O memso metodo 'apertarPlay' é chamado com objetos de tipos diferentes,
        //e cada um se comporta de sua própria maneira.
        controle.apertar(tvDaSala);
        controle.apertar(meuCelular);
        controle.apertar(radioDoCarro);

        System.out.println("\n--- Demonstração com uma Lista de Dispositivos ---");

        //Criando uma lista que pode gaurdar QUALQUER DispositivoDeMidia.
        DispositivoDeMidia[] meusDispositivos = {tvDaSala, meuCelular, radioDoCarro};

        //Usando o for-each para apertar o play em todos os dispositivos de lista
        for (DispositivoDeMidia dispositivo : meusDispositivos){
            //A cada volta, o Java identifica a forma e chama o metodo certo!
            dispositivo.reproduzir();
        }
    }
}

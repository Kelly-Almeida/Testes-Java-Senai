import java.util.Scanner;


//Classe principal (Modelo
class Notificacao{
    public void enviar(String mensagem){
        System.out.println("Enviando notificação...");

    }
}

class NotificacaoSMS extends Notificacao{
    public void enviar(String mensagem){
        System.out.println("\n[SMS] Enviando Torpedo...");
        System.out.println("Conteúdo: " + mensagem);
    }
}

class NotificacaoEmail extends Notificacao{
    public void enviar(String mensagem){
        System.out.println("\n[E-mail] Servindo SMTP conectado...");
        System.out.println("ASSUNTO: Alerta de Segurança.");
        System.out.println("CORPO: " + mensagem);
    }
}

class NotificacaoWhatsapp extends Notificacao{
    public void enviar(String mensagem){
    System.out.println("\n[WHATSAPP] Abrindo conversa...");
    System.out.println("Status: [...] Entregue");
    }

}

class NotificacaoPush extends Notificacao {
    public void enviar(String mensagem) {
        System.out.println("\n[PUSH NOTIFICATION] Push exibido no topo da tela: ");
        System.out.println(">> " + mensagem);
    }

}

public class Notificacoes {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        Notificacao canal = null;

        System.out.println("===========================================");
        System.out.println("\tCENTARL DE SEGURANÇA MULTICANAL");
        System.out.println("Com desejo receber receber o alerta? ");
        System.out.println("1 - SMS \n2- E-mail \n3 - Whatsapp \n4 -Push Mobile");
        int op = scan.nextInt();

        switch (op){
            case 1: canal = new NotificacaoSMS();break;
            case 2: canal = new NotificacaoEmail();break;
            case 3: canal = new NotificacaoWhatsapp();break;
            case 4: canal = new NotificacaoPush();break;
            default: System.out.println("Opção inválida!!!");break;
        }

        if (canal != null){
            String alerta = "Atenção: Um novo login foi detectado em um navegador desconhecido.";
            canal.enviar(alerta);
        }

        System.out.println("===========================================");
        System.out.println("Sistema finalidade com sucesso.");

        scan.close();
    }
}
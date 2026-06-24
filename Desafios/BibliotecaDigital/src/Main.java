import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    static Scanner scan = new Scanner(System.in);
    static String [] opsTelaInicial = new String[] {"Cadastrar","Visualizar informações","Reservas","Sair"};
    static String [] opCadastros = new String[] {"Cadastrar leitor","Cadastrar item do acervo", "Voltar"};
    static String [] opVisualizar = new String[] {"Visualizar Leitores", "Visualizar acervo", "Voltar"};
    static String [] opReservas = new String[] {"Cadastrar reserva", "Cadastrar devolução", "Visualizar reservas", "Visualizar devoluções", "Voltar"};

    static List <Membro> leitores = new ArrayList<>();
    static List <ItemAcervo> acervo = new ArrayList<>();
    static List <Reserva> reservas = new ArrayList<>();
    static List <Devolucao> devolucaos = new ArrayList<>();

    public static void main(String[] args) {


        boolean round = true;

        do{
            System.out.println("====================================");
            System.out.println("\t\tSistema de biblioteca");
            System.out.println("====================================");
            System.out.println("Digite...");


            int op = opcoes(opsTelaInicial);

            if(op < 1 || op > opsTelaInicial.length){
                System.out.println("Digite uma opção válida!!");
            }else{
                String resp = opsTelaInicial[op - 1];

                switch (resp){
                    case "Cadastrar":
                        cadastros();
                        break;
                    case "Visualizar informações":
                        visuInfo();
                        break;
                    case "Reservas":
                        reservas();
                        break;
                    case "Sair":
                        round = false;
                        break;
                }
            }

        }while(round);
    }
    public static int opcoes(String[] ops){
        for (int i = 1; i <= ops.length; i++){
            System.out.println(i + " - " + ops[i -1]);
        }
        System.out.printf("=> ");
        return scan.nextInt();
    }

    public static void cadastros(){
        String resp;
        do{
            int op;
            do{
                System.out.println("====================================");
                System.out.println("\t\t\tCadastros");
                System.out.println("====================================");
                System.out.println("Digite...");

                op = opcoes(opCadastros);
                if (op < 1 || op > opCadastros.length) {
                    System.out.println("Digite uma resposta válida!!\n");
                }

            }while(op < 1 || op > opCadastros.length);

            resp = opCadastros[op - 1];

            switch (resp){
                case "Cadastrar leitor":
                    cadLeitor();
                    break;
                case "Cadastrar item do acervo":
                    cadItemAcervo();
                    break;
                case "Voltar":
                    break;
            }
        }while(!resp.equals("Voltar"));

    }

    public static void cadLeitor(){
        scan.nextLine();

        String nome;
        do{
            System.out.printf("Digite nome do leitor: ");
            nome = scan.nextLine();

            if (nome.isEmpty()){
                System.out.println("Digite o nome do leitor!!\n");
            }
        }while (nome.isEmpty());

        String telefone;
        boolean isNumero;
        do{
            System.out.printf("Digite o novo telefone: ");
            telefone = scan.nextLine();

            isNumero = telefone.matches("[0-9]+");

            if (telefone.isEmpty() || telefone.length() != 9 || !isNumero){
                System.out.println("Telefone inválido!!\n");
            }
        }while(telefone.isEmpty() || telefone.length() != 9 || !isNumero);


        Membro newMembro = new Membro(nome, leitores.size(), telefone);
        leitores.add(newMembro);
        System.out.println("Leitor cadastrado com sucesso!!\n");
    }

    public static void cadItemAcervo(){
        String [] opItemAcervo = new String[] {"Livro", "Revista", "Mídia digital", "Voltar"};
        String resp;

        do{
            int op;
            do{
                System.out.println("====================================");
                System.out.println("\tCadastro no acervo");
                System.out.println("====================================");
                System.out.println("Digite...");

                op = opcoes(opItemAcervo);
                if (op < 1 || op > opItemAcervo.length) {
                    System.out.println("Digite uma resposta válida!!\n");
                }
            }while(op < 1 || op > opItemAcervo.length);

            resp = opItemAcervo[op -1];

            switch (resp){
                case "Livro":
                    cadLivro();
                    break;
                case "Revista":
                    cadRevista();
                    break;
                case "Mídia digital":
                    cadMDigital();
                    break;
                case "Voltar":
                    break;
            }
        }while (!resp.equals("Voltar"));

    }

    public static void cadLivro(){
        scan.nextLine();

        String titulo;
        do{
            System.out.printf("Digite o título: ");
            titulo = scan.nextLine();

            if (titulo.isEmpty()){
                System.out.println("Digite um título!!\n");
            }
        }while(titulo.isEmpty());

        String autor;
        do{
            System.out.printf("Digite o nome do autor: ");
            autor = scan.nextLine();

            if (autor.isEmpty()){
                System.out.println("Digite um autor!!\n");
            }

        }while(autor.isEmpty());

        int ano;
        do{
            System.out.printf("Digite o ano: ");
            ano = scan.nextInt();

            if (ano <= 0){
                System.out.println("Digite um ano válido!!\n");
            }

        }while(ano <= 0);

        int numPaginas;
        do{
            System.out.printf("Digite o número de páginas: ");
            numPaginas = scan.nextInt();

            if (numPaginas <= 0){
                System.out.println("Digite um número de páginas válido!!\n");
            }

        }while(numPaginas <= 0);

        scan.nextLine();

        String genero;
        do{
            System.out.printf("Digite o gênero: ");
            genero = scan.nextLine();

            if (genero.isEmpty()){
                System.out.println("Digite um gênero!!");
            }

        }while(genero.isEmpty());

        ItemAcervo newLivro = new Livro(titulo, autor, ano, numPaginas, genero);
        acervo.add(newLivro);

        System.out.println("Livro cadastrado!!");
    }

    public static void cadRevista(){
        scan.nextLine();

        String titulo;
        do{
            System.out.printf("Digite o título: ");
            titulo = scan.nextLine();

            if (titulo.isEmpty()){
                System.out.println("Digite um título!!\n");
            }
        }while(titulo.isEmpty());

        String autor;
        do{
            System.out.printf("Digite o nome do autor: ");
            autor = scan.nextLine();

            if (autor.isEmpty()){
                System.out.println("Digite um autor!!\n");
            }

        }while(autor.isEmpty());

        int ano;
        do{
            System.out.printf("Digite o ano: ");
            ano = scan.nextInt();

            if (ano <= 0){
                System.out.println("Digite um ano válido!!\n");
            }

        }while(ano <= 0);

        int numPaginas;
        do{
            System.out.printf("Digite o número de páginas: ");
            numPaginas = scan.nextInt();

            if (numPaginas <= 0){
                System.out.println("Digite um número de páginas válido!!\n");
            }

        }while(numPaginas <= 0);

        scan.nextLine();

        String edicao;
        do{
            System.out.printf("Digite o nome da edição: ");
            edicao = scan.nextLine();

            if (edicao.isEmpty()){
                System.out.println("Digite uma edição!!\n");
            }

        }while(edicao.isEmpty());

        ItemAcervo newLivro = new Revista(titulo, autor, ano, numPaginas, edicao);
        acervo.add(newLivro);

        System.out.println("Revista cadastrado!!");
    }

    public static void cadMDigital(){
        scan.nextLine();

        String titulo;
        do{
            System.out.printf("Digite o título: ");
            titulo = scan.nextLine();

            if (titulo.isEmpty()){
                System.out.println("Digite um título!!\n");
            }
        }while(titulo.isEmpty());

        String autor;
        do{
            System.out.printf("Digite o nome do autor: ");
            autor = scan.nextLine();

            if (autor.isEmpty()){
                System.out.println("Digite um autor!!\n");
            }

        }while(autor.isEmpty());

        int ano;
        do{
            System.out.printf("Digite o ano: ");
            ano = scan.nextInt();

            if (ano <= 0){
                System.out.println("Digite um ano válido!!\n");
            }

        }while(ano <= 0);

        int numPaginas;
        do{
            System.out.printf("Digite o número de páginas: ");
            numPaginas = scan.nextInt();

            if (numPaginas <= 0){
                System.out.println("Digite um número de páginas válido!!\n");
            }

        }while(numPaginas <= 0);

        scan.nextLine();

        boolean downloadG = false, continuar = true;

        do{
            String resp;
            System.out.println("Estara disponível para download? (s/n)");
            resp = scan.nextLine();

            if(!resp.equalsIgnoreCase("sim") && !resp.equalsIgnoreCase("s")
            && !resp.equalsIgnoreCase("não") && !resp.equalsIgnoreCase("nao") && !resp.equalsIgnoreCase("n")){
                System.out.println("Digite uma resposta válida!! (s/n)");
            }else{
                continuar = false;

                if(resp.equalsIgnoreCase("sim") || resp.equalsIgnoreCase("s") ){
                    downloadG = true;
                }else {
                    downloadG = false;
                }
            }
        }while(continuar);

        ItemAcervo newMDigital = new MidiaDigital(titulo, autor, ano, numPaginas, downloadG);
        acervo.add(newMDigital);
        System.out.println("Mídia cadastrada com sucesso!!");
    }

    public static void reservas(){
        String resp;
        do{
            int op;
            do{
                System.out.println("====================================");
                System.out.println("\t\t\tReservas");
                System.out.println("====================================");
                System.out.println("Digite...");

                op = opcoes(opReservas);
                if (op < 1 || op > opReservas.length) {
                    System.out.println("Digite uma resposta válida!!\n");
                }
            }while(op < 1 || op > opReservas.length);

            resp = opReservas[op -1];

            switch (resp){
                case "Cadastrar reserva":
                    cadReserva();
                    break;
                case "Cadastrar devolução":
                    cadDevolucao();
                    break;
                case "Visualizar reservas":
                    visuReservas();
                    break;
                case "Visualizar devoluções":
                    visuDevolucoes();
                    break;
                case "Voltar":
                    break;
            }

        }while(!resp.equals("Voltar"));
    }

    public static void cadReserva(){

        if(leitores.size() == 0){
            System.out.println("Não há leitores cadastrados!!\n");
            return;
        }else if (acervo.size() == 0){
            System.out.println("Não há itens cadastrados no acervo!!\n");
            return;
        }

        boolean membroExiste = false;
        int membro;
        do{
            System.out.printf("Digite o id do leitor: ");
            membro = scan.nextInt();

            if(verificMembro(membro)){
                membroExiste = true;
            }else {
                System.out.println("Digite um id existente!!\n");
            }

        }while(!membroExiste);

        boolean acervoVazio = true;
        System.out.println("-------------- Acervo --------------");

        for (int i = 1; i <= acervo.size(); i++){
            if (acervo.get(i -1).getDisponivel().equals("disponível")){
                System.out.println(i +" - "+ acervo.get(i-1).getTitulo() + " " + acervo.get(i-1).getAutor());
                acervoVazio = false;
            }
        }
        if(acervoVazio){
            System.out.println("ACERVO VAZIO");
        }else{
            int escol;
            do{
                System.out.printf("Digite o id do livro: ");
                escol = scan.nextInt();

                if(escol < 1 || escol > acervo.size()){
                    System.out.println("Digite um id válido!!\n");
                }
            }while(escol < 1 || escol > acervo.size());

            Reserva newReserva = new Reserva(membro, acervo.get(escol - 1));
            reservas.add(newReserva);

            System.out.println("Reserva cadastrada!!\n");
        }

    }

    public static boolean verificMembro(int id){
        for(Membro m: leitores){
            if (m.getId() == id - 1){
                return true;
            }
        }
        return false;
    }

    public static void cadDevolucao(){
        if (reservas.size() == 0){
            System.out.println("Não há nenhuma reserva cadastrada!");
        }else{
            visuReservas();

            int resp;
            do{
                System.out.printf("Digite o índice da reserva a ser devolvida: ");
                resp = scan.nextInt();

                if(resp < 1 || resp > reservas.size()){
                    System.out.println("Digite um índice válido!!");
                }
            }while(resp < 1 || resp > reservas.size());

            resp--;

            Devolucao newDevolucao = new Devolucao(reservas.get(resp).getMembro(),reservas.get(resp).getItem());
            devolucaos.add(newDevolucao);
            reservas.remove(resp);

            System.out.println("Devolução cadastrada!!\n");
        }
    }

    public static void visuReservas(){
        if (reservas.size() == 0){
            System.out.println("Não há reservas cadastradas!!");
        }else{
            System.out.println("-------------- Reservas --------------");
            for (int i = 0; i < reservas.size(); i++){
                System.out.println((i + 1) + " - Livro: " + reservas.get(i).getItem().getTitulo() + " | Leitor: "+ leitores.get(reservas.get(i).getMembro() - 1).getNome());
            }
        }

    }

    public static void visuDevolucoes(){
        if (devolucaos.size() == 0){
            System.out.println("Não há devoluções cadastradas!!");
        }else{
            System.out.println("-------------- Devolução --------------");
            for (int i = 0; i < devolucaos.size(); i++){
                System.out.println((i + 1) + " - Livro: " + devolucaos.get(i).getItem().getTitulo() + " | Leitor: "+ leitores.get(devolucaos.get(i).getMembro() - 1).getNome());
            }
        }
    }

    public static void visuInfo(){
        String resp;
        do{
            int op;
            do{
                System.out.println("====================================");
                System.out.println("\t\tDados cadastrados");
                System.out.println("====================================");
                System.out.println("Digite...");

                op = opcoes(opVisualizar);
                if (op < 1 || op > opVisualizar.length) {
                    System.out.println("Digite uma resposta válida!!");
                }
            }while(op < 1 || op > opVisualizar.length);

            resp =opVisualizar[op -1];

            switch (resp){
                case "Visualizar Leitores":
                    visuLeitores();
                    break;
                case "Visualizar acervo":
                    visuAcervo();
                    break;
                case "Voltar":
                    break;
            }

        }while(!resp.equals("Voltar"));
    }

    public static void visuLeitores(){
        if (leitores.size() == 0){
            System.out.println("Não há leitores cadastrados!!");
        }else{
            for (Membro leitor : leitores){
                System.out.println((leitor.getId() + 1) + " - " + leitor.getNome() + " ("+leitor.getTelefone()+")");
            }
        }
    }

    public static void visuAcervo(){
        if (acervo.size() == 0){
            System.out.println("Não há nada cadastrado no acervo!!");
        }else {
            System.out.println("-------------- Acervo --------------");
            int i = 1;
            for (ItemAcervo item : acervo){
                System.out.println(i + " - " + item.mostrarFichaCatalogo());
                i++;
            }
        }
    }
}
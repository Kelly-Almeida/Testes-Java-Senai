
public class MidiaDigital extends ItemAcervo{
    private String titulo, autor;
    private Boolean downloadGratis;
    private int ano, numPagina;

    public MidiaDigital(String titulo, String autor, int ano, int numPagina, boolean downloadGratis){
        super(titulo, autor, ano, numPagina);
        this.downloadGratis = downloadGratis;
    }

    public String getDownloadGratis(){
        if(this.downloadGratis){
            return "sim";
        }else{
            return "não";
        }
    }

    public void modfDownloadGratis(){
        String resp;
        boolean desativar;
        do{
            if(getDownloadGratis().equals("sim")){
                desativar = true;
                System.out.printf("Deseja desativar o download: ");
                resp = scan.nextLine();

            }else{
                desativar = false;
                System.out.printf("Deseja ativar o download: ");
                resp = scan.nextLine();

            }

            if (!resp.equalsIgnoreCase("Não") &&
                    !resp.equalsIgnoreCase("SIM")){
                System.out.println("Digite uma resposta válida!!");
            }
        }while(!resp.equalsIgnoreCase("Não") &&
                !resp.equalsIgnoreCase("SIM"));

        if (desativar){
            this.downloadGratis = false;
            System.out.println("Função desativada!");
        }else{
            this.downloadGratis = true;
            System.out.println("Função ativada!");
        }
    }


    @Override
    public String mostrarFichaCatalogo() {
                return "Título: " + getTitulo() + " | Disponível para download: " + getDownloadGratis() + " | Autor: " + getAutor() + " | Ano: " + getAno() + " | Número de páginas: " + getNumPaginas();
    }
}

public class UploadLocal implements Armazenamento{
    @Override
    public void salvar(String nomeArquivo){
        System.out.println("Verificando permissões de escrita no disco...");
        System.out.println("Enviando o arquivo '" + nomeArquivo  + "' em C:\\Uploads\\");
        System.out.println("Arquivos salvos no disco local sucesso!");
    }
}

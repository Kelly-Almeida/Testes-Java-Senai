import java.util.Scanner;

public class SistemaDeUpload {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String arquivo;
        int escol;

        System.out.println("Digite o nome do arquivo para upload: ");
        arquivo = scan.nextLine();

        System.out.print("Onde deseja salvar? \n1 - Nuvem\n2 - Disco local\n==> ");
        escol = scan.nextInt();

        Armazenamento servicoDeUpload = null;

        if (escol == 1){
            servicoDeUpload = new UploadNuvem();
        }else if (escol == 2){
            servicoDeUpload = new UploadLocal();
        }

        if (servicoDeUpload != null){
            servicoDeUpload.salvar(arquivo);
        }else{
            System.out.println("Serviço de upload inválido.");
        }

        scan.close();
    }
}

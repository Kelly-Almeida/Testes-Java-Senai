import java.util.Scanner;
class aula5 {
    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);
        int[] nums = new int[10];
        for(int i = 0; i < 10; i++){
            System.out.println("Digite o "+ (i + 1) + "º número: ");
            nums[i] = scan.nextInt();

        }

        for(int i = 0; i < 10; i++){
            System.out.println((i + 1) + "° número: "+ nums[i]);
        }
    }
}

import java.util.Arrays;

public class teste1 {
   public static void main(String[] args){
       int [] nums = {1,2,3,4,5};
       /*int soma = 0; foma convêncional

       for (int i = 0; i < nums.length; i++){
           soma+=nums[i];
       }*/

       //Soma com funções
       int soma = Arrays.stream(nums).sum();
       System.out.printf("O resultado da soma é %d", soma);
   }
}

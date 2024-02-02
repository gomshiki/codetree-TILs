import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int[] arry = new int[10];

        for(int i = 0 ; i < 10 ; i++){

            arry[i] = sc.nextInt();
        }
        
        int sum = 0;
        for(int j=1 ; j < 10 ; j+=2){
            sum += arry[j];
        }

        int sum2 = 0;
        for(int k=2 ; k < 10 ; k+=3){
            sum2 += arry[k];
        }

        System.out.printf("%d %.1f", sum, (double)sum2/3);
    }
}
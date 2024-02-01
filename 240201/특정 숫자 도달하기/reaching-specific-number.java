import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int[] arry = new int[10];

        int sum = 0;
        int count = 0;

        for(int i = 0; i < 10; i++){
            int n =  sc.nextInt();
            if(n >= 250) break;
            else {
                arry[i] = n;
                count++;
            };
        }

        

        for(int i = 0; i < 10 ; i++){
            sum += arry[i];
        }

        System.out.printf("%d %.1f", sum, (double) sum/count);

    }
}
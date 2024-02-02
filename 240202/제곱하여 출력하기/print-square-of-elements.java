import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int n  = sc.nextInt();

        int[] arry = new int[n];

        for(int i = 0 ; i < n ; i++){

            arry[i] = sc.nextInt();
            System.out.print(arry[i] * arry[i] + " ");
        }

        


    }
}
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int[] arry = new int[10];

        for(int i = 0 ; i < 10 ; i++){

            arry[i] = sc.nextInt();

        }

        int sum = arry[2] + arry[4] + arry[9];

        System.out.println(sum);

    }
}
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int[] arry = new int[10];
        int sum=0;
        for(int i = 0; i<10 ; i++){
            arry[i] = sc.nextInt();
            sum += arry[i];
        }

        System.out.println(sum);

    }
}
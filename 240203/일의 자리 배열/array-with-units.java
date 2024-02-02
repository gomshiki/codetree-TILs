import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        int[] arry= new int[11];

        arry[1]= sc.nextInt();
        arry[2]= sc.nextInt();

        for(int i = 3; i <= 10 ; i++){
            arry[i] = (arry[i-1] + arry[i-2]) % 10;
        }

        for(int j = 1; j <= 10 ; j++){
            System.out.printf("%d " , arry[j]);
        }

    }
}
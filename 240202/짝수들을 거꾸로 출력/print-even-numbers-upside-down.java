import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arry = new int[n];

        for(int i = 0 ; i < n ; i++){
            int a = sc.nextInt();
            if( a % 2 == 0){
                arry[i] = a;
            }
        }

        for(int j = arry.length-1 ; j >= 0 ; j--){
            if(arry[j] > 0){
            System.out.print(arry[j] + " ");
            }
        }
    }
}
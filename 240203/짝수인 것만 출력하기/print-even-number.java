import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.

        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int[] arry = new int[n];

        for(int i = 0 ; i < n ; i++){
            
            arry[i] = sc.nextInt();

        }

        for(int j = 0; j < n ; j++){
            if(arry[j] % 2 == 0) System.out.printf("%d ", arry[j]);
        }


    }
}
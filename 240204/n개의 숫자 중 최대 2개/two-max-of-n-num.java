import java.util.Scanner;
import java.lang.Integer;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.

        Scanner sc =new Scanner(System.in);

        int n = sc.nextInt();

        int[] arry = new int[n];
        
        // 배열 초기화
        for(int i =0; i < n ;i++){
            arry[i] = sc.nextInt();
        }

        for(int j = 0; j < n ; j++){
            for(int k = 0; k < n-1 ; k++){
                if(arry[k] < arry[k+1]){
                    int temp = arry[k];
                    arry[k] = arry[k+1];
                    arry[k+1] = temp;
                }
            }
            
        }

        for(int k =0; k < n ; k++){
            System.out.print(arry[k] + " ");
        }

    }
}
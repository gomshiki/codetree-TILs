import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.

        Scanner sc = new Scanner(System.in);

        int[] arry = new int[100];

        int sum = 0 ;
        for(int i = 0 ; i < arry.length; i++){
            
            int a = sc.nextInt();
            
            if(a == 0){
                for(int j = i-1 ; j >= i - 3 ; j--){
                    sum += arry[j];
                }
                break;
            }
            arry[i] = a;

        }

        System.out.println(sum);
        
    }
}
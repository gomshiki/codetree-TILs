import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        result(n,m);

    }

    public static void result(int n , int m ){

        int max = 0;

        for(int i =1; i < 101 ; i++){
            if(n % i == 0 && m % i == 0){
                
                max = i;

            }
        }

        System.out.println(max);

    }
}
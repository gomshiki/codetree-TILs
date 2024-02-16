import java.util.Scanner;

public class Main {

    static int cnt = 0;
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int result = func(N);
        System.out.println(result);
    }

    static int func(int n){
        
        if(n==1) return 0;

        if( n % 2 == 0){
           return func(n / 2) + 1;
        }else{
            return func(n / 3) + 1;
        }


    }
}
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc =new Scanner(System.in);

        int n = sc.nextInt();

        int result = func(n);

        System.out.println(result);

    }

    // (an - 1 * an) % 100 
    static int func(int n){

        if(n == 1) return 2;
        if(n == 2) return 4;


        return func(n - 1) * func(n - 2) % 100;
    }
}
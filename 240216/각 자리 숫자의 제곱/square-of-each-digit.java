import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int N  = sc.nextInt();

        int result = func(N);
        System.out.println(result);
    }

    static int func(int n){

        if(n < 10) return n;

  
        return func(n / 10) + func(n / 10);

    }
}
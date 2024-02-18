import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.

        Scanner sc = new Scanner(System.in);

        int a1 = sc.nextInt();
        int a2 = sc.nextInt();
        int a3 = sc.nextInt();

        int inputData = a1 * a2 * a3;

        int result = func(inputData);
        System.out.println(result);
    }

    static int func(int n){
        
        if(n < 10) return n;

        return func(n / 10) + n % 10;
    }
}
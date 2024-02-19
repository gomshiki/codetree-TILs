import java.util.Scanner;

public class Main {

    static int cnt = 0;

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int result = func(n);

        System.out.println(result);

    }

    static int func(int a){
        if(a== 1) return 0;

        if(a % 2 == 0) return func( a / 2) + 1;
        else return func(3 * a + 1) +1;

    }
}
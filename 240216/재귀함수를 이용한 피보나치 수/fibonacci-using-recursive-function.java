import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc =new Scanner(System.in);

        int n = sc.nextInt();
        int a1 = 1;
        int a2 = 1;
        int result = func(n, a1, a2);

        

        System.out.println(result);
    }

    static int func(int n, int a1, int a2){
        
        if(n == 2) return a1 + a2;
        

        return func(n - 1, a1 , a2) ;

    }
}
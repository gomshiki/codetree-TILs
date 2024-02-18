import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
    Scanner sc =new Scanner(System.in);

    int n = sc.nextInt();

    int result = func(n);

    System.out.println(result);
    }

    static int func(int n){

        if( n <= 2 ) return n;
        
        
        return func(n - 2) + n;
       
    }
}
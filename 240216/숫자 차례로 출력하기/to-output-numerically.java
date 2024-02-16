import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
    
        Scanner sc =new Scanner(System.in);

        int n = sc.nextInt();

        fun1(n);
        System.out.println();
        fun2(n);
    

    }

    static void fun1(int n){

        if(n == 0) return;

        fun1(n-1);
        System.out.print(n + " ");

    }

    static void fun2(int n ){
        if(n == 0) return;

        System.out.print(n + " ");
        fun2(n-1);

    }

}
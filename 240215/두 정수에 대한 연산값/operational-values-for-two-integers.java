import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        func(a, b);


    }

    static void func(int a, int b){
          if(a > b){
            a = a +25;
            b = b *2;
          }else{
            a = a *2;
            b = b + 25;

          }

          System.out.printf("%d %d", a, b);
    }
}
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        func(n);
        
    }

    static void func(int n){

        if(n % 2 == 0){

            int a = n % 10; // 1의 자리
            int b = (n / 10); // 10의 자리 

            if((a+b) % 5 == 0){
                System.out.println("Yes");
            }else{
                System.out.println("No");
            }

        }else{
                System.out.println("No");
            }


    }

}
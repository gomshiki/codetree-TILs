import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.

        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int gcd = gcd(n,m);
        int lcm = (n*m)/gcd;

        System.out.println(lcm);
    }

    public static int gcd(int n , int m){
        /**
            두 수 a와 b의 최소공배수는 a와 b의 곱을 a와 b의 최대공약수를 나눈 것과 같다. 
        */
        int gcd = 0;

        for(int i = 0 ; i < Math.min(n, m) ; i++){

            if(n % (i+1) == 0 && m % (i+1) == 0){
                
                gcd = i+1;
                
            }

        }

        return gcd;


    }
}
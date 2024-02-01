import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int n =sc.nextInt();

        if(n < 0) System.out.printf("%d\nminus",n);
        else System.out.printf("%d",n);

    }
}
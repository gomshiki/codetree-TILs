import java.util.Scanner;
import java.lang.StringBuilder;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        StringBuilder sb = new StringBuilder();
        sb.append(a+" "+b+" "+c);
        System.out.println(sb.toString());
    }
}
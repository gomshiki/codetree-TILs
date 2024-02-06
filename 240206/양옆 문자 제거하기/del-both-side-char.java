import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        String a = sc.next();

        System.out.println(a.substring(0, 1) + a.substring(2, a.length()-2) + a.substring(a.length()-1));
    }
}
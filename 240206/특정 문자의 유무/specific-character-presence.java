import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        String a  = sc.next();

        String result1 = (a.contains("ee") ? "Yes" : "No");
        String result2 = (a.contains("ab") ? "Yes" : "No");

        System.out.printf("%s ", result1);

        System.out.printf("%s", result2);
        
    }
}
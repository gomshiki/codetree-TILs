import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        char a = sc.next().charAt(0);
        // 122 -> 97
        int result = (int) a < 122 ? a + 1 : 'a';
        System.out.printf("%c", (char) result);

    }
}
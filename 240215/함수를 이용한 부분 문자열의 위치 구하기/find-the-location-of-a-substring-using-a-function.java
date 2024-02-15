import java.util.Scanner;

public class Main {

    static String A = "";
    static String B = "";

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        A = sc.next();
        B = sc.next();

        int index = func();
        System.out.println(index);
    }

    static int func(){

        return A.indexOf(B);

    }
}
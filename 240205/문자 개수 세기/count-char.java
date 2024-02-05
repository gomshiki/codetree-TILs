import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.

        Scanner sc = new Scanner(System.in);

        String a = sc.nextLine();

        int cnt = 0;
        char b = sc.next().charAt(0);
        for(int i = 0; i < a.length() ; i++){
            if(a.charAt(i) == b) cnt++;

        }

        System.out.println(cnt);
    }
}
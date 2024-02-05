import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.

        Scanner sc = new Scanner(System.in);

        String a = sc.next();
        int targetNum = sc.nextInt();
        int bound = a.length() - targetNum > 0?a.length() - targetNum : a.length();

        for(int i = a.length()-1 ; i >= bound; i--){
            
            
                System.out.print(a.charAt(i));
            
        }
    }
}
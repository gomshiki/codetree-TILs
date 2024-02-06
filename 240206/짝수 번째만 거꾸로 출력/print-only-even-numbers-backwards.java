import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        String a = sc.next();

        String sum = "";
        for(int i = 1; i < a.length(); i += 2){
            sum += a.charAt(i);
        }

        for(int j = sum.length()-1; j >= 0 ; j--){
            System.out.print(sum.charAt(j));
        }



    }
}
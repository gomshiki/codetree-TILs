import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc =new Scanner(System.in);

        String A = sc.next();

        for(int i = 0 ;i < A.length() ; i++){

            char target = A.charAt(i);

            if(target >= 'a' && target <= 'z'){
                System.out.print((char) (target - 'a' + 'A'));
            }else if (target >= 'A' && target <= 'Z'){
                System.out.print((char) (target - 'A' + 'a'));
            }

        }
    }
}
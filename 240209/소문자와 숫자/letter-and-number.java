import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.

        Scanner sc = new Scanner(System.in);

        String inputStr = sc.next();

        for(int i = 0 ; i < inputStr.length(); i++){

            char target = inputStr.charAt(i);

            if(target >= 'a' && target <= 'z'){
                System.out.print(target);
            }else if(target >= 'A' && target <= 'Z'){
                
                int result = (int) target - 'A' + 'a';

                System.out.print((char) result);
            }else if(target >= '0' && target <= '9'){
                System.out.print(target);
            }

        }
    }
}
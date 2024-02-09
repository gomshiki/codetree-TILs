import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc =new Scanner(System.in);
        String str = sc.next();

        for(int i = 0 ; i < str.length(); i++){
            char targetCh = str.charAt(i);
            if(targetCh >= 'a' && targetCh <= 'z'){

                int result = (int) targetCh - 'a' + 'A';
                System.out.print((char)result);

            }else if(targetCh >= 'A' && targetCh <= 'Z'){
                System.out.print((char) targetCh);
            }
        }

    }
}
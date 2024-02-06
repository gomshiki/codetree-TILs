import java.util.Scanner;
import java.lang.StringBuilder;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        String a = sc.next();
        StringBuilder sb = new StringBuilder();

        char curChar = a.charAt(0);
        int numChar = 1;
        String encoded = "";
        
        for(int i = 1; i <  a.length() ; i++){

            if(curChar == a.charAt(i)){
                numChar++;
            }else{
                sb.append(curChar);
                sb.append(numChar);
                curChar = a.charAt(i);
                numChar = 1;
            }
        }
        sb.append(curChar);
        sb.append(numChar);

        System.out.printf("%d\n%s", sb.toString().length(), sb.toString());
    }
}
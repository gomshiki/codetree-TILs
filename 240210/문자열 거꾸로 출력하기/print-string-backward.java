import java.util.Scanner;
import java.lang.StringBuffer;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        
        while(true){
            String a = sc.next();
            if(a.equals("END")) break;

            StringBuffer sb = new StringBuffer(a);
            sb.reverse();
            System.out.println(sb.toString());


        }
    }
}
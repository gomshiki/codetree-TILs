import java.util.Scanner;
import java.lang.StringBuilder;

public class Main {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        // 여기에 코드를 작성해주세요.
        int cnt = 0;
        while(true){
            String target = sc.next();
            if(target.equals("0")) {
                System.out.println(cnt);
                System.out.println(sb.toString());
                break;
            }
            cnt++;
            if(cnt % 2 != 0){ 
                sb.append(target+"\n");
            }

        }
    }
}
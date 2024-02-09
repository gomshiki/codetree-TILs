import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc =new Scanner(System.in);

        String A = sc.next();
        String B = sc.next();

        StringBuilder sb = new StringBuilder();
        int sum = 0;

        for(int i = 0 ; i < A.length() ; i++){

            if(A.charAt(i) >= '0' && A.charAt(i) <= '9'){
                sb.append(A.charAt(i));
            }

        }
        sum += Integer.parseInt(sb.toString());

        sb = new StringBuilder();

        for(int i = 0 ; i < B.length() ; i++){
                if(B.charAt(i) >= '0' && B.charAt(i) <= '9'){
                sb.append(B.charAt(i));
            }
        }

        sum += Integer.parseInt(sb.toString());

        System.out.println(sum);
    }

}
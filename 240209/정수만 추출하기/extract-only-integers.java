import java.util.Scanner;
import java.lang.StringBuilder;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        String A = sc.next();
        String B = sc.next();


        int sum = 0;

        while(true){

            StringBuilder sb = new StringBuilder();
            for(int i = 0 ; i < A.length() ; i++){

                char target = A.charAt(i);

                if(target >= '0' && target <= '9'){
                    sb.append(target);
                }else{
                    sum += Integer.parseInt(sb.toString());
                    break;
                }
            }

            sb = new StringBuilder();
            for(int i = 0 ; i < B.length() ; i++){

                char target = B.charAt(i);
                if(target >= '0' && target <= '9'){
                    sb.append(target);
                }else{
                    sum += Integer.parseInt(sb.toString());
                    break;
                }
            }
            System.out.println(sum);
            break;
        }



    }
}
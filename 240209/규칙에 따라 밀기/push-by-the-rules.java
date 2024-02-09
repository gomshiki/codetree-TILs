import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);


        String A = sc.next();
        int strSize = A.length();

        String strReq = sc.next();

        for(int i = 0 ; i < strReq.length() ; i++){

            if(strReq.charAt(i) == 'L'){
                A = A.substring(1) + A.charAt(0);

            }else if (strReq.charAt(i) == 'R'){
                A = A.charAt(strSize - 1) + A.substring(0, strSize - 1) ;

            }
        }
                System.out.println(A);     
        

    }
}
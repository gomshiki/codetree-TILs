import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        String A = sc.next();
        String B = sc.next();
        int cnt = 0;

        while(true){
        
            if(A.equals(B)) {
               System.out.println(cnt);
               break;

            }else{
                
                A = A.charAt(A.length()-1) + A.substring(0, A.length()-1);
                cnt++;
            }


        }
    }
}
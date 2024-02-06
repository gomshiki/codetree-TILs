import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.

        Scanner sc = new Scanner(System.in);

        String a = sc.next();

        while(a.length() > 1){
            
            int b = sc.nextInt();

            if( b > a.length()){
                a = a.substring(0,a.length()-1);
            }else{
                a = a.substring(0, b) + a.substring(b+1);
            }
            System.out.println(a);
        }

        
    }
}
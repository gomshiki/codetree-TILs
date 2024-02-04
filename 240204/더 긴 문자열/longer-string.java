import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        String a = sc.next();
        String b = sc.next();

        int aLength = a.length();
        int bLength = b.length();

        if( aLength > bLength){
            System.out.printf(a + " " + aLength);
        }else if(aLength < bLength){
            System.out.printf(b + " " + bLength);
        }else{
            System.out.println("same");
        }
    }
}
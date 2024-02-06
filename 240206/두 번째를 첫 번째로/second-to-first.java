import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.

        Scanner sc = new Scanner(System.in);

        String a=  sc.next();

        char target = a.charAt(1);
        char changeChar = a.charAt(0);

        for(int i = 0 ; i < a.length(); i++){
            if(a.charAt(i) == target){
                System.out.print(changeChar);
            }else{
                System.out.print(a.charAt(i));
            }
        }
        
    }
}
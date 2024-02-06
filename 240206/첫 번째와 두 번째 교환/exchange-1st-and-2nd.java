import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.

        Scanner sc = new Scanner(System.in);

        String a=  sc.next();

        char target1 = a.charAt(0);
        char target2 = a.charAt(1);

        for(int i = 0 ; i < a.length(); i++){
            if(a.charAt(i) == target1){
                System.out.print(target2);
            }else if(a.charAt(i) == target2){
                System.out.print(target1);
            }else{
                System.out.print(a.charAt(i));
            }

        }
    }
}
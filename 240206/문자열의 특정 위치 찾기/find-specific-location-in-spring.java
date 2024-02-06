import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        String a = sc.next();
        char b = sc.next().charAt(0);

        for(int i = 0 ; i < a.length(); i++){
            if(a.charAt(i) == b){
                System.out.println(i);
                break;
            }else if(i == a.length()+1){
                System.out.println("No");
            }
        }
        
    }
}
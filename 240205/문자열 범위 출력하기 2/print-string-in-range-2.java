import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.

        Scanner sc = new Scanner(System.in);

        String a = sc.next();
        int targetNum = sc.nextInt();

        for(int i = a.length()-1 ; i >= a.length() - targetNum ; i--){
            if(targetNum > a.length()){
                System.out.println(a);
                break;
            }else{
                System.out.print(a.charAt(i));
            }
        }
    }
}
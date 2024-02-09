import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        for(int i = 0 ;i < 5 ; i++){
            int a = sc.nextInt();
            if(a >= 33 && a <=126){
                System.out.print((char) a  + " ");
            }
        }


    }
}
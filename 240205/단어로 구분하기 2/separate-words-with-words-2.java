import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.

        Scanner sc = new Scanner(System.in);

        String[] arry= new String[10];
        for(int i = 0 ; i < 10 ; i++){
            arry[i] = sc.next();
        }

        for(int j = 0 ; j < 10 ; j += 2){
            System.out.println(arry[j]);
        }
    }
}
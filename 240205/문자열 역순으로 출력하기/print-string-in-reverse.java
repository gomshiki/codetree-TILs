import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        String[] arry = new String[4];
        for(int i = 0 ; i < 4 ; i++){
            arry[i] = sc.next();
        }

        for(int j = 3 ; j >= 0 ; j--){
            System.out.println(arry[j]);
        }
    }
}
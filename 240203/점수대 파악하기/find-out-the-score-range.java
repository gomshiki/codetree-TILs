import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc =new Scanner(System.in);

        int[] countArry = new int[11];
        for(int i = 0; i < 100 ; i++){
            int a = sc.nextInt();
            if(a == 0) break;
            countArry[a / 10]++;
        }

        for(int i = 10; i > 0; i--){
            System.out.println(i*10 + " - " + countArry[i]);
        }
    }
}
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int count = 0;

        for(int i = 1 ; count < 2 ; i++){

            int a = n * i;
            System.out.printf("%d ", a);
            if(a % 5 == 0) count++;
        }

        

    }
}
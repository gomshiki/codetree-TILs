import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int n  = sc.nextInt();

        int positive = 0,  negative = 0;
        
        for(int i = 0 ; i < n ; i++){
            int target = sc.nextInt();

            if(target > 0) positive++;
            else negative++;
        }

        int result = Math.max(positive, negative);

        System.out.println(result);

    }
}
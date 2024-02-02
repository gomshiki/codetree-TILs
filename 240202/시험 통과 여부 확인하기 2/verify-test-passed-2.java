import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.

        Scanner sc = new Scanner(System.in);

        int people = sc.nextInt();
        int count = 0;

        for(int j = 0 ; j < people ; j++){
            
            int sum = 0;

            for(int i = 0 ; i < 4 ; i++){
                int score = sc.nextInt();
                sum += score;
            }

            if(sum/4 >= 60) {
                System.out.println("pass");
                count++;
            }
            
            else System.out.println("fail");
        
        }

        System.out.println(count);


    }
}
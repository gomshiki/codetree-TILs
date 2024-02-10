import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        String n = sc.next();

        int sum = 0;

        for(int i = 0 ; i < n.length(); i++){
            char target = n.charAt(i);

            int result = (int)target - '0';
            sum +=  result;
                    }

        System.out.println(sum);
    }
}
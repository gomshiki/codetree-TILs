import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();

        int sum = A+B;

        String sumStr = Integer.toString(sum);

        int cnt = 0;
        for(int i = 0 ; i< sumStr.length() ; i++){
            if( sumStr.charAt(i) == '1' ){
                cnt++;
            }
        }

        System.out.println(cnt);
    }
}
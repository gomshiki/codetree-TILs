import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc= new Scanner(System.in);

        int n = sc.nextInt();
        String[] arry = new String[n];

        for(int i = 0 ; i < n  ; i++){
            arry[i] = sc.next();
        }

        int lengSum = 0;
        int cnt = 0;
        for(int j = 0 ; j < n ; j++){
            lengSum += arry[j].length();
            if(arry[j].charAt(0) == 'a') cnt++;

        }

        System.out.printf("%d %d", lengSum, cnt);
    }
}
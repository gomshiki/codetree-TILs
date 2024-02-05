import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        String[] arr = new String[n];
        for(int i = 0 ; i < n ; i++){
            arr[i] = sc.next();
        }

        char target= sc.next().charAt(0);

        int cnt = 0, lengthSum = 0;

        for(int j = 0 ; j < n ; j++){
            if(arr[j].charAt(0) == target) {
                lengthSum += arr[j].length();
                cnt++;
            }
        }

        System.out.printf("%d %.2f", cnt, (double) lengthSum / cnt);
        
    }
}
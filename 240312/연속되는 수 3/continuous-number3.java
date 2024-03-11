import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int n  = sc.nextInt();

        int[] arr = new int[n];
        int ans = 0, cnt = 0;

        // 입력데이터 배열에 저장
        for(int i = 0 ; i < n ; i++){
            arr[i] = sc.nextInt();            
        }

        // 검증
        for(int i = 0 ; i < arr.length ; i++){
            // 음수 * 음수 = 양수, 양수 * 양수 = 양수
            if(i == 0 || arr[i-1] * arr[i] > 0 ){
                cnt++;
            }else {
                ans = Math.max(ans, cnt);
                cnt = 1;
            }
        }

        System.out.println(ans);

    }
}
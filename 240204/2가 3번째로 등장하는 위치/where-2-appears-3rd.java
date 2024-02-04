import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arry = new int[n];

        // arry 배열 초기화
        for(int i = 0 ; i < n ; i++){
            arry[i] = sc.nextInt();
        }

        // 문제풀이 로직
        int cnt = 0;
        for(int j = 0 ; j < n ; j++){
            if(arry[j] == 2) cnt++;
            if(cnt == 3) {
                System.out.println(j+1);
            break;
            }
            
        }

    }
}
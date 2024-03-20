import java.util.Scanner;

public class Main {

    static int minDis = Integer.MAX_VALUE;
    static int[] arr;

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc= new Scanner(System.in);
        
        int n = sc.nextInt();

        arr = new int[n];
        
        //데이터 입력
        for(int i=0; i < n ;i++){
            arr[i] = sc.nextInt();
        }

        for(int i = 0 ; i < n ; i++){

            int sumDis = 0;

            for(int j = 0; j < n; j++){
                sumDis += arr[j] * Math.abs(j - i);
            }
            minDis = Math.min(minDis, sumDis);

        }

        System.out.println(minDis);

    }
}
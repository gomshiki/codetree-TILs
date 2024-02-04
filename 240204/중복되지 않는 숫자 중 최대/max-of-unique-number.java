import java.util.Scanner;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] arry = new int[N+1];
        int[] arryIdx = new int[1000];

        // 배열 초기화
        for(int i = 0; i < N; i++){
            arryIdx[i] = sc.nextInt();

            // 해당 인덱스 값 count
            arry[arryIdx[i]]++;

        }

        int maxVal = -1;
        for(int j = 0; j < 1000 ; j++){
// 1
// 188
            if(arry[arryIdx[j]] == 1){
                if(arryIdx[j] > maxVal){
                    maxVal = arryIdx[j];
                }
            }

        }

        System.out.println(maxVal);




    }
}
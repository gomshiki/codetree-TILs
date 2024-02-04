import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.

        Scanner sc =new Scanner(System.in);

        // 수열 A : [1,5,2,6]
        // 수열 B : [5,2]
        // => 수열 B는 tnduf A의 연속 부분 수열

        int aCnt = sc.nextInt();
        int bCnt = sc.nextInt();

        int[] seqA = new int[aCnt];
        int[] seqB = new int[bCnt];

        // 수열 A 초기화
        for(int i = 0 ; i < aCnt ; i++){
            seqA[i] = sc.nextInt();
        }

        // 수열 B 초기화
        for(int i = 0; i < bCnt ; i++){
            seqB[i] = sc.nextInt();
        }
        String result = "";


        // 문제해결 로직
        for(int i = 0; i < aCnt ; i++){
            
            if(seqA[i] == seqB[0]){
                int cnt = 0;
                for(int j = 1; j < bCnt ; j++, i++){
                    if(seqA[i+1] == seqB[j]) cnt++;
                }
                result = (cnt == bCnt ? "Yes" : "No");
                break;
            }
            

        }
            System.out.println(result);

    }
}
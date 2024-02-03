import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int q = sc.nextInt();

        // 원소를 담는 배열
        int[] arry = new int[n];

        // 배열에 원소담기
        for(int i = 0; i < n ; i++){
            arry[i] = sc.nextInt();
        }

        // 질의 수 만큼 for문 수행
        // 1 1 : 1번째 원소 출력
        // 2 1 : 숫자 1이 있는지 확인, 있다면 해당 idx 값 출력, 2개 이상이면 최소 idx 출력,
        //       없으면 0 출력
        // 3 1 2 : 1~2까지 순서대로 출력
        for(int i = 0 ; i < q; i++){
            
            int query = sc.nextInt();
            
            if(query == 1) { 
                int targetNum = sc.nextInt();
                System.out.println(targetNum);
            }
            else if(query == 2){

                int targetNum = sc.nextInt(); // 5
                int cnt = 0;

                for(int j = 0 ; j < n ; j++){

                    if(targetNum == arry[j]){
                        System.out.println(j + 1);
                        cnt++;
                    }
                                        
                }
                
                if(cnt == 0) System.out.println(0);
                
            }
            else if(query == 3){
                int startIdx = sc.nextInt();
                int endIdx = sc.nextInt();
                for(int j = startIdx-1 ; j < endIdx ; j++){
                    System.out.print(arry[j] + " ");
                }
                System.out.println();
            }
        }

    }
}
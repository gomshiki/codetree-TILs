import java.util.Scanner;

public class Main{
    
    public static void main(String[] args){

        Scanner sc =new Scanner(System.in);

        int[][] arr = new int[2][4];

        // 데이터 입력받기
        for(int i = 0; i < arr.length; i++){
        
            for(int j = 0 ; j < arr[0].length ; j++){
                arr[i][j] = sc.nextInt();
            }

        }

        // 가로평균
        for(int i = 0 ; i < arr.length ; i++){
            
            int sum = 0;
            int cnt = 0;
            for(int j = 0 ; j < arr[0].length; j++){
                sum += arr[i][j];
                cnt++;
            }
            System.out.printf("%.1f ", (double) sum/cnt);

        }

        System.out.println();

        // 세로 평균
        for(int i = 0 ; i < arr[0].length; i++){

            int sum = 0 ;
            int cnt = 0;
            for(int j = 0 ; j < arr.length; j++){
                // 0 , 0 / 1, 0 / 0,1 / 1, 1 / ... / 0, 3 / 1 , 3 
                sum += arr[j][i] ;
                cnt++;
            }

            System.out.printf("%.1f ", (double) sum/cnt);

        }

        System.out.println();

        int totalSum = 0;
        int totalCnt = 0;
        //  전체 평균
        for(int i = 0 ; i < arr.length; i++){

            for(int j = 0 ; j < arr[0].length ; j++){
                totalSum += arr[i][j];
                totalCnt++;
            }
        }
        System.out.printf("%.1f ", (double) totalSum/totalCnt);



    }
}
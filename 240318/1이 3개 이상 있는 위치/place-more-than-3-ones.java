import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[][] arr= new int[n][n];
        
        for(int i = 0; i < n ; i++){
            for(int j = 0 ; j < n; j++){
                arr[i][j] = sc.nextInt();
            }

        }
        
        // dx, dy 정의
        int[] dx = new int[]{0, 1, 0, -1};
        int[] dy = new int[]{1, 0 , -1, 0};

        // startPoint
        
        int totalCnt = 0;
        for(int j = 0 ; j < arr.length; j++){

            for(int k = 0 ; k < arr[0].length; k++){

            int cnt = 0;
            
                for(int i = 0 ; i < 4 ; i++){

                    int ny = k + dy[i]; // 
                    int nx = j + dx[i];

                    if( (nx >= 0 &&  nx < n) && (ny >= 0 && ny < n)){
                        
                        int target = arr[ny][nx];

                        if(target == 1){
                            cnt++;
                        }
                    }
                }
            

                if(cnt >= 3){
                    totalCnt++;
                }
            }
            

        }

        System.out.println(totalCnt);

    }



}
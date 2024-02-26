import java.util.Scanner;

public class Main {

    static int n;

    static boolean inRange(int x, int y){
        return (0 <= x && x < n && 0 < y && y < n);
    }

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();

        int[][] arr = new int[100][100];
        for(int i = 0 ; i < n ; i++ ){
            for(int j = 0 ; j < n; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        int[] dx = new int[]{0, 1 , 0, -1};
        int[] dy = new int[]{1, 0 , -1, 0};

        int x,y = 0;

        int result = 0;

        for(int i = 0 ; i < n ; i++ ){

            for(int j = 0 ; j < n; j++){

                x = i;
                y = j;    

                int cnt = 0;

                for(int dirNum = 0; dirNum < 4; dirNum++){
                    int nx = x + dx[dirNum];
                    int ny = y + dy[dirNum];
                    
                    if(inRange(nx, ny) && arr[nx][ny] == 1){
                        cnt++;
                    }                    
                    
                }
                if(cnt >= 3){
                        result++;
                }

            }
        }
        System.out.println(result);     

    }
}
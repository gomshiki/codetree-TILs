import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc =new Scanner(System.in);

        int n =sc.nextInt();
        int[][] rectangular = new int[200][200];

        for(int i = 0 ; i < n ; i++){

            int x1 = sc.nextInt() + 100;
            int y1 = sc.nextInt() + 100;
            int x2 = sc.nextInt() + 100;
            int y2 = sc.nextInt() + 100;

            for(int j = x1 ; j < x2 ; j++){
                
                for(int k = y1 ; k < y2 ; k++){
                    rectangular[j][k]++;
                }
                
            }

        }

        int cnt = 0;

        for(int i = 0 ; i < rectangular.length; i++){
            for(int j = 0 ; j < rectangular[0].length; j++){

                if(rectangular[i][j] > 0) cnt++;
            }
        }

        System.out.println(cnt);

    }
}
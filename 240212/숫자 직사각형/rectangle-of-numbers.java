import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int[][] arr = new int[n][m];

        int num = 1;

        for(int i = 0 ; i < arr.length; i++){

            for(int j = 0 ; j < arr[0].length; j++){

                arr[i][j] = num;
                num++;
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

    }
}
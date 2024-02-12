import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.

        Scanner sc = new Scanner(System.in);

        int[][] arr = new int[4][4];

        for(int i = 0 ; i < arr.length; i++){
            for(int j = 0 ; j < arr[0].length; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        // 0,0 , 1,0 , 1,1 ,2,0 ,2,1 , 2,2, 3,0 3,1, 3,2 3,3;

        int sum = 0;
        for(int i = 0 ; i < arr.length; i++){

            for(int j = 0 ; j < i+1 ; j++){
                sum += arr[i][j];
            }
        } 
        System.out.println(sum);


    }
}
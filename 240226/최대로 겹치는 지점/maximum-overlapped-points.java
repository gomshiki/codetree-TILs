import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc= new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[101];

        for(int i = 0 ; i < n ; i++){

            int start = sc.nextInt();
            int end = sc.nextInt();

            for(int j = start ; j <= end; j++){

                arr[j]++;

            }
        }


        int max = 0;

        for(int i = 0 ; i < arr.length; i++){
            if(max < arr[i]) max = arr[i];
        }

        System.out.println(max);
    }
}
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc= new Scanner(System.in);

        int n =sc.nextInt();

        int[] arr = new int[201];

        for(int i = 0 ; i < n ; i++){

            int start = sc.nextInt() + 100;
            int end = sc.nextInt() + 100;

            for(int j = start ; j <= end - 1 ; j++){
                arr[j]++;
            }
        }

        int max = 0;

        for(int i = 0; i < arr.length; i++){
            if(max < arr[i]) max = arr[i];
        }

        System.out.println(max);

        
    }
}
import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc= new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr= new int[2 * n];

        for(int i = 0 ; i < 2 * n ; i++){
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);
        
        for(int i = 0 ; i < n ; i++){
            System.out.print(arr[i] + " ");
        }
        int result = func(arr);

        System.out.println(result);
    }

    static int func(int[] arr){

        int max = 0;

        for(int i = 0 ; i < arr.length; i++){
            int temp = arr[i] + arr[arr.length - i - 1];

            if(temp > max) max = temp;

        }

        return max;

    }
}
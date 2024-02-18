import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        arr = new int[n];
        

        for(int i = 0 ; i < n ;i++){
            arr[i] = sc.nextInt();
        }

        int result = func(n);
        System.out.println(result);

    }

    static int func(int n){

        if(n == 0) return max;
        if(arr[n-1] >= max) max = arr[n-1];

        return func(n - 1);
    }

    static int[] arr;
    static int max = 0;

}
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int[] arr = new int[N];

        for(int i = 0 ; i < N ; i++){
            arr[i] = sc.nextInt();

        }

        func(arr);


    }

    static void func(int[] arr){
        
        for(int i = 0 ; i < arr.length ; i++){

            if(arr[i] % 2 ==0){
                arr[i] /= 2;
                System.out.print(arr[i] + " ");
            }else{
            System.out.print(arr[i] + " ");

            }
        }


    }
}
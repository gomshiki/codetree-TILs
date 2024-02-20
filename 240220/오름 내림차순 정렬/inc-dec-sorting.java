import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];
        for(int i = 0; i < n ; i++){
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);
        Arrays.stream(arr).forEach(v -> System.out.print(v + " "));
        
        Integer[] arr2 = Arrays.stream(arr).boxed().toArray(Integer[]::new);
        System.out.println();

        Arrays.sort(arr2, Collections.reverseOrder());

        Arrays.stream(arr2).forEach(v -> System.out.print(v + " "));


    }
}
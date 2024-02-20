import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] a = br.readLine().split(" ");
        
        int n = Integer.parseInt(a[0]);
        int k = Integer.parseInt(a[1]);
        
        String[] arr = br.readLine().split(" ");

        Integer[] arr2 = Arrays.stream(arr).map(Integer::parseInt).sorted().toArray(Integer[]::new);

        System.out.println(arr2[k-1]);

        

    }
}
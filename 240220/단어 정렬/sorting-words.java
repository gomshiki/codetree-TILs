import java.io.*;
import java.util.Arrays;

public class Main {
    
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        String[] arr = new String[n];
        for(int i = 0 ; i < n ; i++){
            arr[i] = br.readLine();
        }

        Arrays.sort(arr);

        Arrays.stream(arr).forEach(System.out::println);
    }
}
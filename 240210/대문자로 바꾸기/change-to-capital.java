import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        for(int i = 0 ; i < 5 ; i++) {
            String[] a = br.readLine().split(" ");
            Arrays.stream(a).map(String::toUpperCase).forEach(s ->System.out.print(s + " "));
            System.out.println();
        }
    }

}
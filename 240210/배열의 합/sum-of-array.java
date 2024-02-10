import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 4; i++) {
            String[] s = br.readLine().split(" ");
            int sum = Arrays.stream(s).mapToInt(Integer::parseInt).sum();
            System.out.println(sum);
        }
    }
}
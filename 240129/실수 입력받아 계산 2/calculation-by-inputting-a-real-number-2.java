import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        double a = Double.parseDouble(br.readLine());

        System.out.printf("%.2f", a + 1.5);

    }
}
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] inputDatas = br.readLine().split(" ");

        int sum = 0;

        for(int i = 0; i < inputDatas.length ; i++){
            sum += Integer.parseInt(inputDatas[i]);
        }

        System.out.println(inputDatas[0] + " "+ inputDatas[1] + " " + sum);
    }
}
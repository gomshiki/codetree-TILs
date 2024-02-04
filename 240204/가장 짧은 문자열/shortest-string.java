import java.util.Scanner;
import java.lang.Integer;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.

        Scanner sc = new Scanner(System.in);

        int maxVal = 0;
        int minVal = Integer.MAX_VALUE;

        for(int i = 0 ; i < 3 ; i++){
            int inputData = sc.next().length();
            if(maxVal < inputData) maxVal = inputData;
            if(minVal > inputData) minVal = inputData;
        }

        System.out.println(maxVal - minVal);
    }
}
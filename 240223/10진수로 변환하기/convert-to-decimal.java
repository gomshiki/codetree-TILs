import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.

        Scanner sc = new Scanner(System.in);

        String[] strArray = sc.next().split("");

        int[] binary = new int[strArray.length];

        for(int i = strArray.length -1 ; i >= 0; i--){
            binary[i] = Integer.parseInt(strArray[i]);
        }

        int num = 0;

        for(int i = 0 ; i < binary.length ; i++){

            num = num * 2 + binary[i];

        }

        System.out.println(num);
    }
}
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.

        Scanner sc = new Scanner(System.in);

        int[] arry = new int[100];
        int count = 0;

        for(int i = 0; i < 100 ; i++){
            int a  = sc.nextInt();
            if(a == 0 ) break;
            arry[i] = a;
            count++;
        }

        for(int i = 0; i < count ; i++){
            if(arry[i] % 2 != 0) System.out.printf("%d ", arry[i]+3);
            else System.out.printf("%d ", arry[i]/2);
        }
    }
}
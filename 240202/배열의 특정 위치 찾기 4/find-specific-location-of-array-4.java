import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.

        Scanner sc = new Scanner(System.in);

        int count = 0;
        int sum = 0;


        int[] arry = new int[10];
        for(int i = 0 ; i< 10 ;i++ ){
            int a = sc.nextInt();
            if(a == 0) break;
            count++;
            arry[i] = a;
        }

        int count1 = 0;
        int sum1 = 0;
        for(int j = 0 ; j < count ; j++){
            if(arry[j] % 2 == 0){
                sum1+= arry[j];
                count1++;
            }
        }

        System.out.println(count1 + " " + sum1);
    }
}
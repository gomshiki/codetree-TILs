import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.

        Scanner sc = new Scanner(System.in);

        int[] countArry = new int[4];

        for(int i = 0; i < 3 ; i++){
            char symptom = sc.next().charAt(0);
            int temperature = sc.nextInt();

            if(symptom =='Y' && temperature >= 37) countArry[0]++;
            else if(symptom =='N' && temperature >= 37) countArry[1]++;
            else if(symptom == 'Y' && temperature < 37) countArry[2]++;
            else if(symptom == 'N' && temperature < 37) countArry[3]++;
        }

        for(int i = 0 ; i < 4 ; i++){
            System.out.printf("%d ", countArry[i]);
        }

        if(countArry[0] >= 2) System.out.print("E");
    }
}
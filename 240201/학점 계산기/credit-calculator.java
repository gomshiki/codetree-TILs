import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        double[] arry = new double[n];

        // 배열에 학점 담기
        for(int i = 0 ; i<n ; i++){
            arry[i] = sc.nextDouble();
        }

        double sum = 0;
    
        for(int j = 0; j < n ; j++){
            sum += arry[j];
        }

        double avg = sum / n;
        System.out.printf("%.1f\n",avg);
        if(avg >= 4.0){
            System.out.println("Perfect");
        }else if(avg >= 3.0){
            System.out.println("Good");
        }else{
            System.out.println("Poor");
        }



    }
}
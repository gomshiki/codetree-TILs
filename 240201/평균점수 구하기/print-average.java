import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        double sum = 0;
        int count = 0;
        while(sc.hasNext()){
            sum += sc.nextDouble();
            count ++;
        }

        System.out.printf("%.1f",sum/count);

    }
}
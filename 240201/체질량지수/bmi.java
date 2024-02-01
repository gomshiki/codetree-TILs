import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double cmheight = sc.nextDouble();
        double mheight =cmheight*0.01;
        double weight = sc.nextDouble();

        int BMI = (int)(weight / (mheight*mheight));
        System.out.println(BMI);
        
        if (BMI >= 25){
            System.out.println("Obesity");
        }
    }
}
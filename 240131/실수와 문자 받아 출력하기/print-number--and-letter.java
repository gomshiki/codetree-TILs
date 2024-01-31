import java.util.Scanner;
import java.lang.StringBuilder;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        sb.append(sc.next().charAt(0)+"\n");
        
        sb.append(String.format("%.2f", sc.nextDouble())+"\n");
        sb.append(String.format("%.2f", sc.nextDouble()));
        
        System.out.println(sb.toString());


    }
}
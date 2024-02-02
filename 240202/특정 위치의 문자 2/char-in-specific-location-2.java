import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char[] arry = new char[10];

        for(int i = 0 ; i < 10 ; i++){
            arry[i] = sc.next().charAt(0);
        }

        System.out.printf("%c %c %c", arry[1], arry[4], arry[7]);
    }
}
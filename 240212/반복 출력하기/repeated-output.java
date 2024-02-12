import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int N  = sc.nextInt();

        printSomething(N);


    }

    public static void printSomething(int rowNum){
        for(int i = 0 ; i < rowNum ; i++){
            System.out.println("12345^&*()_");
        }
    }
}
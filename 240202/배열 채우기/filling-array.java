import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int[] arry = new int[10];
        int count = 0;

        for(int i = 0; i < arry.length ; i++){
            
            int a = sc.nextInt();

            if(a == 0 ){
               break;
            }else {
                arry[i] = a;
                count++;
            }

        }

        for(int j = count-1; j >= 0 ; j-- ){
            System.out.print(arry[j] + " ");
        }

    }
}
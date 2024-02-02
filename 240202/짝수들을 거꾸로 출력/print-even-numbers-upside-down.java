import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arry= new int[n];
        
        for(int i = 0 ; i < n ; i++){
            
            int a = sc.nextInt();
            arry[i] = a;

        }

        for(int j = n -1 ; j >= 0; j--){
            if(arry[j] % 2 ==  0){
                System.out.print(arry[j]+" ");
            }
        }
        
        


    }
}
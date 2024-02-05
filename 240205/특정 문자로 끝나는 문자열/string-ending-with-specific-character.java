import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        String[] arry = new String[10];
        
        for(int i = 0; i < 10 ; i++){
            arry[i] = sc.next();
        }

        char target = sc.next().charAt(0);
        int idx = 0;

        for(int j = 0; j < 10 ; j++){

            if(target == arry[j].charAt(arry[j].length()-1)){

                System.out.println(arry[j]);
                idx = j;

            }

        }

        if( idx == 0) System.out.println("None");


    }
}
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        String a = sc.next();

        int q = sc.nextInt();

        for(int i = 0 ; i  < q ; i++){

            int b = sc.nextInt();
            // abcd

            if(b == 1){
               a = a.substring(1, a.length()) + a.charAt(0); 
               
            }

            if(b == 2){
                a = a.charAt(a.length()-1) + a.substring(0, a.length()-1);
            }

            if(b == 3){

                    String temp = "";

                    for(int j = a.length() ; j > 0 ; j--){
                        temp += a.charAt(j - 1); 
                    }
                    a = temp;



            }
            
            System.out.println(a);

        }

    }
}
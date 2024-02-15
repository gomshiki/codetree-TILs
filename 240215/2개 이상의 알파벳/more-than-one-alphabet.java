import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        String A = sc.next();

        func(A);

    }

    static void func(String str){

        char a = str.charAt(0);
        int cnt = 0;
        for(int i = 1 ; i < str.length(); i++){

            if(a != str.charAt(i)){
                cnt++;
            }

        
        }
        
            if(cnt >= 1){
                System.out.println("Yes");
            }else{
                System.out.println("No");
            }
    }
}
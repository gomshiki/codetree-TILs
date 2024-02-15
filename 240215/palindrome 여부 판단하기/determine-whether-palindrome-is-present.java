import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        String a = sc.next();
        System.out.println(func(a));

    }

    static String func(String a){
        
        String result = "Yes";

        for(int i = 0 ; i < a.length() / 2; i++){

            if(a.charAt(i) != a.charAt(a.length() -1 - i)){
                result = "No";
                break;
            }

        }

        return result;

    }
}
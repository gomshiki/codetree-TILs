import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String totStr = "";

        for(int i = 0 ; i < n ; i++){
            totStr += sc.next();
        }

        for(int j = 1 ; j < totStr.length() + 1 ; j++){
            System.out.printf("%c", totStr.charAt(j-1));
            if(j % 5 == 0) System.out.println();
        }
    }
}
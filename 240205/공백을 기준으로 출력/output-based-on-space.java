import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        String a = sc.nextLine();
        String b = sc.nextLine();



        for(int i = 0;  i < a.length(); i++){
            if(a.charAt(i) != ' ') System.out.print(a.charAt(i));
        }

        for(int i = 0;  i < b.length(); i++){
            if(b.charAt(i) != ' ') System.out.print(b.charAt(i));
        }
    }
}
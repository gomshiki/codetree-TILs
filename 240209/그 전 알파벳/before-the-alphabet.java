import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int inputCh = (int) sc.next().charAt(0);

        int result;

        if(inputCh == (int) 'a'){
            result = (int)'z';
        }else{
            result = inputCh - 1;
        }

        System.out.printf("%c", (char) result);
    }
}
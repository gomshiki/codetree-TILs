import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.

        Scanner sc =new Scanner(System.in);

        char[] str1 = sc.next().toCharArray();
        char[] str2 = sc.next().toCharArray();
        

        Arrays.sort(str1);
        Arrays.sort(str2);

        String str3 = new String(str1);
        String str4 = new String(str2);

        if(str3.equals(str4)){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }

    }
}
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        String A = sc.next();
        String B = sc.next();
        int cnt = 0;

        while(true){
        
            if(A.equals(B)) {
               System.out.println(cnt);
               break;

            }else{
                char[] arr = A.toCharArray();
                
                char last = arr[A.length() - 1];
                for(int i = A.length() - 2 ; i >= 0 ; i--){
                    arr[i + 1] = arr[i];
                }
                arr[0] = last;

                A = new String(arr);
                cnt++;
            }


        }
    }
}
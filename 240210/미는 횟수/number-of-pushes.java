import java.util.Scanner;

public class Main{
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        // 문자열 입력
        String a = sc.next();
        String b = sc.next();

        int len = a.length();
        int cnt = 0;

        for(int i = 0 ; i <len ; i++){
            a = a.substring(len - 1) + a.substring(0 , len-1);

            cnt++;
            if(a.equals(b)){
                System.out.println(cnt);
                break;
            }

            if( i == len -1){
                System.out.println(-1);
            }
        }
    }
}
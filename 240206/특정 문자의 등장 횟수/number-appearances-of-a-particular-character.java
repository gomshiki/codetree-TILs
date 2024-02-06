import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String a= sc.next();

        int cnt1 = 0;
        int cnt2 = 0;

        
        for(int i = 0 ; i < a.length()-1; i++){
            String target = "";
            target += a.charAt(i); 
            target += a.charAt(i+1);

            if(target.equals("ee")){
                cnt1++;
            }

            if(target.equals("eb")){
                cnt2++;
            }

        }
        System.out.printf("%d %d", cnt1, cnt2);
    }
}
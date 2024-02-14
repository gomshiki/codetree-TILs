import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int cnt = 0;
        for(int i = a ; i <= b ; i++){

            if(func1(i) || func2(i)){
                cnt++;
            }

        }

        System.out.println(cnt);
    }

    static boolean func1(int n){
        
        String a = Integer.toString(n);
        if(a.contains("3") || a.contains("6") || a.contains("9")){
            return true;
        }else{
            return false;
        }

    }
    static boolean func2(int n){
        
        return n % 3 == 0 ? true : false;

    }
}
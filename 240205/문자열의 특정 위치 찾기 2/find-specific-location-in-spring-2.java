import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 여기에 코드를 작성해주세요.
        String[] arry = new String[]{"apple", "banana", "grape", "blueberry", "orange"};

        char a = sc.next().charAt(0);

        int cnt = 0;
        for(int i = 0 ; i < arry.length; i++){

            for(int j = 2 ; j < 4 ; j++){
                if(arry[i].charAt(j) == a){
                    System.out.println(arry[i]);
                    cnt++;
                    break;
                }
            }

        }

        System.out.println(cnt);

    }
}
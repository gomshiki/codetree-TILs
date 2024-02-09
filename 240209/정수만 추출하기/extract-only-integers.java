import java.util.Scanner;

public class Main {

    // check below code snippet for main method
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        String A = sc.next();
        String B = sc.next();


        int sum = 0;

        StringBuilder sb = new StringBuilder();

        for(int i = 0 ; i < A.length() ; i++){

            char target = A.charAt(i);
            if(target < '0' || target > '9'){
                break;
            }else{
                sb.append(target);
            }
        }
        String parseA = sb.toString();

        sum += Integer.parseInt(parseA);

        sb = new StringBuilder();
        for(int i = 0 ; i < B.length() ; i++){
            char target = B.charAt(i);
            if(target < '0' || target > '9'){
                break;
            }else{
                sb.append(target);

            }
        }
          String parseB = sb.toString();
        sum += Integer.parseInt(parseB);

        System.out.println(sum);



    }
}
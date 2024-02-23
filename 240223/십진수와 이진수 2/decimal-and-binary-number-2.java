import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc =new Scanner(System.in);

        String binary  = sc.next();

        int decimal = toDecimal(binary);

        decimal = decimal * 17;

        toBinary(decimal);

    }

    static int toDecimal(String binary){

        int num = 0;

        for(int i = 0 ; i < binary.length(); i++){
            num = num * 2 + binary.charAt(i) - '0';
        }

        return num;
    }

    static void toBinary(int n){

        int cnt = 0;
        int[] arr = new int[20];

        while(true){

            if(n < 2){
                arr[cnt++] = n;
                break;
            }

            arr[cnt++] = n % 2;
            n /= 2;
        }

        for(int i = cnt - 1 ; i >= 0 ; i--){
            System.out.print(arr[i]);
        }


    }
}
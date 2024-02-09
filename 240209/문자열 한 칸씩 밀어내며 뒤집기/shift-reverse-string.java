import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        String inputStr = sc.next();
        
        int strSize = inputStr.length();
        int q = sc.nextInt();

        for(int i = 0 ; i  < q ; i++){

            int b = sc.nextInt();
            // abcd

            if(b == 1){
               inputStr = inputStr.substring(1, strSize) + inputStr.charAt(0); 
            System.out.println(inputStr);

               
            }

            else if(b == 2){
                inputStr = inputStr.charAt(strSize-1) + inputStr.substring(0, strSize-1);
            System.out.println(inputStr);

            }

            else if(b == 3){

                char[] arr = inputStr.toCharArray();

                char temp;
                for(int j = 0; j < strSize / 2; j++) {
                    temp = arr[j];
                    arr[j] = arr[strSize - j - 1];
                    arr[strSize - j - 1] = temp;
                }

                inputStr = new String(arr);
                System.out.println(inputStr);

            }
            

        }

    }
}
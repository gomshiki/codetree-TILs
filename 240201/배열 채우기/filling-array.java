import java.util.Scanner;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> arrayList = new ArrayList<>();

        for(int i = 0; i < 10 ; i++){
            
            int a = sc.nextInt();
            
            arrayList.add(a);
        }
        

        for(int i = 0; i < arrayList.size(); i++){
            System.out.print(arrayList.get(arrayList.size() - (i+1)) + " ");
        }

    }
}
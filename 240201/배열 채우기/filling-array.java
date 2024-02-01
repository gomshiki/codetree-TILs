import java.util.Scanner;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> arrayList = new ArrayList<>();
        while(true){
            
            int a = sc.nextInt();
            if(a == 0){ break;}
            arrayList.add(a);

        }

        for(int i = 0; i < arrayList.size(); i++){
            System.out.print(arrayList.get(arrayList.size() - (i+1)) + " ");
        }

    }
}
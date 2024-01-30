import java.util.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        ArrayList<Integer> arrayList = new ArrayList();

        for(int i = 0; i < N ; i++){

            String[] inputDatas = br.readLine().split(" ");
            
            if(inputDatas[0].equals("push_back")){
                arrayList.add(Integer.parseInt(inputDatas[1]));
            }
            if(inputDatas[0].equals("get")){
                System.out.println(arrayList.get(Integer.parseInt(inputDatas[1])-1));
            }
            if(inputDatas[0].equals("size")){
                System.out.println(arrayList.size());
            }
            if(inputDatas[0].equals("pop_back")){
                arrayList.remove(arrayList.size()-1);
            }

        }


    }
}
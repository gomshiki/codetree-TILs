import java.util.Scanner;

class IntValue{

    int value;

    public IntValue(int value){
        this.value = value;
    }

}

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc= new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        IntValue m = new IntValue(a);
        IntValue n = new IntValue(b);

        func(m, n);

        System.out.println(m.value + " " + n.value);
    }

    static void func(IntValue m, IntValue n){

        if(m.value > n.value){
            m.value *= 2;
            n.value += 10;
        }else{
            n.value *= 2;
            m.value += 10;
        }

    }
}
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt(); // 일
        int b = sc.nextInt(); // 시
        int c = sc.nextInt(); // 분

        int resultMin = func(a, b, c);

        System.out.println(resultMin);
    }

    static int func(int day, int hour ,int min){
        
        // 타겟 일자 시간 
        int startDate = 11;
        int startHour = 11;
        int startMin = 11;
    
        if(startDate >= day && startHour >= hour && startMin > min) return -1;

        // 60min = 1 hour
        // 24 hour = 1day
        // 60 * 24 = 1440 min = 1day


        int resultDay= day - startDate;
        int resultHour = hour - startHour;
        int resultMin = min - startMin;         
        return resultMin + resultHour *60  + resultDay * 60 * 24;
    }
}
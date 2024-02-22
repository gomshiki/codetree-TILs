import java.util.Scanner;

class Spy {
     String secretCode;
     String meetingPoint;
     int time;

    public Spy(String secretCode, String meetingPoint, int time){
        this.secretCode = secretCode;
        this.meetingPoint = meetingPoint;
        this.time = time;
    }
}



public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner  sc = new Scanner(System.in);

        String secretCode = sc.next();
        String meetingPoint = sc.next();
        int time = sc.nextInt();

        Spy spy = new Spy(secretCode, meetingPoint, time);

        System.out.printf("secret code : %s \n", spy.secretCode);
        System.out.printf("meeting point : %s \n", spy.meetingPoint);
        System.out.printf("time : %s", spy.time);

    }
}
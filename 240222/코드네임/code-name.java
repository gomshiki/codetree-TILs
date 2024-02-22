import java.util.Scanner;

class Agent{
    String codeName;
    int score;

    public Agent(String codeName, int score){
        this.codeName = codeName;
        this.score = score;
    }

}

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.

        Scanner sc = new Scanner(System.in);
        Agent[] agent = new Agent[5];
        
        for(int i = 0 ; i < 5; i ++){
            String codeName = sc.next();
            int score = sc.nextInt();

            agent[i] = new Agent(codeName, score);
        }

        System.out.println(agent[0].codeName + " "+ agent[0].score);

    }
}
import java.util.Scanner;

class Agent{
    String codeName;
    int score;

    public Agent(String codeName, int score){
        this.codeName = codeName;
        this.score = score;
    }

    public Agent(){
        this.codeName = "";
        this.score = 0;
    }

}

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.

        Scanner sc = new Scanner(System.in);
        Agent[] agents = new Agent[5];
        
        for(int i = 0 ; i < 5; i ++){
            String codeName = sc.next();
            int score = sc.nextInt();

            agents[i] = new Agent(codeName, score);
        }

        Agent lowerScoreAgent = func(agents);

        System.out.println(lowerScoreAgent.codeName + " "+ lowerScoreAgent.score);

    }

    static Agent func(Agent[] agents){

        int scoreMin = Integer.MAX_VALUE;
        Agent returnAgent = new Agent();

        for(int i = 0 ; i < agents.length; i++){

            if(agents[i].score < scoreMin){
                scoreMin = agents[i].score;
                returnAgent.codeName = agents[i].codeName;
                returnAgent.score = agents[i].score;
            }

        }

        return returnAgent;
    }
}
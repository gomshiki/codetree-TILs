import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.

        Scanner sc= new Scanner(System.in);
        String dir = sc.next();

        int[] dx = new int[]{1, 0, -1 ,0};
        int[] dy = new int[]{0 , -1 , 0 ,1};

        int x = 0;
        int y = 0;

        int nx = 0;
        int ny = 0;

        int dirNum = 3; // north

        for(int i = 0 ; i < dir.length(); i++){
            
            char dirInfo = dir.charAt(i);

            if(dirInfo == 'L'){
                dirNum = (dirNum - 1 + 4) % 4;
            }else if(dirInfo == 'R'){
                dirNum = (dirNum + 1) % 4;
            }else if(dirInfo == 'F'){
                nx = nx + dx[dirNum];
                ny = ny + dy[dirNum];
            }
        }

        System.out.println(nx + " " + ny);



        
    }
}
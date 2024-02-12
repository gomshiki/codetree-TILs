import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc =new Scanner(System.in);

        int[] dx = new int[]{-1, 0, 1, 0};
        int[] dy = new int[]{0, -1, 0, 1};

        int N = sc.nextInt();

        int x = 0;
        int y = 0;

        for(int i = 0 ; i < N ; i++){
            char dir = sc.next().charAt(0);
            int distance = sc.nextInt();

            if(dir == 'W'){
                
                x = x+distance * dx[0];
                y = y+distance * dy[0];

            }else if(dir == 'S'){

                x = x+distance * dx[1];
                y = y+distance * dy[1];
            }else if(dir == 'E'){

                x = x+distance * dx[2];
                y = y+distance * dy[2];
            }else if(dir == 'N'){

                x = x + distance * dx[3];
                y = y + distance * dy[3];
            }

        }

        System.out.printf("%d %d", x, y);
    }
}
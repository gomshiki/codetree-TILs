import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
                            // w, S, E, N
        int[] dx = new int[]{-1, 0, 1, 0};
        int[] dy = new int[]{0, -1, 0, 1};

        int x = 0, y = 0; // 처음 위치
        int nx=0, ny = 0;

        for(int i =0; i < n ; i++){

            char dir = sc.next().charAt(0);
            int dis = sc.nextInt();
            x = nx;
            y = ny;
            // boundary 설정
            if(dir == 'W'){
                nx = x + (dx[0] * dis);
                ny = y + (dy[0] * dis);
            }else if(dir == 'S'){
                nx = x + (dx[1] * dis); 
                ny = y + (dy[1] * dis);
            }else if(dir == 'E'){
                nx = x + (dx[2] * dis); 
                ny = y + (dy[2] * dis);
            }else if(dir == 'N'){
                nx = x + (dx[3] * dis); 
                ny = y + (dy[3] * dis);
            }

        }

        System.out.println(nx + " " + ny);
    }
}
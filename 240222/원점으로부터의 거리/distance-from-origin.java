import java.util.Scanner;
import java.util.Arrays;

class Point implements Comparable<Point> {
    int x,y, id;

    public Point(int x , int y, int id){
        this.x = x;
        this.y = y;
        this.id = id;
    }

    @Override
    public int compareTo(Point point){
        return (Math.abs(this.x) + Math.abs(this.y)) - (Math.abs(point.x) + Math.abs(point.y));
    }


}

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        Point[] points = new Point[n];

        for(int i = 0 ; i < n ; i++){
            int x = sc.nextInt();
            int y = sc.nextInt();
            points[i] = new Point(x, y, i+1);
        }

        Arrays.sort(points);

        for(int i = 0 ; i < n ; i++){
            System.out.println(points[i].id);
        }

    }
}
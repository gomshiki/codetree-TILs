import java.util.Scanner;
class User{
    String id, level;

    public User(String id, String level){
        this.id = id;
        this.level = level;
    }

    public User(){
        this.id = "";
        this.level = "";
    }

}




public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        User user1 = new User();

        user1.id = "codetree";
        user1.level = "10";

        User user2 = new User(sc.next(), sc.next());

        System.out.printf("user %s lv %s\n", user1.id, user1.level);
        System.out.printf("user %s lv %s", user2.id, user2.level);
    }
}
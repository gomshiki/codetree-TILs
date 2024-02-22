import java.util.Scanner;
import java.util.Arrays;

class Student implements Comparable<Student> {
    int id, height, weight;

    public Student(int id, int height, int weight){
        this.id = id;
        this.height = height;
        this.weight = weight;
    }


    @Override
    public int compareTo(Student student){
        if(student.height == this.height) {
            
            if(student.weight == this.weight){
                return student.id - this.id;
            }

            return student.weight - this.weight;
        }
        
        return student.height - this.height;
    }
}

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.

        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();

        Student[] students = new Student[n];

        for(int i = 0; i < n ; i++){
            int height = sc.nextInt();
            int weight = sc.nextInt();
            students[i] = new Student(i+1, height, weight);
        }

        Arrays.sort(students);

        for(int i = 0 ; i< n ; i++){
            System.out.printf("%d %d %d\n", 
                students[i].height, students[i].weight, students[i].id);
        }
    }
}
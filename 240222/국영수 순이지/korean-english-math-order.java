import java.util.Scanner;
import java.util.Arrays;

class Student implements Comparable<Student> {
    String name;
    int korean, english, math;

    public Student(String name, int korean, int english, int math){
        this.name = name;
        this.korean = korean;
        this.english = english;
        this.math = math;
    }
    
    @Override
    public int compareTo(Student student){
        
        if(this.korean == student.korean){
            
            if(this.english == student.english){
                return student.math - this.math;
            }

            return student.english - this.english;
        }

        return student.korean - this.korean;
    }

}


public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        Student[] students = new Student[n];

        for(int i =0 ; i< n ; i++){
            String name = sc.next();
            int korean = sc.nextInt();
            int english = sc.nextInt();
            int math = sc.nextInt();

            students[i] = new Student(name, korean, english, math);
        }

        Arrays.sort(students);

        for(int i = 0 ; i < n ; i++){

            System.out.printf("%s %d %d %d\n", students[i].name, students[i].korean, 
            students[i].english, students[i].math);

        }

    }
}
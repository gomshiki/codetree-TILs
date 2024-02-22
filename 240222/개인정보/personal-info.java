import java.util.Scanner;
import java.util.Arrays;
import java.util.Comparator;

class Person{
    String name;
    int height ;
    double weight;

    public Person(String name, int height, double weight){
        this.name = name;
        this.height = height;
        this.weight = weight;
    }

}

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        
        Person[] people = new Person[5];

        for(int i = 0 ; i < 5; i++){

            String name = sc.next();
            int height = sc.nextInt();
            double weight = sc.nextDouble();
            people[i] = new Person(name, height, weight);
        }

        // 문자열 정렬
        Arrays.sort(people, new Comparator<Person>(){
            
            @Override
            public int compare(Person a, Person b){
                return a.name.compareTo(b.name);
            }
        });

        System.out.println("name");

        for(int i =0; i < 5; i++){
            System.out.printf("%s %d %.1f\n", people[i].name ,people[i].height, people[i].weight);
        }


        System.out.println();
        System.out.println("height");

        Arrays.sort(people, new Comparator<Person>(){

            @Override
            public int compare(Person a, Person b){
                return b.height - a.height;
            }
        });

        for(int i =0; i < 5; i++){
            System.out.printf("%s %d %.1f\n", people[i].name ,people[i].height, people[i].weight);
        }

    }
}
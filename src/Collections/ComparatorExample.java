package Collections;


import java.util.ArrayList;
import java.util.List;

class Student{
    String name;
    int id;
    int marks;

    public Student(String name, int id, int marks) {
        this.name = name;
        this.id = id;
        this.marks = marks;
    }

    public String getName(){return name;}

    public int getMarks(){return marks;}
}
public class ComparatorExample {
    public static void main(String [] args){
        List<Student> list=new ArrayList<>();
        list.add(new Student("Atharva",100,90));
        list.add(new Student("Swanand",105,70));
        list.add(new Student("Arya",102,20));
        list.add(new Student("Prajwal",103,95));
        list.add(new Student("Deep",108,60));
        System.out.println("Initially in the list");
        for(Student s:list){
            System.out.println(s.getName()+" "+ s.getMarks());
        }

        list.sort((o1,o2)->o2.getMarks()-o1.getMarks());
        System.out.println("After Sorting by marks");
        for(Student s:list){
            System.out.println(s.getName()+" "+ s.getMarks());
        }





    }
}

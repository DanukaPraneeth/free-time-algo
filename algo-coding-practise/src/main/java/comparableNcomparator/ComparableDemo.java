import java.util.*;

public class ComparableDemo{

    /*
     * One difference between Comparable and Comparator is that any Object implementing Comparable must override 
     * the compareTo() method and define a natural ordering for the said Object. 
     * On the other hand, Comparator allows for a seperate class to define a compare() method, 
     * which can be used to define multiple comparison strategies for comparing the said Object.
     */
    
    public static void main(String[] args){
        List<Student> students = new ArrayList<>();
        students.add(new Student(3, "Alice", 22));
        students.add(new Student(1, "Bob", 20));
        students.add(new Student(2, "Charlie", 23));

        // Natural ordering (from Comparable in Student)
        Collections.sort(students);
        System.out.println("Sorted by age (Comparable):");
        students.forEach(System.out::println);

        // Custom sorting (from separate Comparator class)
        Collections.sort(students, new NameComparator());
        System.out.println("\nSorted by name (Comparator):");
        students.forEach(System.out::println);
        
        Collections.sort(students, new IdComparator());
        System.out.println("\nSorted by ID (Comparator):");
        students.forEach(System.out::println);
    }

}


public class Student implements Comparable<Student>{
    int id;
    String name;
    int age;

    public Student(int id, String name, int age){
        this.id = id;
        this.name = name;
        this.age = age;
    }

    // Must define compareTo() here — natural order: by age
    @Override
    public int compareTo(Student other){
        return this.age - other.age;
    }

    @Override
    public String toString(){
        return id + " - " + name + " - " + age;
    }
}


public class NameComparator implements Comparator<Student> {
    @Override
    public int compare(Student s1, Student s2) {
        return s1.name.compareTo(s2.name); // sort by name
    }
}

public class IdComparator implements Comparator<Student>{
    @Override
    public int compare(Student s1, Student s2){
        return Integer.compare(s1.id, s2.id);
    }
}
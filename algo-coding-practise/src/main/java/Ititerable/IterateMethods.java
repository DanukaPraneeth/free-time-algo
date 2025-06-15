package Ititerable;
import java.io.*;
import java.util.*;

public class IterateMethods {

    public static void main(String[] args){
        // Create List
        List<String> list = new ArrayList<>();
        list.add("Test");
        list.add("for");
        list.add("Iteration");

        // Iterate through the list using for-each loop : uses Iterable internally
        for(String elements : list){
            System.out.println(elements);
        }

        // Iterate though the list: Uses Iterable with lambda
        list.forEach( (elements) -> { System.out.println(elements); } );

        // Iterate an Iterable using Iterator
        Iterator<String> iterator = list.iterator();

        while(iterator.hasNext()){
            String element = iterator.next();
            System.out.println(element);
        }

        /* 
        
        If you had a custom class and wanted to use a for-each loop on it, you’d do this:
        class MyData implements Iterable<String> {
            private List<String> data = List.of("A", "B", "C");
        
            public Iterator<String> iterator() {
                return data.iterator();
            }
        }
        for (String s : new MyData()) {
            System.out.println(s);
        }

        */



    }
    
}

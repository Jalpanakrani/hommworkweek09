package homeworkweek9;
//Write a Java program to iterate through all elements in an array list using Iterator.

import java.*;
import java.util.ArrayList;
import java.util.ListIterator;

public class Programme05 {
    public static void main(String[] args) {
      //Creating an ArrayList
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(3);
        numbers.add(2);
        System.out.println("ArrayList : " + numbers);

        //Creating an instance of ListIterator
        ListIterator<Integer> iterate = numbers.listIterator();
        System.out.println("Interating over ArrayList : ");
        while(iterate.hasNext()) {
            System.out.println(iterate.next() + " ,");
        }
    }
}
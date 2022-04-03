package homeworkweek9;
 //Create a HashMap object called people that will store String keys and Integer
 //values: And use for each loop to iterate the value from Map.

import java.util.HashMap;
public class Programme09 {
    public static void main(String[] args) {

        //Creat a HashMap object called people
        HashMap<String,Integer> people = new HashMap<String,Integer>();

        //Add keys and values (Name, Age)
        people.put("John",32);
        people.put("Steve",30);
        people.put("Angie",33);

        for(String i : people.keySet()){
            System.out.println("key : " + " value: " + people.get(i));

        }
    }
}

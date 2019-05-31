import java.util.HashMap;
import java.util.Map;
import java.util.Iterator;
import java.util.Set;

public class hashMaps {

    public static void main(String[] args){

        //HashMaps store keys and values. In this case, our keys are Integers and our values are Strings
        HashMap<Integer,String> hmap = new HashMap<>();  //declare a new HashMap object

        //Add elements to the HashMap using .put()
        hmap.put(2,"Jimmy Dang");
        hmap.put(4,"Chris Bare");
        hmap.put(6,"Pasha Maher");
        hmap.put(100,"Queen Elizabeth");
        hmap.put(8,"Bill Gates");

        //Display the keys and values of the HashMap using an Iterator
        Set set = hmap.entrySet();
        Iterator iterator = set.iterator();
        while(iterator.hasNext()){
            Map.Entry mEntry = (Map.Entry)iterator.next();
            System.out.println("Key: " + mEntry.getKey() + "  Value: " + mEntry.getValue());
        }

        //Get value based on the key
        String myString = hmap.get(3);  //use .get() to get the value with the key that is specified
        System.out.println("Value with key of 3 is: " + myString);

    }
}

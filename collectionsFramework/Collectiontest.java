package collectionsFramework;

import java.util.ArrayList;
import java.util.Arrays;

public class Collectiontest {
    public static void main(String[] args) {
     
        // create object of ArrayList
        ArrayList<Integer> ArrLis
            = new ArrayList<Integer>();
 
        // Add elements
        ArrLis.add(329);
        ArrLis.add(67);
        ArrLis.add(98);
        ArrLis.add(100);
 
        // print ArrayList
        System.out.println("ArrayList: " + ArrLis);
 
        // Get the array of the elements
        // of the ArrayList
        // using toArray() method
        Object[] arr = ArrLis.toArray();
 Arrays.sort(arr);
        System.out.println("Elements of ArrayList"
                           + " as Array: "
                           + Arrays.toString(arr));
    }
}

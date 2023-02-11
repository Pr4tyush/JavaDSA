import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
public class arrayList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        // ArrayList<String> list2 = new ArrayList<String>();
        // ArrayList<Boolean> list3 = new ArrayList<Boolean>(); 

        //to add element in List
        list.add(0);
        list.add(1);
        list.add(2);
        list.add(4);
        System.out.println(list);

        //to get element
        int element = list.get(3);
        System.out.println(element);

        //to set element;

        list.set(0,1);
        System.out.println(list);

        //to delete/remove element
        list.remove(0);
        System.out.println(list);

        //to add at a particular "Index";

        list.add(0,6);
        System.out.println(list);

        //To check the size of an array;
        int si = list.size();
        System.out.println(si);
        

        //to sort the given array via collections package;

        Collections.sort(list);
        System.out.println(list);


    }


    
}

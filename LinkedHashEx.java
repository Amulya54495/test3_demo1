import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;

public class LinkedHashEx {
    public static void main(String args[]){

        //Arraylist is like an array but there is no size limit
        ArrayList<Integer> a1=new ArrayList<Integer>();
          a1.add(100);
          a1.add(101);
        System.out.println("Arraylist as follows:" +a1);

         //Linkedlist is better to use when we want to modify the data by considering the index value
        LinkedList<Float> f1=new LinkedList<Float>();
             f1.add((float)9.0);
             f1.add(1,(float)8.0);
        System.out.println("Linkedlist as follows:" +f1);

              f1.set(1,(float)30.0);
        System.out.println("presentLinkedlist as follows:" +f1);


        // it is used to store the elements in the form of (key value) pair...

            HashMap<Float,String> hmap=new HashMap<Float, String>();
               hmap.put((float)1.0,"Decimal1");
               hmap.put((float)2.00,"Decimal2");
               hmap.put((float)3.000,"Decimal3");
               System.out.println("Hashmaplist as follows:" +hmap);


    }
}

import java.util.ArrayList;
import java.util.Arrays;

public class ListEx {
     public static void main(String args[]){
         ArrayList<String> l=new ArrayList<String>();
         l.add("Mango");
         l.add("Pomogranate");
         l.add("Grapes");
         l.add("pineapple");
         l.add("Orange");

         System.out.println("Fruits are:" +l);

         for (String s : l) {
             System.out.println(s);
         }
     }
}

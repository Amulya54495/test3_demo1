import java.util.*;
public class Lists {
    public static void main(String args[]) {
        List<String> s1 = new ArrayList<String>();
        s1.add("list1");
        s1.add("list2");
        s1.add("list3");

        for (int i = 0; i < s1.size(); i++) {
          System.out.println("LIST:" +s1.get(i));
        }
    }
}

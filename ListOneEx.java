import java.util.ArrayList;
import java.util.Arrays;

public class ListOneEx {
    public static void main(String args[]) {

        ArrayList<Integer> l2 = new ArrayList<Integer>();
        l2.add(01);
        l2.add(02);
        l2.add(03);

        for (Integer a : l2) {
            System.out.println("The numbers are:" + a);
        }

        for (int i = 0; i < l2.size(); i++) {
            System.out.println("ArrayList" +l2.get(i));
        }
    }
}



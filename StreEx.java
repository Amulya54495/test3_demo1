
import java.util.ArrayList;

public class StreEx {

    public static void main(String[] args){
        ArrayList<Integer> b1=new ArrayList<>();
        b1.add(12);
        b1.add(13);
        b1.add(14);
        b1.add(16);
        b1.add(12);
        for (Integer i : b1){
            if(i%2==0) {
                System.out.println(" " +i);
            }
        }
        System.out.println("count Elements using streams:" +b1.stream().filter(i ->i.equals(12)).count());
        System.out.println(b1.stream().findAny());
    }
}

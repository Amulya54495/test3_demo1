
@FunctionalInterface
interface JavaFirst {
    void print();                                          //interface has only one abstract method
    
    default void defaultprint() {
        System.out.println("interface");
    }
    default void defaultprint1() {
        System.out.println("interface2");
  }
    static void staticprint(){
        System.out.println("static");
    }
}

public class JavaFirstEx implements JavaFirst {
    public void print() {
       System.out.println("abstract");  
    }
   public static void main(String[] args) {
        JavaFirstEx ex = new JavaFirstEx();
        ex.print();
        ex.defaultprint();
        ex.defaultprint1();
         JavaFirst.staticprint();
    }
}

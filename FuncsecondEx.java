
     // Checking whether the code works even if we have more than one abstract methods in functional interface

    interface Example2{
    default void example(int num1){
        System.out.println(num1);
    }
  }


    interface Funcsecond extends Example2 {
     void something(String msg);
     String person(String name);

   }
    class FuncsecondEx implements Funcsecond{
      @Override
       public void something(String msg) {
          System.out.println(msg);
      }

        @Override
        public String person(String name) {
            System.out.println(name);
            return null;
        }


      public static void main(String args[]){
          FuncsecondEx a1=new FuncsecondEx();
          a1.something("Good Day");
          a1.example(3);
          a1.person("Person name");

     }
  }


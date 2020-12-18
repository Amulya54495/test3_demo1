
   //one functional interface can extend another functional interface when it doesnot have abstract methods


 interface Example1{                           // nonfunctional interface
        default void example(int num1){
            System.out.println(num1);
        }

    }
   @FunctionalInterface
     interface FuncFirst extends Example1 {
        void something(String msg);
     }

         class FirstFuncEx implements FuncFirst {
        @Override
         public void something(String msg) {
            System.out.println(msg);
        }

            public static void main(String args[]){
            FirstFuncEx a1=new FirstFuncEx();
            a1.something("Mango");
            a1.example(503);

        }


}

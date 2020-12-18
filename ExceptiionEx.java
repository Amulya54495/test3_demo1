public class ExceptionEx{
public static void main(String[] args){
try
  {
       int a=10,b=0;
       int c=a/b;
   }catch(ArithmeticException e)
     System.out.println("we found:" +e);
     }
     try{
      int a[]=new int[5];
      a[10]=12;
      }catch(ArrayIndexOutofBoundsException e1)
     System.out.println("we found:" +e1);
      }
     finally{
      System.out.println("This is exception codeexample);
       }
      }
    }

 
  

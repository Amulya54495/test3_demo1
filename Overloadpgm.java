//overload program

public class Overloadpgm {
       int res;
   public Overloadpgm()
  {
      
    }
   //overload
     public int add(){
       return 0;
      }
        public int add(int n,int m){     //parameters of same type
           return (n+m);
         }
          public int add(int l){
             return l;
            }
             public int add(int a,float b) {   //parameters of different type
                return res=(int)(a/b);
               }
                 public void print(){
                  if(res==0){
                     System.out.println("done");
                     }
                  else{  
                     System.out.println("not done");
                     }
            }
      }
                


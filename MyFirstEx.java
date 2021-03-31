package firstprogram;

public class MyFirstEx {
    int rollno;
    String name;
    int s1=30,s2=30,s3=40;
    public int addRollno(int n){
        this.rollno=n;
        return rollno;
    }
    public String addName(String name)
    {
        this.name=name;
        return name;
    }    
     public void printName(){
         addName("Ammu");
         System.out.println(name);
     }
     public void print(){
          System.out.println("Subject1 marks:" +s1);
          System.out.println("Subject2 marks:" +s2);
          System.out.println("Subject3 marks:" +s3);
     }
     }
    
    

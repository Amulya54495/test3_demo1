public class Pallindrome{
import java.util.Scanner;
 public class Pallindrome {
    public static void main(String[] args){
        String word,revword="";
        Scanner a=new Scanner(System.in);
        System.out.println("Enter a word to check whether it is a pallindrome r not");
        word=a.nextLine();                //Includes spaces
        int length=word.length();
      for(int i=length-1;i>=0;i--){
       revword=revword+word.charAt(i);   //charAt is used to read each character of string
      }
        if(word.equals(revword)){
         System.out.println("Given word is a pallindrome");
        }
        else{
         System.out.println("Given word is not a pallindrome");
 
        }
     }
}

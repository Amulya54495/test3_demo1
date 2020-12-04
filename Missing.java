import java.util.Arrays;
public class Missing {
   
    public static void main(String[] args){
       
        int a[]={1,5,13,18,16,24,34,56,78,100};
        Arrays.sort(a);
        if(a==null){
            System.out.println("null");
        }
        else{
        for(int i=0;i<a.length-1;i++)
        {
            if(a[i+1]-a[i]>1){
                int b=a[i+1]-a[i];
                for(int j=1;j<b;j++)
                {
                    System.out.print(a[i]+j + "\t");
                
            }
                
        }
      }
   }
 }
}

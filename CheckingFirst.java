public class CheckingFirst {
    static{
        System.out.println("static block");
    }
    CheckingFirst(){
        System.out.println("constructor block");
    }
    private void text(String s){
        System.out.println(s);
    }

    public static void main(String[] args) {
       // new CheckingFirst();
        CheckingFirst ob=new CheckingFirst();
        ob.text("General");
    }
}

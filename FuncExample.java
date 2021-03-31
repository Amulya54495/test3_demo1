
//with no default and static methods

@FunctionalInterface
interface Example{
    void run(String name);
}

 class FuncExample implements Example{
    public void run(String name){
        System.out.println(name);

    }
    public static void main(String[] args){
        FuncExample b=new FuncExample();
        b.run("JAVA");
        b.run("programming");
    }
}

public class garbageEx{
    public void finalize()
    {
        System.out.print("Object is destoryed");
    }
    public static void main(String[]args){
        garbageEx g=new garbageEx();
        g=null;
        System.gc();
    }
}
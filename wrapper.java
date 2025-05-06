public class Wrapper
{
    public static void main(String[] args)
    {
        //Autoboxing
        //int a=123;
        /*Integer a=new Integer(123);
        Double b=new Double(3.14);
        Character c=new Character("&");
        Boolean c=new Boolean(true);
        String e="Pizza";*/


        //Unboxing
        //int x=a;
        String x=Integer.toString(123);
        String y=Double.toString(3.14);
        String z=x+y;
        System.out.println(z);

    }
}
public class creating
{
    // static int add (int a,int b)    // using static method
    // {
    //     int c = a+b;      
    //     return c;
    // }

    // int add(int a,int b)  // same function call
    // {
    //     int c = a+b;
    //     return c;
    // }
    public static void main(String[] args)
    {
        int a = 10;
        int b = 20;
        //creating c = new creating();
        //System.out.println(add(a, b));  -- using static 
        //System.out.println(c.add(a, b));  -- creating object same class
        well w = new well();   //-- creating it outer class
        System.out.println(w.out(a, b));
    }
}

class well
{
    // public well(int a,int b) {
    //     int c = a+b;
    //     System.out.println(c);
    // }

    int out(int a,int b){
        int c = a+b;
        in(a,b);
        return c;
    }
    int in(int a,int b)
    {
        int c = a+b;
        System.out.println(c);
        return c;
    }
}
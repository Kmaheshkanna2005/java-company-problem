class demo
{
    int count = 0;
    void fun()
    {
        System.out.println("Inside fun");
        count++;
    }
}

public class singleton
{
    public static void main(String[] args)
    {
        demo d1 = new demo();
        d1.fun();
        d1.fun();
        System.out.println(d1.count);
    }
}
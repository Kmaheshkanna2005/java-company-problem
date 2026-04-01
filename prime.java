
import java.util.Scanner;

public class prime {
    public static boolean check(int n)
    {
        if(n<2)
        {
            return false;
        }
        for(int i=0;i<n;i++)
        {
            if(n%2==0)
            {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if(check(n))
        {
            System.out.println("is prime");
        }
        else
        {
            System.out.println("not prime");
        }
    }
}

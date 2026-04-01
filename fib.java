import java.util.Scanner;

public class fib {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tar = sc.nextInt();
        int sum = 0;
        int a = 0;
        int b = 1;
        int c = 0;
        System.out.print(a+" ");
        System.out.print(b+" ");
        for(int i=0;i<tar;i++)
        {
            c = a+b;
            a=b;
            b=c;
            System.out.print(c+" ");
        }
    }
}

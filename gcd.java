public class gcd {
    public static void main(String[] args) {

        int num1 = 20;
        int num2 = 10;
        int gcd = 1;
        int limit = Math.min(num1, num2);

        for(int i=limit;i>0;i--)
        {
            if(num1%i==0 && num2%i==0)
            {
                gcd = i;
                break;
            }
        }
        System.out.println("the gcd of element = " + gcd);
    }
}

public class amstrongnumber {
    public static void main(String[] args) {
        int number  = 9;
        int fin = number;
        int copy = number;
        int count = 0;
        int sum=0;
        while(number>0)
        {
            count++;
            number = number /10;
        }
        while(copy>0)
        {
            int num = copy%10;
            int result = power(count,num);
            copy = copy/10;
            sum += result;
        }
       if(sum==fin)
       {
          System.out.println("the amstrong number");
       }
       else{
        System.out.println("the number is not amstrong");
       }
    }
    public static int power(int count,int num)
    {
    //System.out.println(num);
        int val = num;
        for(int i=0;i<count-1;i++)
        {
            num*=val;
        }
        return num;    
    }
}

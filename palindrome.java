
import java.util.ArrayList;

public class palindrome {
    public static void main(String[] args) {
        int num = 1513;
        int s = String.valueOf(num).length();
        ArrayList<Integer> list = new ArrayList<>();
        while(num>0)
        {
            int res = num%10;
            list.add(res);
            num/=10;
        }
        System.out.println(list);
        //System.out.print(list.size());
        int[] arr = new int[list.size()];
        for(int i=0;i<arr.length;i++)
        {
            arr[i] = list.get(i);
            System.out.println(arr[i]);
        }
        int left = 0;
        int right = arr.length-1;
        boolean is = true;
        while(left<right)
        {
            if(arr[left] == arr[right])
            {
                left++;
                right--;
            }
            else
            {
                is  = false;
                break;
            }
        }
        if(is)
        {
            System.out.println("is palindorme");
        }
        else
        {
            System.out.println("is not palindrome");
        }
    }
}

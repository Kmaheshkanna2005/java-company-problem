
public class lcm {
    public static void main(String[] args) {
        int num1 = 20;
        int num2 = 30;
        // int lcm = 1;
        // int limit=10;
        // ArrayList<Integer> list = new ArrayList<>();
        // ArrayList<Integer> list1 = new ArrayList<>();
        // for(int i=1;i<limit;i++)
        // {
        // list.add(num1*i);
        // }
        // for(int i=1;i<limit;i++)
        // {
        // list1.add(num2*i);
        // }
        // System.out.println(list);
        // System.out.println(list1);

        // for(int i=0;i<list.size();i++)
        // {
        // if(list1.contains(list.get(i)))
        // {
        // System.out.print("lcm = "+list.get(i));
        // break;
        // }
        // }

        int max = Math.max(num1, num2);
        int tempLcm = max;

        while (true) {
            if (tempLcm % num1 == 0 && tempLcm % num2 == 0) {
                System.out.println("LCM is: " + tempLcm);
                break;
            }
            tempLcm += max; // Only check multiples of the largest number to save time
        }
    }
}

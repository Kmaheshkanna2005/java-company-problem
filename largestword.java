public class largestword {
    public static void main(String[] args) {
        String s = "it welcome to dairy";
        String[] arr = s.split(" ");
        int max = 0;
        String len = "";
        for(int i=0;i<arr.length;i++)
        {
            int num = arr[i].length();

            if(num>max)
            {
                max = num;
                len = arr[i];
            }
        }

        System.out.println(max);
        System.out.println(len);
    }
}

public class stringmanipulation {
    public static void main(String[] args) {
        // 1) string reverse without inbuild keyword
        String s = "mahesh";
        String b = "l";
        // for (int i=s.length()-1;i>=0;i--)
        // {
        //     b+=s.charAt(i);
        // }
        // System.out.println(b);

        // 2) string reversing using string builder 

        StringBuilder a = new StringBuilder();
        int count=0;
        for(int i=0;i<s.length();i++)
        {
            a.append(s.charAt(i));
            count++;
        }
        a.insert(count, b);
        a.deleteCharAt(count-1);
        a.replace(count-3,count-2, b);
        System.out.println(a.toString());
    }
}

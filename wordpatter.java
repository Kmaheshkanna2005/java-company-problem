import java.util.LinkedHashMap;

public class wordpatter
{

    static boolean ans(String pattern,String s) {

        String[] arr = pattern.split(" ");
        char[] arr1 = s.toCharArray();
        boolean is = true;
        if(arr.length!=arr1.length)
        {
            return false;
        }
        LinkedHashMap<String,Integer> map = new LinkedHashMap<>();
        LinkedHashMap<Character,Integer> map1 = new LinkedHashMap<>();

        for(int i=0;i<arr.length;i++)
        {
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        for(int i=0;i<arr1.length;i++)
        {
            map1.put(arr1[i],map1.getOrDefault(arr1[i],0)+1);
        }
        System.out.println(map);
        System.out.println(map1);

        if(map.size()!=map1.size())
        {
            return is = false;
        }

        return is;
    }
    
    public static void main(String[] args)
    {
        String pattern = "dog cat cat dog";
        String s  = "abba";

        boolean result = ans(pattern,s);
        System.out.println(result);
    }
}
import java.util.regex.*;

public class Test {
    public static void main(String[] args) {
        String s  = "a23abc1";
        Pattern pattern = Pattern.compile("\\d+");
        Matcher matcher = pattern.matcher(s);

        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}
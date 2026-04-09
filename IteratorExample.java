import java.util.Iterator;
import java.util.LinkedList;

public class IteratorExample {
    public static void main(String[] args) {
        LinkedList<String> techs = new LinkedList<>();

        techs.add("Java");
        techs.add("Python");
        techs.add("C++");
        techs.add("JavaScript");

      
        Iterator<String> it = techs.iterator();

        while (it.hasNext()) {
            String language = it.next();
            System.out.println("Language: " + language);
            
            if (language.equals("C++")) {
                it.remove(); 
            }
        }

        System.out.println("Updated List: " + techs);
    }
}
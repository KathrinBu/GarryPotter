import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        String name="1.txt";
        try {
            Scanner scanner = new Scanner(new File(name));
            String word1=scanner.next().toLowerCase(Locale.ROOT);
            String word2=scanner.next().toLowerCase(Locale.ROOT);
            char[] c1=word1.toCharArray();
           Arrays.sort(c1);
           String str1=Arrays.toString(c1);
            char[] c2=word2.toCharArray();
            Arrays.sort(c2);
            String str2=Arrays.toString(c2);
            System.out.println(str1);
            System.out.println(str2);
            if (c1.length != c2.length) {
                System.out.println("NO");
            } else if(str1.equals(str2)) {
                System.out.println("YES");
            }
        } catch (FileNotFoundException e) {
            System.out.println(":(((");
        }
    }
        }

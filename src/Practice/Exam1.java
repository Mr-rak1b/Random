package Practice;
import java.util.Arrays;
public class Exam1 {
    public static void main(String[] args) {
      String x = "Bangladesh";
      String y = "China";
      System.out.println(" ");
      System.out.println(x + " " + y);
      x = x.toLowerCase();
      y =y.toLowerCase();
        if(x.length() == y.length()) {
            char[] x1 = x.toCharArray();
            char[] y1 = y.toCharArray();
            Arrays.sort(x1);
            Arrays.sort(y1);
            System.out.print("First word in order: ");
            for (int p = 0; p < x1.length; p++)
                {System.out.print(x1[p]);}
            System.out.println(" ");
            System.out.print("Second word in order: ");
            for (int p = 0; p < x1.length; p++)
            {System.out.print(y1[p]);}
            System.out.println(" ");
            if (Arrays.equals(x1, y1)) {
                System.out.println("It is Anagram");
            } else {System.out.println("It is not Anagram !!");}
        }
        else {System.out.println("It is not Anagram !!");}}}

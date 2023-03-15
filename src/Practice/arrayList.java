package Practice;

import java.util.ArrayList;

public class arrayList {
    public static void main(String[] args) {

        ArrayList<String> x = new ArrayList<>();

        x.add("America");
        x.add("Bangladesh");
        x.add("China");
        x.add("India");
        x.add("Pakistan");
        x.add("Russia");
        x.add("Italy");
        x.add("Japan");

        for(String y : x)
        {
            System.out.println(y);
        }

    }
}

package week1;

import java.util.ArrayList;

public class Lambdas {
    public static void main(String[] args) {
        ArrayList<String> items = new ArrayList<String>();
        items.add("mice");
        items.add("rabid");
        items.add("upbeat");
        items.add("aware");
        items.add("partner");
        items.add("earth");
        items.add("equal");
        items.add("unaccountable");
        items.add("past");
        items.add("detect");
        items.add("broad");

        System.out.println("Shortest to longest");
        items.sort((String item1, String item2) -> item1.length() - item2.length());
        System.out.println(items);

        System.out.println("Longest to shortest");
        items.sort((String item1, String item2) -> item2.length() - item1.length());
        System.out.println(items);

        System.out.println("Alphabetically by first letter only");
        items.sort((String item1, String item2) -> item1.substring(0, 1).compareTo(item2.substring(0, 1)));
        System.out.println(items);

        System.out.println("Strings beginning with 'e' first, everything else next");
        items.sort((String item1, String item2) -> {
            if (item1.substring(0, 1).equalsIgnoreCase("e") && !item2.substring(0, 1).equalsIgnoreCase("e")) {
                return -1;
            } else if (!item1.substring(0, 1).equalsIgnoreCase("e") && item2.substring(0, 1).equalsIgnoreCase("e")) {
                return 1;
            } else {
                return 0;
            }
        });
        System.out.println(items);
        System.out.println("Shortest to longest");
        items.sort((String item1, String item2) -> item1.length() - item2.length());
        System.out.println(items);

        System.out.println("Longest to shortest");
        items.sort((String item1, String item2) -> item2.length() - item1.length());
        System.out.println(items);

        System.out.println("Alphabetically by first letter only");
        items.sort((String item1, String item2) -> item1.substring(0, 1).compareTo(item2.substring(0, 1)));
        System.out.println(items);

        System.out.println("Strings beginning with 'e' first, everything else next");
        items.sort((String item1, String item2) -> {
            if (item1.substring(0, 1).equalsIgnoreCase("e") && !item2.substring(0, 1).equalsIgnoreCase("e")) {
                return -1;
            } else if (!item1.substring(0, 1).equalsIgnoreCase("e") && item2.substring(0, 1).equalsIgnoreCase("e")) {
                return 1;
            } else {
                return 0;
            }
        });
        System.out.println(items);
    }
}

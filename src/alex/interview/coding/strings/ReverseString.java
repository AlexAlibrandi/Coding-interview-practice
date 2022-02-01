package alex.interview.coding.strings;

import java.util.Scanner;

public class ReverseString {

    public static void loopReverse(String input) {
        String reverse = "";
        for (int i = input.length() - 1; i >= 0; i--) {
            reverse = reverse + input.charAt(i);
        }
        System.out.println(reverse);
    }

    public String recursiveReverse(String input) {
        if (input.length() == 1)
            return input;
        else
            return input.charAt(input.length() - 1) +
                    recursiveReverse(input.substring(0, input.length() - 1));
    }

    public static void buffReverse(String input) {
        StringBuffer sb = new StringBuffer(input);
        System.out.println(sb.reverse());
    }

    public static void main(String[] args) {

        Scanner newScan = new Scanner(System.in);
        System.out.println("Enter string you want reversed: ");
        String normalOrder = newScan.nextLine();

        String removedSpaces = normalOrder.replaceAll("\\s+", "");

        System.out.println();

        System.out.println("Original string: " + normalOrder);
        System.out.println();
        System.out.println("Original string no spaces: " + removedSpaces);

        System.out.println("________________________________________________________________________");

        System.out.println();

        //Reversing a string using a loop
        System.out.print("The string reversed using a loop: ");
        loopReverse(normalOrder);
        System.out.println();
        System.out.print("The string reversed with no spaces using a loop: ");
        loopReverse(removedSpaces);

        System.out.println("________________________________________________________________________");

        System.out.println();

        // Reversing a string using recursion
        ReverseString rs = new ReverseString();
        System.out.print("The string reversed using recursion: ");
        String rev = rs.recursiveReverse(normalOrder);
        System.out.println(rev);
        System.out.println();
        System.out.print("The string reversed with no spaces using recursion: ");
        String rev2 = rs.recursiveReverse(removedSpaces);
        System.out.println(rev2);

        System.out.println("________________________________________________________________________");

        System.out.println();

        //Reversing using string buffer
        System.out.print("The string reversed using String buffer: ");
        buffReverse(normalOrder);
        System.out.println();
        System.out.print("The string reversed with no spaces using String buffer: ");
        buffReverse(removedSpaces);

    }
}

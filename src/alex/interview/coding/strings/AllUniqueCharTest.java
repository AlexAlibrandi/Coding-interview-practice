package alex.interview.coding.strings;

import java.util.HashSet;
import java.util.Scanner;

public class AllUniqueCharTest {

    //using a hashset to test if a string has all unique characters
    public static String allUniqueCharactersHashSet(String word){

        HashSet<Character> uniqueSet = new HashSet<>();

        for(int index = 0; index < word.length(); index ++){
            char letter = word.charAt(index);

            if(!uniqueSet.add(letter))
                return "The string does not contain only unique characters";
        }

        return "The string does contain all unique characters!";
    }

    //_________________________________________________________________________________________

    //using indexOf and lastIndexOf methods to test if string has all unique identifiers
    public static String hasAllUniqueCharsIndexLastIndex(String word){
        for(int index = 0; index < word.length(); index++){
            char letter = word.charAt(index);
            if(word.indexOf(letter) != word.lastIndexOf(letter))
                return "The string does not contain all unique characters.";
        }
        return "The string does contain all unique Characters!";
    }
    //_________________________________________________________________________________________

    //using the ascii value of a character to check if a word only contains unique characters
    public static String hasAllUniqueCharsAscii(String word){

        boolean[] charMap = new boolean[26];
        for(int index = 0; index < word.length(); index ++){
            int ascii = (int) word.toUpperCase().charAt(index) - 64;

            if(!charMap[ascii])
                charMap[ascii] = true;
            else
                return "The word does not contain only unique characters";
        }
        return "The word does contain only unique characters!";
    }

    //_________________________________________________________________________________________

    public static void main(String[] args){

        Scanner newScan = new Scanner(System.in);
        System.out.println("Enter the word you would like to test for only unique characters:");
        String test = newScan.nextLine();

        System.out.println("Testing if string contains only unique characters using HashSet");
        System.out.println("______________________________________________________________");
        System.out.println(allUniqueCharactersHashSet(test));
        System.out.println();
        System.out.println("Testing if string contains only unique characters using indexOf and lastIndexOf methods");
        System.out.println("______________________________________________________________");
        System.out.println(hasAllUniqueCharsIndexLastIndex(test));
        System.out.println();
        System.out.println("Testing if string contains only unique characters using ascii count");
        System.out.println("______________________________________________________________");
        System.out.println(hasAllUniqueCharsAscii(test));
    }
}

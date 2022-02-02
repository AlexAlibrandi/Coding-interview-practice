package alex.interview.coding.strings;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class AnagramTest {

    //method testing if two strings are anagrams using string methods
    public static String anagramTesterUsingStringMethods(String word1, String word2){
        if (word1.length() != word2.length())
            return "The two words are not anagrams";

        for (int i = 0; i < word1.length(); i++){
            char j = word1.charAt(i);
            int index = word2.indexOf(j);

            if(index != -1){
                word2 = word2.substring(0,index) + word2.substring(index + 1, word2.length());
            } else
                return "The two words are not anagrams";
        }
        return "The two words are anagrams";
    }
    //____________________________________________________________________________________________

    //method testing if two strings are anagrams using arrays.sort
    public static String anagramTesterUsingArraysSort(String word1, String word2){
        String sorted1 = sortChars(word1);
        String sorted2 = sortChars(word2);
        if (sorted1.equals(sorted2))
            return "The two words are anagrams";
        else
            return "The two words are not anagrams";
    }

    public static String sortChars(String word){
        char[] wordArr = word.toLowerCase().toCharArray();
        Arrays.sort(wordArr);
        return String.valueOf(wordArr);
    }
    //______________________________________________________________________________________________

    // Testing if two strings are anagrams using the count array
    public static String countArrayAnagramTest(String word1, String word2){
        if (word1.length() != word2.length()){
            return "The two words are not anagrams";
        }

        int count [] = new int[256];
        for (int i = 0; i < word1.length(); i++){
            count[word1.charAt(i)]++;
            count[word2.charAt(i)]--;
        }
        for (int i = 0; i < 256; i++){
            if (count[i] != 0){
                return "The two strings are not anagrams";
            }
        }
        return "The two strings are anagrams";
    }

    public static void main (String[] args){

        Scanner newScan = new Scanner(System.in);
        System.out.println("Enter your first string: ");
        String string1 = newScan.nextLine();
        System.out.println("Enter your first string: ");
        String string2 = newScan.nextLine();

        System.out.println();

        System.out.println("Testing anagrams using string methods");
        System.out.println("_________________________________________________");
        System.out.println(anagramTesterUsingStringMethods(string1,string2));

        System.out.println();
        System.out.println("____________________________________________________________");
        System.out.println();

        System.out.println("Testing anagrams using arrays.sort");
        System.out.println("_________________________________________________");
        System.out.println(anagramTesterUsingArraysSort(string1,string2));

        System.out.println();
        System.out.println("____________________________________________________________");
        System.out.println();

        System.out.println("Testing anagrams using count array");
        System.out.println("_________________________________________________");
        System.out.println(countArrayAnagramTest(string1,string2));
    }

}

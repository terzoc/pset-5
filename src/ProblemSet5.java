/*
* Problem Set 5.
* Copyright (c) 2019. UCVTS and its affiliated.
*
* Use is allowed as long as credit is given.
*/

import java.util.Arrays;
import java.lang.String;

public class ProblemSet5 {

    public static void main(String[] args) {
      ProblemSet5 ps = new ProblemSet5();
      System.out.println("Exercise 1");
      System.out.println(ps.surroundMe("bommer", "\\\\\\\\"));
      System.out.println(ps.surroundMe("cde", "abfg"));
      System.out.println(ps.surroundMe(null, "####"));
      System.out.println(ps.surroundMe("abc", null));
      System.out.println(ps.surroundMe("abc", "123"));

      System.out.println("\nExercise 2");
      System.out.println(ps.endsMeet("abcdefg", 2));
      System.out.println(ps.endsMeet(null, 2));
      System.out.println(ps.endsMeet("", 2));
      System.out.println(ps.endsMeet("abc", -1));

      System.out.println("\nExercise 3");
      System.out.println(ps.middleMan("abcdefg"));

      System.out.println(ps.middleMan(null));
      System.out.println(ps.middleMan("12"));
      System.out.println(ps.middleMan("a"));

      System.out.println("\nExercise 4");
      System.out.println(ps.isCentered("abcdefg", "cde"));
      System.out.println(ps.isCentered("abcdefg", "abc"));
      System.out.println(ps.isCentered(null, "abc"));
      System.out.println(ps.isCentered("abcd", "abc"));
      System.out.println(ps.isCentered("abc", null));
      System.out.println(ps.isCentered("abcdefg", "cd"));

      System.out.println("\nExercise 5");
      System.out.println(ps.countMe("bruh is there big licks", 's'));
      System.out.println(ps.countMe("I am an example sentence", 'e'));
      System.out.println(ps.countMe(null, 'a'));
      System.out.println(ps.countMe("abc$ def$", '$'));

      System.out.println("\nExercise 6");
      System.out.println(ps.triplets("aaabbbccc"));
      System.out.println(ps.triplets("aaaa"));
      System.out.println(ps.triplets("abc"));
      System.out.println(ps.triplets(null));

      System.out.println("\nExercise 7");
      System.out.println(ps.addMe("123 abc 123"));
      System.out.println(ps.addMe("abcdefghijk"));
      System.out.println(ps.addMe(null));

      System.out.println("\nExercise 8");
      System.out.println(ps.sequence("abbcccdddd"));
      System.out.println(ps.sequence("aAabBbBb"));
      System.out.println(ps.sequence(""));
      System.out.println(ps.sequence("   "));
      System.out.println(ps.sequence(null));

      System.out.println("\nExercise 9");
      System.out.println(ps.intertwine("aceg", "bdfh"));
      System.out.println(ps.intertwine("abc", "12345"));
      System.out.println(ps.intertwine(null, "abcd"));
      System.out.println(ps.intertwine("abcd", null));
      System.out.println(ps.intertwine(null, null));

      System.out.println("\nExercise 10");
      System.out.println(ps.isPalindrome("racecar"));
      System.out.println(ps.isPalindrome("Madam"));
      System.out.println(ps.isPalindrome(null));
    }

    /*
     * Exercise 1.
     *
     * Given two strings, return a new string built by surrounding in with the first
     * and last two characters of out.
     */

    public String surroundMe(String in, String out) {
      if (in == null) {
        return null;
      }else {
        if (null != out && out.length()==4) {
          String out1 = out.substring(0, 2);
          String out2 = out.substring(2);
          String result = out1 + in +out2;
          return result;
        }else {
          return in;
        }
      }

    }

    /*
     * Exercise 2.
     *
     * Given a string and an integer, return a new string that represents the first
     * and last n characters of text.
     */

    public String endsMeet(String text, int n) {
      if (text == null) {
        return null;
      }else {
        int length = text.length();
        if(n <= length && text != null && n > 0 && length > 0 && n <= 10){
          String output = text.substring(0,n) + text.substring(length-n);
          return output;
        }else {
          return text;
        }
      }
    }

    /*
     * Exercise 3.
     *
     * Given a string, return a new string using the middle three characters of text.
     */

    public String middleMan(String text) {
      if (text != null && (text.length() % 2) != 0 && text.length() >= 3) {
        return text.substring(text.length()/2 -1, text.length()/2 +2);
      }else if(text == null){
        return null;
      }else {
        return text;
      }
    }

    /*
     * Exercise 4.
     *
     * Given two strings, determine whether or not target is equivalent to the middle
     * three characters of text.
     */

    public boolean isCentered(String text, String target) {
      if (text == null || target == null || (text.length() % 2) == 0 || text.length() < 3 || target.length() != 3) {
        return false;
      }else {
        if ((text.substring(text.length()/2 -1, text.length()/2 +2)).equals(target)) {
          return true;
        }else {
          return false;
        }
      }
    }

    /*
     * Exercise 5.
     *
     * Given a string and a character, compute the number of words that end in suffix.
     */

    public int countMe(String text, char suffix) {
      if (Character.isAlphabetic(suffix) && text != null) {
        int output = 0;
        String[] words = text.split(" ");
        for (int i = 0; i < words.length; i++ ) {
          if (words[i].endsWith(Character.toString(suffix))) {
            output ++;
          }
        }
        if (output == 0) {
          return -1;
        }else {
          return output;
        }
      }else {
        return -1;
      }
    }

    /*
     * Exercise 6.
     *
     * Given a string, compute the number of triplets in text.
     */

    public int triplets(String text) {
      if (text != null) {
        int numberOfTriplets = 0;
        for (int i = 1; i < text.length()-1; i++ ) {
          char char1 = text.charAt(i-1);
          char char2 = text.charAt(i);
          char char3 = text.charAt(i+1);
          if (char1 == char2 && char2 == char3) {
            numberOfTriplets -= -1;
          }
        }
        return numberOfTriplets;
      }else {
        return -1;
      }
    }

    /*
     * Exercise 7.
     *
     * Given a string, compute the sum of the digits in text.
     */

    public long addMe(String text) {
      if (text != null) {
        int sumOfDigits = 0;
        for (int i = 0; i < text.length(); i++ ) {
          char char1 = text.charAt(i);
          if (Character.isDigit(char1)) {
            sumOfDigits += Character.getNumericValue(char1);
          }
        }
        return sumOfDigits;
      }else {
        return -1;
      }
    }

    /*
     * Exercise 8.
     *
     * Given a string, compute the length of the longest sequence.
     */

    public long sequence(String text) {
      if (text != null) {
        long longestSequence = 1;
        long sequenceLength = 1;
        char char1 = ' ';
        char char2 = ' ';
        for (int i = 1; i < text.length(); i++ ) {
          char1 = text.charAt(i-1);
          char2 = text.charAt(i);
          if (char1 == char2) {
            sequenceLength -= -1;
            if (sequenceLength > longestSequence) {
              longestSequence = sequenceLength;
            }
           } else {
             sequenceLength = 1;
           }
        }
          if (text.length() == 0) {
            longestSequence = 0;
          }
          return longestSequence;
      }else {
        return -1;
      }
    }

    /*
     * Exercise 9.
     *
     * Given two strings, return a new string built by intertwining each of the
     * characters of a and b.
     */

    public String intertwine(String a, String b) {
      long longestString = 0;
      boolean longestStringA = false;
      String combined = "";

      if (a != null && b != null) {
        if (a.length() > b.length()) {
          longestString = a.length();
          longestStringA = true;
        }else {
          longestString = b.length();
        }
        for (int i = 0;i < longestString; i++) {
          if (i < a.length() && i < b.length()) {
            combined += String.valueOf(a.charAt(i));
            combined += String.valueOf(b.charAt(i));
          }else if (i < a.length()) {
            combined += String.valueOf(a.charAt(i));
          }else if (i < b.length()) {
            combined += String.valueOf(b.charAt(i));
          }
        }
        return combined;
      }else {
        return null;
      }
    }

    /*
     * Exercise 10.
     *
     * Given a string, determine whether or not it is a palindrome.
     */

    public boolean isPalindrome(String text) {
      boolean isPalindrome = false;
      String reverse = "";

      if (text != null) {
        for (int i = text.length()-1 ; i >= 0; i--) {
          reverse += String.valueOf(text.charAt(i));
        }
        if (text.equals(reverse)) {
          isPalindrome = true;
        }
        return isPalindrome;
      }else {
        return false;
      }
    }
}

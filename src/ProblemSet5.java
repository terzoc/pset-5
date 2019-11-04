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

      // System.out.println(ps.surroundMe("bommer", "yuhh"));
      // System.out.println(ps.endsMeet("test", 1));
      // System.out.println(ps.middleMan("lambo"));
      // System.out.println(ps.isCentered("dddnulddd", "nul"));
      // System.out.println(ps.countMe("bruh is there big licks", 's'));
      // System.out.println(ps.triplets("aaabbbccc"));
      System.out.println(ps.addMe("123 abc 123"));
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
      if (text != null && (text.length() % 2) != 0) {
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
      return 1;
    }

    /*
     * Exercise 9.
     *
     * Given two strings, return a new string built by intertwining each of the
     * characters of a and b.
     */

    public String intertwine(String a, String b) {
      return "1";
    }

    /*
     * Exercise 10.
     *
     * Given a string, determine whether or not it is a palindrome.
     */

    public boolean isPalindrome(String text) {
      return true;
    }
}

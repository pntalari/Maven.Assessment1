package com.zipcodewilmington.assessment1.part1;

/**
 * Created by leon on 2/16/18.
 */
public class BasicStringUtils {
    /**
     * @param str string input from client
     * @return string with identical content, and the first character capitalized
     */
    public static String camelCase(String str) {

        String retString = str.substring(0,1).toUpperCase() + str.substring(1);
        return retString;
    }

    /**
     * @param str string input from client
     * @return string with identical contents, in the reverse order
     */
    public static String reverse(String str) {
        StringBuilder reverseString = new StringBuilder();
        reverseString.append(str);
        String retString = reverseString.reverse().toString();
        return retString;
    }

    /**
     * @param str string input from client
     * @return string with identical contents, in reverse order, with first character capitalized
     */
    public static String reverseThenCamelCase(String str) {
        String revString = reverse(str);
        return camelCase(revString);
    }


    /**
     * @param str a string input from user
     * @return string with identical contents excluding first and last character
     */
    public static String removeFirstAndLastCharacter(String str) {
        StringBuilder retString = new StringBuilder();
        for (int i = 1;i<str.length()-1;i++)
        {
            retString.append(str.charAt(i));
        }
        return retString.toString();

    }

    /**
     * @param str a string input from user
     * @return string with identical characters, each with opposite casing
     */
    public static String invertCasing(String str) {
        StringBuilder retString = new StringBuilder();
        for (int i = 0;i<str.length();i++)
        {
            if (str.substring(i,i+1).equals(str.substring(i,i+1).toUpperCase()))
            {
                retString.append(str.substring(i,i+1).toLowerCase());
            }
            else
            {
                retString.append(str.substring(i,i+1).toUpperCase());
            }
        }
        return retString.toString();
    }
}

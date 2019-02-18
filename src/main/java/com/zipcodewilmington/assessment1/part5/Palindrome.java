package com.zipcodewilmington.assessment1.part5;

public class Palindrome {

    public Integer countPalindromes(String input){
        String str = "";
        int length = input.length();
        int count = input.length();


        for (int i =0;i<length;i++)
        {
            for(int j = i+2;j<=length;j++)
            {
                str = input.substring(i,j);
                count += IsPalindrome(str);
            }
        }

        return count;
    }

    public Integer IsPalindrome(String str)
    {
        for (int i =0;i<str.length()/2;i++)
        {
            if (str.charAt(i)!=str.charAt(str.length()-1-i))
                return 0;
        }
        return 1;
    }
}

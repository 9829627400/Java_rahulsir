package com.Assignment2;

public class program11 
{
	public static void main(String[] args) {
        String str1 = "Red is favorite color.";
        String str2 = "Red";
        String str3 = "Orange is also my favorite color.";
          checkStartsWith(str1, str2);
        checkStartsWith(str3, str2);
    }
        private static void checkStartsWith(String str, String prefix) {
        boolean result = str.startsWith(prefix);
        System.out.println("\"" + str + "\" starts with \"" + prefix + "\"? " + result);
    }
}

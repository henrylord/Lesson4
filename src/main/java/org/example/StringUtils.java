package org.example;

public class StringUtils {

    static int index = 0;
    static int count = 0;

    static int countSubString(String inputString, String subString) {

        while ((index = inputString.indexOf(subString,index)) != -1) {
            count++;
            index += subString.length();

        }
        return count;
    }


    public static void main(String[] args) {

        String testString = "Java Java is a widely used programming language. Java is versatile and Java is easy to learn Java";

        String sub = "Java";

        System.out.println("Number of Occurrence of " + sub + ": " + countSubString(testString,sub));


    }
}
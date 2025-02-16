package org.regex.modifystrings;

import java.util.Scanner;
import java.util.regex.Pattern;

public class RemoveBadWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        System.out.println("Text without a bad word : " + removeBadWord(text));
    }

    public static String removeBadWord(String text){
        // replacing all the bad words into ****
        String regex = "\\b(stupid|damn)\\b";
        return text.replaceAll(regex, "****");
    }
}

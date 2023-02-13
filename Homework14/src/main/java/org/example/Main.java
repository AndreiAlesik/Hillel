package org.example;

import java.util.*;

public class Main {
    static String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot", "cherry",
            "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea", "peanut",
            "pear", "pepper", "pineapple", "pumpkin", "potato"};

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write your text:");
        String textLine = scanner.nextLine();
        System.out.println("Write symbol:");
        String symbol = scanner.nextLine();


        System.out.println("\nSymbol '" + symbol + "' occurs " + findSymbolOccurrence(textLine, symbol) + " times" + " in this string " + textLine + "\n");

        System.out.println();
        System.out.println("Write target:");
        String target = scanner.nextLine();
        System.out.println("Write source:");
        String source = scanner.nextLine();
        System.out.println("\nFirst occurrence of substring '" + target + "' at position: " + findWordPosition(source, target));
        System.out.println("\nThe reverse string for '" + target + "' is : '" + stringReverse(target) + "'");
        System.out.println();

        System.out.println("Is palindrome? Write line: ");
        String palindrome = scanner.nextLine();
        System.out.println("Is Palindrome?: " + isPalindrome(palindrome) + "\n" + source);


        System.out.println();
        System.out.println();
        game(words);
    }

    static int findSymbolOccurrence(String source, String target) {
        List<String> convertedList = new ArrayList<>(Arrays.asList(source.split("")));
        int counter = 0;
        for (String iterator : convertedList)
            if (iterator.equals(target)) counter++;
        return counter;
    }

    static int findWordPosition(String source, String target) {
        if (source == null || target == null || target.length() > source.length()) {
            return -1;
        } else return source.indexOf(target) + 1;
    }

    static String stringReverse(String source) {
        StringBuilder target = new StringBuilder(source);
        return target.reverse().toString();
    }

    static boolean isPalindrome(String source) {
        if (source == null) {
            return false;
        }
        String reversed = new StringBuilder(source).reverse().toString();
        return source.equalsIgnoreCase(reversed);
    }

    static void game(String[] words) {
        Scanner in = new Scanner(System.in);
        Random random = new Random();
        String targetWord = words[random.nextInt(words.length)].toLowerCase();

        StringBuilder mask = new StringBuilder();
        for (int i = 0; i < targetWord.length(); i++) {
            mask.append("#");
        }
        System.out.println("The word to guess is: " + mask+"###############");
        while (true) {
            System.out.print("Enter your guess: ");
            String guess = in.nextLine().toLowerCase();
            if (guess.equals(targetWord)) {
                System.out.println("Congratulations! You have guessed the word.");
                break;
            } else {
                System.out.println("Sorry, that is not correct.");

                StringBuilder newMask = new StringBuilder();
                int tempLength=0;
                if(targetWord.length()>=guess.length())
                    tempLength=guess.length();
                else
                    tempLength=targetWord.length();

                for (int i = 0; i < tempLength; i++) {
                    if(i==tempLength-1){
                        if (guess.charAt(i) == targetWord.charAt(i))
                            newMask.append(targetWord.charAt(i));
                        for(int j=0;j<=15-guess.length();j++)
                            newMask.append("#");
                    }
                    else {
                        if (guess.charAt(i) == targetWord.charAt(i)) {
                            newMask.append(targetWord.charAt(i));
                        } else {
                            newMask.append("#");
                        }
                    }
                }
                System.out.println("The word to guess is: " + newMask);
            }
        }
    }
}


//Given an input string, reverse the string word by word.
//For example,
//Given s = "the sky is blue",
//return "blue is sky the".

import java.util.Scanner;

public class ReverseWordsInAString {
    public String reverseWords(String s) {
        String[] words = s.trim().split("\\s+");
        String result = "";
        for(int i = words.length - 1; i > 0; i--) {
            result += words[i] + " ";
        }

        return result + words[0];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter text: ");
        String myText = sc.nextLine();
        ReverseWordsInAString obj = new ReverseWordsInAString();
        System.out.println(obj.reverseWords(myText));

    }
}
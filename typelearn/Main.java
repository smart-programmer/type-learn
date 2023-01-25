package typelearn;

import java.util.Scanner;
import java.util.Arrays;


public class Main {
    public static void main(String[] args) throws InterruptedException{
        WordsFileHandler handler = new WordsFileHandler();
        String[] words = handler.readWordsFile();
        
        Scanner scanner = new Scanner(System.in);
        String[] userWords = new String[words.length];
        
        // prompt user to start
        System.out.println("put your cursor in the console then press any button to start");
        scanner.nextLine();
        // start timer after game start
        double startTime = System.currentTimeMillis();
        // main loop
        for (int i = 0; i < words.length; i++){
            System.out.println(words[i]);
            String userWord = scanner.nextLine();  // Read user input
            userWords[i] = userWord;
        }
        double endTime = System.currentTimeMillis();
        double elapsedTimeInSeconds = ((endTime - startTime) / 1000);
        double wordPerMinute = (userWords.length / (elapsedTimeInSeconds / 60)); // number of words / elapsed minutes
        System.out.println("your spelling of the words was: " + Arrays.toString(userWords) + ".");
        System.out.println("percentage of words you spelled wrong: " + Utils.spellingFaultPercentage(words, userWords) + ".");
        System.out.println("your total time was: "  + elapsedTimeInSeconds + " seconds.");
        System.out.println("your WPM(word per minute) is: "  + wordPerMinute + " words per minute.");
    }
}

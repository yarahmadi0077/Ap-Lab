import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashSet;
import java.util.Scanner;

public class FileAnalyzer implements Runnable {
    private String filePath;
    private static int wordCounter;
    private static HashSet<String> words;
    private static String maxWord;
    private static String minWord;
    private static int letterCounter;
    

    public FileAnalyzer(String filePath) {
        this.filePath = filePath;
        words = new HashSet<String>();
        wordCounter = 0;
        letterCounter = 0;
    }

    @Override
    public void run() {
        File file = new File(filePath);
        synchronized (this) {
            
            try (Scanner scanner = new Scanner(file)) {
                while (scanner.hasNextLine()) {
                    String word = scanner.nextLine();
                    wordCounter++;
                    
                    if (maxWord == null || word.length() > maxWord.length()) {
                        maxWord = word;
                    }

                    if (minWord == null || word.length() < minWord.length()) {
                        minWord = word;
                    }

                    words.add(word);
                    letterCounter += word.length();
                }

            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }

        }
    }

    public static String getMaxWord() {
        return maxWord;
    }

    public static String getMinWord() {
        return minWord;
    }

    public static int getLetterCounter() {
        return letterCounter;
    }

    public static int getWordCounter() {
        return wordCounter;
    }

    public static int getWordWithoutDuplicateCount() {
        return words.size();
    }

    public static int getWordAverage() {
        return letterCounter / wordCounter; 
    }
}

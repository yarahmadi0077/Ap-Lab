/**
 * File Anlyze
 * @author Mohammad-Yarahmadi 40231059
 * @version 1.0
 * @since 2024-05-30
 */

import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) {
        FileAnalyzer fileAnalyzer1 = new FileAnalyzer("assets/file_1.txt");
        FileAnalyzer fileAnalyzer2 = new FileAnalyzer("assets/file_2.txt");
        FileAnalyzer fileAnalyzer3 = new FileAnalyzer("assets/file_3.txt");
        FileAnalyzer fileAnalyzer4 = new FileAnalyzer("assets/file_4.txt");
        FileAnalyzer fileAnalyzer5 = new FileAnalyzer("assets/file_5.txt");
        FileAnalyzer fileAnalyzer6 = new FileAnalyzer("assets/file_6.txt");
        FileAnalyzer fileAnalyzer7 = new FileAnalyzer("assets/file_7.txt");
        FileAnalyzer fileAnalyzer8 = new FileAnalyzer("assets/file_8.txt");
        FileAnalyzer fileAnalyzer9 = new FileAnalyzer("assets/file_9.txt");
        FileAnalyzer fileAnalyzer10 = new FileAnalyzer("assets/file_10.txt");
        FileAnalyzer fileAnalyzer11 = new FileAnalyzer("assets/file_11.txt");
        FileAnalyzer fileAnalyzer12 = new FileAnalyzer("assets/file_12.txt");
        FileAnalyzer fileAnalyzer13 = new FileAnalyzer("assets/file_13.txt");
        FileAnalyzer fileAnalyzer14 = new FileAnalyzer("assets/file_14.txt");
        FileAnalyzer fileAnalyzer15 = new FileAnalyzer("assets/file_15.txt");
        FileAnalyzer fileAnalyzer16 = new FileAnalyzer("assets/file_16.txt");
        FileAnalyzer fileAnalyzer17 = new FileAnalyzer("assets/file_17.txt");
        FileAnalyzer fileAnalyzer18 = new FileAnalyzer("assets/file_18.txt");
        FileAnalyzer fileAnalyzer19 = new FileAnalyzer("assets/file_19.txt");
        FileAnalyzer fileAnalyzer20 = new FileAnalyzer("assets/file_20.txt");

        ExecutorService executorService = Executors.newFixedThreadPool(10);

        executorService.execute(fileAnalyzer1);
        executorService.execute(fileAnalyzer2);
        executorService.execute(fileAnalyzer3);
        executorService.execute(fileAnalyzer4);
        executorService.execute(fileAnalyzer5);
        executorService.execute(fileAnalyzer6);
        executorService.execute(fileAnalyzer7);
        executorService.execute(fileAnalyzer8);
        executorService.execute(fileAnalyzer9);
        executorService.execute(fileAnalyzer10);
        executorService.execute(fileAnalyzer11);
        executorService.execute(fileAnalyzer12);
        executorService.execute(fileAnalyzer13);
        executorService.execute(fileAnalyzer14);
        executorService.execute(fileAnalyzer15);
        executorService.execute(fileAnalyzer16);
        executorService.execute(fileAnalyzer17);
        executorService.execute(fileAnalyzer18);
        executorService.execute(fileAnalyzer19);
        executorService.execute(fileAnalyzer20);

        executorService.close();

        System.out.println("wordCounter: " + FileAnalyzer.getWordCounter());
        System.out.println("Word count: " + FileAnalyzer.getWordWithoutDuplicateCount());
        System.out.println("Max word: " + FileAnalyzer.getMaxWord());
        System.out.println("Min word: " + FileAnalyzer.getMinWord());
        System.out.println("Average word length: " + FileAnalyzer.getLetterCounter() / FileAnalyzer.getWordCounter());

    }

    public void menu() {
        System.out.println("1) Word Count");
        System.out.println("2) Longest word and its length");
        System.out.println("3) Shortest word and its length");
        System.out.println("4) All words length average");
    } 

    public void commandHandler() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            menu();
            System.out.println("Please enter your choose: ");
            int choose = scanner.nextInt();
            scanner.nextLine();

            switch(choose) {
                case 1: 

                    break;
                case 2:

                    break;
                case 3:

                    break;
                case 4: 

                    break;
            }
        }
    }
}

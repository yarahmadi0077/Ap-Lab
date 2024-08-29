/**
 * NoteBook
 * @author Mohammad-Yarahmadi 40231059
 * @version 1.0
 * @since 2023-03-30
 */

import java.io.IOException;
import java.util.Scanner;

public class Main {
    private static NotePad notePad = new NotePad();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        boolean running = true;
        while (running) {
            System.out.println("-------------------");
            System.out.println("1. Add new note");
            System.out.println("2. Remove note");
            System.out.println("3. Show all notes");
            System.out.println("4. Export note");
            System.out.println("5. Exit");
            System.out.println("-------------------");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    String temp = addNoteMenu();
                    if (temp.equals("5"))
                        break;
                    if (temp.equals("note-added") || temp.equals("duplicate-title"))
                        System.out.println(temp);
                    break;
                case 2:
                    String temp1 = removeNoteMenu();
                    if (temp1.equals("5"))
                        break;
                    if (temp1.equals("note-removed") || temp1.equals("notfound-note"))
                        System.out.println(temp1);
                    break;
                case 3:
                    notePad.listNotes();
                    break;
                case 4:
                    String exportResult = exportNoteMenu();
                    if (!exportResult.equals("5"))
                        System.out.println(exportResult);
                    break;
                case 5:
                    running = false;
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
        scanner.close();
    }

    private static String addNoteMenu() {
        System.out.println("5. Main Menu\nWrite your note title:");
        String title = scanner.nextLine();
        if (title.equals("5"))
            return "5";
        System.out.println("Enter the text:");
        String content = scanner.nextLine();
        return notePad.addNote(title, content);
    }

    private static String removeNoteMenu() {
        System.out.println("5. Main Menu\nEnter the title of the note to remove:");
        String title = scanner.nextLine();
        if (title.equals("5"))
            return "5";
        return notePad.removeNote(title);
    }

    private static String exportNoteMenu() throws IOException {
        System.out.println("5. Main Menu\nEnter the title of the note to export:");
        String title = scanner.nextLine();
        if (title.equals("5"))
            return "5";
        notePad.exportNote(title);
        return notePad.exportNote(title);
    }
}
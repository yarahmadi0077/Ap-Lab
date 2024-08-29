import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.time.LocalDate;
public class NotePad {
    private Map<String, String> notes;
    private Map<String, LocalDate> creationDates;

    public NotePad() {
        notes = new HashMap<>();
        creationDates = new HashMap<>();
    }


    public String addNote(String title, String content) {
        if (notes.containsKey(title)) {
            return "duplicate-title";
        } else {
            notes.put(title, content);
            creationDates.put(title, LocalDate.now());
            return "note-added";
        }
    }

    public String removeNote(String title) {
        if (notes.containsKey(title)) {
            notes.remove(title);
            creationDates.remove(title);
            return "note-removed";
        } else {
            return "notfound-note";
        }
    }

    public void listNotes() {
        for (String title : notes.keySet()) {
            System.out.println("title:" + title + "     date    " + creationDates.get(title));
        }
    }


    public String exportNote(String title) throws IOException {
        if (notes.containsKey(title)) {
            File exportDir = new File("export");
            if (!exportDir.exists()) {
                exportDir.mkdir();
            }
            File file = new File(exportDir, title + ".txt");
            try (FileWriter writer = new FileWriter(file)) {
                writer.write(notes.get(title));
            }
            return (title + ".txt file is exported");
        } else {
            return ("not found title");
        }
    }
}

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
  Note note1 = new Note("Test1","this is dummy content1","1400/09/09");
  Note note2 = new Note("Test2","this is dummy content2","1400/09/10");
  ArrayList<Note> notes = new ArrayList<>();
  notes.add(note1);
  notes.add(note2);
   FileUtil fileUtil = new FileUtil();
   fileUtil.fileWriter("notebook(character_based).txt",notes);
   fileUtil.fileReader("notebook(character_based).txt");
   fileUtil.objectFileWriter("notebook(object_based).txt",notes);
   ArrayList<Note> received_notes = fileUtil.objectFileReader("notebook(object_based).txt");
        System.err.println("reading from a object_based file:");
   for(Note note : received_notes)
       System.out.print(note.toString());








    }
}

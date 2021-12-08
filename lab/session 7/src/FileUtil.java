import java.io.*;
import java.util.*;


/**
 * a class for working with files
 */
public class FileUtil {
    int count;

    /**
     * a Method with the ability to write character_based on a file with use of bufferedWriter
     *
     * @param path  path of the file
     * @param notes notes which want to be written in the notebook
     */
    public void fileWriter(String path, ArrayList<Note> notes) {
        try (FileWriter fileWriter = new FileWriter(path);
             BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)) {
            for (Note note : notes)
                bufferedWriter.write(note.toString());
            bufferedWriter.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * a Method with the ability to read character_based from a file with use of bufferedReader
     *
     * @param path path of the file
     */
    public void fileReader(String path) {
        try (FileReader fileReader = new FileReader(path);
             BufferedReader bufferedReader = new BufferedReader(fileReader)) {
            char[] buffer = new char[20];
            System.err.println("reading from a character_based file:");
            while (bufferedReader.ready()) {
                int count = bufferedReader.read(buffer);
                System.out.print(new String(buffer, 0, count));
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * a Method with the ability to write object_based on a file with use of fileOutputStream
     *
     * @param path  path of the file
     * @param notes notes which want to be written in the notebook
     */
    public void objectFileWriter(String path, ArrayList<Note> notes) {
        count = 0;
        try (FileOutputStream fileOutputStream = new FileOutputStream(path);
             ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream)) {
            for (Note note : notes) {
                objectOutputStream.writeObject(note);
                count++;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    /**
     * a Method with the ability to read object_based from a file with use of fileInputStream
     *
     * @param path path of the file
     * @return ArrayList of objects which are in the file
     */
    public ArrayList<Note> objectFileReader(String path) {
        ArrayList<Note> notes = new ArrayList<>();
        try (FileInputStream fileInputStream = new FileInputStream(path);
             ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream)) {

            int i = count - 1;
            while (i >= 0) {
                notes.add((Note) objectInputStream.readObject());
                i--;
            }
        }
       catch (IOException e){
            e.printStackTrace();
       }
        catch(ClassNotFoundException e){
            e.printStackTrace();
        }
        return notes;
    }
}
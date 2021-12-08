import java.io.*;
import java.util.*;

/**
 * a class for holding details of a Note
 */
public class Note implements Serializable{
    private String title;
    private String content;
    private String date;

    /**
     * creates a new Note
     * @param title title of the Note
     * @param content content of the Note
     * @param date  date of writting the Note
     */
    public Note(String title, String content, String date) {
        this.title = title;
        this.content = content;
        this.date = date;
    }

    /**
     * getter
     * @return title of the Note
     */
    public String getTitle() {
        return title;
    }

    /**
     * getter
     * @return content of the Note
     */
    public String getContent() {
        return content;
    }

    /**
     * getter
     * @return date of the Note
     */
    public String getDate() {
        return date;
    }

    /**
     * setter
     * @param title of the Note
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * setter
     * @param content  of the Note
     */
    public void setContent(String content) {
        this.content = content;
    }

    /**
     * setter
     * @param date of the Note
     */
    public void setDate(String date) {
        this.date = date;
    }

    /**
     * override to String Method
     * @return a String
     */
    @Override
    public String toString() {
        return getTitle() + "\t" + getContent() + '\t' + getDate() + '\n';
    }

    /**
     * override equals Method
     * @param o an object that is checked equals with this object or not
     * @return True if object equals with this object. otherwise; returns False
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Note note = (Note) o;
        return Objects.equals(title, note.title) && Objects.equals(content, note.content) && Objects.equals(date, note.date);
    }

}

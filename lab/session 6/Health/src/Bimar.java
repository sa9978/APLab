import java.util.ArrayList;

public class Bimar {
    private String name;
    private ArrayList<File> files = new ArrayList<>();
    private ArrayList<Doctor> doctors = new ArrayList<>();

    public String getName() {
        return name;
    }

    public ArrayList<File> getFiles() {
        return files;
    }

    public ArrayList<Doctor> getDoctors() {
        return doctors;
    }
}

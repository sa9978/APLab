import java.util.ArrayList;
import java.util.HashMap;

public class File {
    private Ilness ilness;
    private HashMap<Disease , Doctor> diseaseDrugsHashMap = new HashMap<>();

    public File(Ilness ilness) {
        this.ilness = ilness;
    }

    public Ilness getIlness() {
        return ilness;
    }

    public void setIlness(Ilness ilness) {
        this.ilness = ilness;
    }

    public HashMap<Disease, Doctor> getDiseaseDrugsHashMap() {
        return diseaseDrugsHashMap;
    }

    public void setDiseaseDrugsHashMap(HashMap<Disease, Doctor> diseaseDrugsHashMap) {
        this.diseaseDrugsHashMap = diseaseDrugsHashMap;
    }

    public ArrayList<Doctor> setArrayList()
    {
        ArrayList<Doctor> doctors = new ArrayList<>();
        int i ;
        for (i = 0 ; i < diseaseDrugsHashMap.size() ; i++)
        {
            doctors.add(diseaseDrugsHashMap.get(i));
        }
        return doctors;
    }

    @Override
    public String toString() {
        return "File{" +
                "ilness=" + ilness +
                ", diseaseDrugsHashMap=" + diseaseDrugsHashMap +
                '}';
    }
}

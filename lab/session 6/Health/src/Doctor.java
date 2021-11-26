public class Doctor {
    private String name;
    private String takhasos;

    public Doctor(String name, String takhasos) {
        this.name = name;
        this.takhasos = takhasos;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTakhasos() {
        return takhasos;
    }

    public void setTakhasos(String takhasos) {
        this.takhasos = takhasos;
    }
}

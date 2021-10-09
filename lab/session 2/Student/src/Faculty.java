public class Faculty {
    //--fields
    //faculty's capacity
    private int capacity;

    //faculty's current size
    private int current;

    //faculty's labs
    private Lab[] labs;

    //--constructors
    /**Create a new student with a given name and ID number.
     * @param cap faculty's capacity
     */
    public Faculty(int cap)
    {
        capacity = cap;
        labs = new Lab[capacity];
    }

    //--methods
    //--getters
    public int getCapacity() {
        return capacity;
    }
    public int getCurrent() {
        return current;
    }
    public Lab[] getLabs() {
        return labs;
    }

    //setters
    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
    public void setCurrent(int currentSize) {
        this.current = currentSize;
    }
    /**add a lab to lab
     *@param lab is new student
     * */
    public void enrollLab(Lab lab) {
        if (current < capacity) {
            labs[current] = lab;
            current++;
        } else {
            System.out.println("Faculty is full!!!");
        }
    }

    /**
     * @param labs sets Lab's stds
     */
    public void setLabs(Lab[] labs) {
        for (current = 0; current < labs.length; current++) {
            this.labs[current].setDay(labs[current].getDay());
            this.labs[current].setCapacity(labs[current].getCapacity());
            this.labs[current].setStudents(labs[current].getStudents());
        }
    }

    //print
    public void print() {
        System.out.println("capacity: " + capacity + " current size: "
                + current);
        System.out.println("Labs:");
        for (int i = 0; i < current; i++) {
            labs[i].print();
        }
    }



}

public class Lab
{
    //--fields
    private Student[] students;
    private int avg;
    private String day;
    private int capacity;
    private int currentSize;

    //--constructors
    /**Create a new student with a given name and ID number.
     * @param cap Lab's
     * @param d last name of student
     */
    public Lab(int cap, String d)
    {
        capacity = cap;
        day = d;
        students = new Student[capacity];
    }
    /**add a student to lab
    *@param std is new student
     * */
    public void enrollStudent(Student std)
    {
        if (currentSize < capacity)
        {
            students[currentSize] = std;
            currentSize++;
        }
        else
        {
            System.out.println("Lab is full!!!");
        }
    }
    /**
     * Print the student’s last name and ID number to the output terminal.
     */
    public void print()
    {
        calculateAvg();
        System.out.println("day : " + day
                + " capacity : " + capacity + " size : "
                + currentSize + " avg : " + avg);
        System.out.println("students : ");
        for (int i = 0 ; i < currentSize ; i++)
        {
            System.out.println (students[i].getFirstName() + " "
                    + students[i].getLastName() + ", student ID: "
                    + students[i].getID() + ", grade: "
                    + students[i].getGrade());
        }
        System.out.println("avg = " + avg);
    }
    /**
     * get students
     * @return students
     */
    public Student[] getStudents()
    {
        return students;
    }
    /**
     * @param students sets Lab's stds
     */
    public void setStudents(Student[] students) {
        for (currentSize = 0; currentSize < students.length; currentSize++) {
            this.students[currentSize].setFirstName(students[currentSize].getFirstName());
            this.students[currentSize].setLastName(students[currentSize].getLastName());
            this.students[currentSize].setGrade(students[currentSize].getGrade());
            this.students[currentSize].setId(students[currentSize].getID());
        }
    }
    /**
     * get the avg of student's grades
     * @return avg
     **/
    public int getAvg()
    {
        return avg;
    }
    public void calculateAvg()
    {
        int sum = 0;
        for (int i = 0 ; i < currentSize ; i++)
        {
            sum += students[i].getGrade();
        }
        avg = sum / currentSize;
    }
    /**
     * get the day of Lab
     * @return day
     **/
    public String getDay()
    {
        return day;
    }
    /**
     * @param day sets day of Lab
     */
    public void setDay(String day)
    {
        this.day = day;
    }
    /**
     * get the capacity of Lab
     * @return day
     **/
    public int getCapacity()
    {
        return capacity;
    }
    /**
     * @param capacity sets capacity of Lab
     */
    public void setCapacity(int capacity)
    {
        this.capacity = capacity;
    }
}
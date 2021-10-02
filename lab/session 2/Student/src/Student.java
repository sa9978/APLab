/*** The Student class represents a student in a student administration system.
 It holds the student details relevant in our context.
 * @author Sara
 * @version 0.0 */
public class Student {
    //--fields
    // the student’s first name
    private String firstName;

    // the student’s last name
    private String lastName;

    // the student ID
    private String id;

    //the grade
    private int grade;

    //--constructors
    /**Create a new student with a given name and ID number.
     * @param fName first name of student
     * @param lname last name of student
     * @param sID student ID
     */
    public Student(String fName, String lname, String sID)
    {
        firstName = fName;
        lastName = lname;
        id = sID;
        grade = 0;
    }

    //--methods
    /**
     * get the first name of student
     * @return lastName field
     */
    public String getLastName()
    {
        return lastName;
    }

    /**
     * get the id of student
     * @return id field
     */
    public String getId()
    {
        return id;
    }

    /**
     * get the first name of student
     * @return firstName field
     */
    public String getFirstName()
    {
        return firstName;
    }

    /**
     * get the grade of student
     * @return grade field
     */
    public int getGrade()
    {
        return grade;
    }

    /**
     * @param firstName set first name of a student
     */
    public void setFirstName(String fName)
    {
        firstName = fName;
    }

    /**
     * @param stdGrade set grade of a student
     */
    public void setGrade(int stdGrade)
    {
        grade = stdGrade;
    }

    /**
     * Print the student’s last name and ID number to the output terminal.
     */
    public void print()
    {
        System.out.println(lastName + ", student ID: " + id + ", grade: " + grade);
    }
}

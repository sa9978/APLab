/**
 * @author sara
 */
public class Person {
    private String firstname;
    private String lastName;

    /**
     *
     * @param firstname person's firstname
     * @param lastName person's lastname
     */
    public Person(String firstname, String lastName) {
        this.firstname = firstname;
        this.lastName = lastName;
    }
    //--GETTERS

    /**
     *
     * @return person's firstname
     */
    public String getFirstname() {
        return firstname;
    }

    /**
     *
     * @return person's lastname
     */
    public String getLastName() {
        return lastName;
    }

    public String toString()
    {
        return firstname + " " + lastName;
    }
}

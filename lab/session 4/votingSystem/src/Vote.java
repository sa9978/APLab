import java.util.Objects;

public class Vote {
    private Person person;
    private String date;

    /**
     *
     * @param person voter
     * @param date date of voting
     */
    public Vote(Person person, String date) {
        this.person = person;
        this.date = date;
    }

    /**
     *
     * @return person
     */
    public Person getPerson() {
        return person;
    }

    /**
     *
     * @return date
     */
    public String getDate() {
        return date;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vote vote = (Vote) o;
        return Objects.equals(person, vote.person) && Objects.equals(date, vote.date);
    }

    @Override
    public int hashCode() {
        return Objects.hash(person, date);
    }
}

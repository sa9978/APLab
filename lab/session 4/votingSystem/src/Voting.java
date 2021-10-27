import ir.huri.jcal.JalaliCalendar;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Voting {
    private int type; // 0 shows 1 vote & 1 shows multiple votes
    private String question;
    private ArrayList<Person> voters;
    private HashMap<String, HashSet<Vote>> polls; //maps choices to votes

    /**
     * @param type     voting type
     * @param question poll question
     */
    public Voting(int type, String question) {
        this.type = type;
        this.question = question;
        voters = new ArrayList<>();
        polls = new HashMap<>();
    }

    /**
     * @return question
     */
    public String getQuestion() {
        return question;
    }

    /**
     * @param choice adds a new choce to the poll
     */
    public void createChoice(String choice) {
        HashSet<Vote> votes = new HashSet<>();
        polls.put(choice, votes);
    }

    /**
     * @param person  the person's information who wants to vote
     * @param choices the person's choices (single / multiple choices)
     */
    public void vote(Person person, ArrayList<String> choices) {
        JalaliCalendar jalaliCalendar = new JalaliCalendar();

        if (!voters.contains(person)) //if person didn't vote before :
        {
            if ((type == 0 && choices.size() == 1) || (type == 1 && choices.size() > 1)) //if person wants to submit single vote
            {
                voters.add(person); //add person to the voters array list
                Vote newVote = new Vote(person, jalaliCalendar.toString()); //add new vote with person info and date as a string
                for (String choice : choices) //search choices to find choice and add new vote
                {
                    polls.get(choice).add(newVote);
                }
                System.out.println("Your Vote Submitted");
            }
        }
    }

    /**
     * @return voters
     */
    public ArrayList<Person> getVoters() {
        return voters;
    }

    /**
     * prints all votes / find the Winner and print it
     */
    public void printResult() {
        String winner = "";
        int max = 0;
        for (String choice : polls.keySet()) { //polls.keySet makes a new set with first part of hashmap
            System.out.println(choice + " : " + polls.get(choice).size());
            if (polls.get(choice).size() >= max) { //if votes counts for given choice is greater than max , then set winner
                max = polls.get(choice).size();
                winner = choice;
            }
        }
        System.out.println("Winner Is : " + winner + " !!");
    }

    /**
     *
     * @return polls
     */
    public HashMap<String, HashSet<Vote>> getPolls() {
        return polls;
    }
}

import java.util.ArrayList;

public class VotingSystem {
    private ArrayList<Voting> votingList;
    /**
     *CONSTRUCTOR
     */
    public VotingSystem() {
        votingList = new ArrayList<>();
    }

    /**
     *
     * @param question vote question
     * @param type voting type / single or multiple
     */
    public void createVoting(String question, int type) // creat new voting
    {
        Voting voting = new Voting(type , question);
        votingList.add(voting);
    }

    /**
     *
     * @return votingList
     */
    public ArrayList<Voting> getVotingList() {
        return votingList;
    }

    public void vote (int index , Person person , ArrayList<String> choices)
    {
        votingList.get(index).vote(person, choices);
    }

    /**
     * print voting questions
     */
    public void printListOfVotings(){
        for (int i = 0 ; i < votingList.size() ; i++)
        {
            System.out.println(i + ") " +votingList.get(i).getQuestion());
        }
    }

    /**
     *
     * @param index of voting
     */
    public void printVoting(int index)
    {
        int count = 0;
        System.out.println("Q : "+ votingList.get(index).getQuestion());
        for (String ch: votingList.get(index).getChoices())
        {
            System.out.println(count +" ) " + ch);
            count++;
        }
    }

    public void printResult(int index)
    {
        votingList.get(index).printResult();
    }
    public void voteRandom(int index,Person person) {
            votingList.get(index).RandomChoice(person);
        }
}


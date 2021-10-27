import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        VotingSystem votingSystem = new VotingSystem();
        votingSystem.createVoting("What is your favorite food?", 0);
        votingSystem.getVotingList().get(0).createChoice("lasagna");
        votingSystem.getVotingList().get(0).createChoice("pizza");
        votingSystem.createVoting("Which sauce do yo prefer?", 0);
        votingSystem.getVotingList().get(1).createChoice("ketchup");
        votingSystem.getVotingList().get(1).createChoice("mayonnaise");
        System.out.println("pls enter your firstname & last name");
        Person newPerson = new Person(scanner.next(), scanner.next());
        votingSystem.printListOfVotings();
        System.out.println("Which voting?");
        int votingIndex = scanner.nextInt();
        Voting voting = votingSystem.getVotingList().get(votingIndex);

        votingSystem.printVoting(votingIndex);
        ArrayList<String> choices = new ArrayList();

        char anotherVote;
        do {
            System.out.println("Enter yor vote:");
            int choice = scanner.nextInt();
            ArrayList<String> choicesList = new ArrayList(voting.getPolls().keySet());
            String vote;
            vote = choicesList.get(choice);
            choices.add(vote);
            System.out.println("another choice?(y/n)");
            anotherVote = scanner.next().charAt(0);
        } while (anotherVote == 'y');

        votingSystem.vote(votingIndex, newPerson, choices);
        System.out.println("final results:");
        votingSystem.printResult(votingIndex);
    }
}

import java.util.ArrayList;

public class VotingSystem {
    private ArrayList<Voting> votingList ;

    public VotingSystem() {
        votingList = new ArrayList<Voting>();
    }
    public ArrayList<Voting> getVotingList() {
        return votingList;
    }
    public void createVoting(String question, boolean isAnonymous, int type, ArrayList<String> choices){
        Voting newVoting = new Voting(type, question, isAnonymous);

        for (String i: choices) {
            newVoting.createChoice(i);
        }

        votingList.add(newVoting);
    }
    public Voting getVoting(int index) {
        return votingList.get(index);
    }
    public void printResults(int index){
        int tmp = votingList.size() ;
        if (index >= tmp || index < 0 ){
            System.out.println("Index is out of range");
        }
        else {
            System.out.println("Voting (" + index + ")");
            votingList.get(index).printResults();
        }
    }
    public void printVoters(int index) {
        int tmp = votingList.size();
        if (index >= tmp || index < 0 ){
            System.out.println("Index is out of range");
        }
        System.out.println("voters " + index);
        votingList.get(index).printVoters();
    }
    public void printVoting(int index) {
        int tmp = votingList.size();
        if (index >= tmp || index < 0 ){
            System.out.println("Index is out of range");
        }

        System.out.println(votingList.get(index).getQuestion());
        System.out.println("--------------------------------------------");
        ArrayList<String> choices = votingList.get(index).getChoices();

        for (int i = 0; i < choices.size(); i++) {
            System.out.println(i + ": " + choices.get(i));
        }
    }
    public void vote(int index, Person voter, ArrayList<String> choices) {
        int tmp = votingList.size();
        if (index >= tmp || index < 0 ){
            System.out.println("Index is out of range");
        }

        votingList.get(index).vote(voter, choices);
    }

    public void vote(int index, Person person) {
        int tmp = votingList.size();
        if (index >= tmp || index < 0 ){
            System.out.println("Index is out of range");
        }

        votingList.get(index).vote(person);
    }

}

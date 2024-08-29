import java.util.HashMap;
import java.util.HashSet;
import java.util.ArrayList;
import java.util.Random;

public class Voting {
    private int type;
    private String question;
    private HashMap<String,HashSet<Vote>> choices;
    private boolean isAnonymous;
    private ArrayList<Person> voters;

    public Voting(int type, String question, boolean isAnonymous) {
        this.type = type;
        this.question = question;
        this.isAnonymous = isAnonymous;
        this.choices = new HashMap<String, HashSet<Vote>>();
        this.voters = new ArrayList<Person>();
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public ArrayList<String> getChoices(){
        ArrayList<String> options = new ArrayList<String>();
        for (String s : choices.keySet()) {
            options.add(s);
        }
        return options;
    }
    public void createChoice(String choice) {
        HashSet<Vote> options = new HashSet<Vote>();
        choices.put(choice, options);
    }
    public void vote(Person voter, ArrayList<String> voter_choices){
        if (type == 1 && voter_choices.size() > 1)
            System.out.printf("you can just vote to one option!\n" +
                    "------------------------------------------\n");
        else {
            for (String s: voter_choices) {
                Vote newVote = new Vote(voter, "1402/12/21");
                choices.get(s).add(newVote);
            }
        }
    }
    public void vote(Person person){
        Random rand = new Random() ;
        ArrayList<String> choices = getChoices();
        int randChoice = rand.nextInt(choices.size());
        Vote newVote = new Vote(person, "1402/12/21");
        this.choices.get(randChoice).add(newVote);
    }
    public void printResults(){
        for (String i: choices.keySet()) {
            System.out.println(i + ": " + choices.get(i).size());
        }
    }
    public void printVoters() {
        if (!isAnonymous) {
            for (String choice : choices.keySet()) {
                System.out.println(choice + ": ");
                for (Vote vote : choices.get(choice)) {
                    Person voter = vote.getVoter();
                    System.out.println(voter.getFirstname() + " " + voter.getLastname());
                }
            }
        } else {
            System.out.println("This voting is Anonymous!");
        }
    }

}

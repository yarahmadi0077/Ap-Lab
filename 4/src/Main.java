/**
 * Voting system
 * @author Mohammad-Yarahmadi 40231059
 * @version 1.0
 * @since 2023-03-30
 */

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        VotingSystem votingSystem = new VotingSystem();
        ArrayList<String> choices = new ArrayList<String>();
        ArrayList<String> choices2 = new ArrayList<String>();

        Person person1 = new Person("Hamed", "Mousivand");
        Person person2 = new Person("Mohammad", "Yarahmadi");
        Person person3 = new Person("pourya", "Azizi");
        Person person4 = new Person("Seyed AmirHossein", "MirAhmadi");
        Person person5 = new Person("Hossein", "Zeinali");

        choices.add("choice1");
        choices.add("choice2");
        choices.add("choice3");

        choices2.add("choice1");

        votingSystem.createVoting("question1", false , 0, choices);
        votingSystem.createVoting("question2", false, 0, choices);
        votingSystem.createVoting("question3", true, 1, choices);

        votingSystem.getVoting(0).vote(person2, choices);
        votingSystem.getVoting(1).vote(person3, choices);
        votingSystem.getVoting(1).vote(person4, choices);
        votingSystem.getVoting(0).vote(person5, choices);

        votingSystem.getVoting(0).vote(person1, choices2);
        votingSystem.getVoting(1).vote(person2, choices2);
        votingSystem.getVoting(2).vote(person1, choices2);
        votingSystem.getVoting(2).vote(person2, choices); // this voting is from type 1, so can't choice more than one choice 

        votingSystem.printVoting(0);
        System.out.println();
        votingSystem.printVoting(1);
        System.out.println();
        votingSystem.printVoting(2);

        System.out.println();
        System.out.println();
        System.out.println();

        votingSystem.printResults(0);
        System.out.println();
        votingSystem.printResults(1);
        System.out.println();
        votingSystem.printResults(2);

        System.out.println();
        System.out.println();
        System.out.println();

        votingSystem.printVoters(0);
        System.out.println();
        votingSystem.printVoters(1);
        System.out.println();
        votingSystem.printVoters(2); // no print because of anonymous
    }
}
package BasicNumberProblems;
import java.util.Scanner;

public class VotingSystem {
    public static void main(String[] args) {
        System.out.println("Voting System");
        Scanner in = new Scanner(System.in);

        int votingCandidate1 = 0 ;
        int votingCandidate2 = 0 ;

        System.out.print("Enter Voter Name: ");
        String name = in.next();

        System.out.print("Enter Voter Age: ");
        int age = in.nextInt();


        if(age >= 18){
            System.out.println("Please Select Candidate for Vote");
            System.out.println("1. Candidate A");
            System.out.println("2. Candidate B");

            int voteChoice = in.nextInt();
            if(voteChoice == 1){
                votingCandidate1++;
            }
            else if(voteChoice == 2){
                votingCandidate2++;
            }
            else{
                System.out.println("Invalid Choice");
            }

            System.out.println("Thank You For Voting "+ name );
            System.out.println("Candidate A Votes: "+ votingCandidate1);
            System.out.println("Candidate B Votes: "+ votingCandidate2);
        }
        else{
            System.out.println("You are Not Eligible for vote");
        }
        in.close();
    }
}

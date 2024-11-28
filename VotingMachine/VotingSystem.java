import java.util.Scanner;  

public class VotingSystem {
    public static void main(String[] args) {
        // Step 1: Declare an array for candidates' names
        String[] candidates = {"Samvidhan Sharma", "Shahil Thakur", "Aadhya Mathur"};  

        // Step 2: Declare an array to keep track of votes for each candidate
        int[] votes = new int[candidates.length];  

        // Step 3: Create a Scanner object to get input from the user
        Scanner scanner = new Scanner(System.in);

        // Step 4: Print out the list of candidates
        System.out.println("Simple Voting System");
        System.out.println("Candidates:");
        
        // Step 5: Show each candidate with a number next to their name (1, 2, 3)
        for (int i = 0; i < candidates.length; i++) {
            System.out.println((i + 1) + ". " + candidates[i]);  
        }

        // Step 6: Ask how many people will vote
        System.out.print("Enter the number of voters: ");
        int numVoters = scanner.nextInt();  
        
        // Step 7: Start collecting votes from each voter
        for (int i = 0; i < numVoters; i++) {
            System.out.println("\nVoter " + (i + 1) + ":");  
            System.out.print("Enter the candidate number you want to vote for: ");
            int vote = scanner.nextInt();  
            
            // Step 8: Check if the vote is valid (between 1 and 3)
            if (vote >= 1 && vote <= candidates.length) {
                votes[vote - 1]++;  
            } else {
                System.out.println("Invalid vote! Please choose a valid candidate.");
                i--;
            }
        }

        // Step 9: Display the results after all voters have voted
        System.out.println("\nVoting Results:");
        
        // Step 10: Show the final votes for each candidate
        for (int i = 0; i < candidates.length; i++) {
            System.out.println(candidates[i] + " received " + votes[i] + " votes.");  
        }

        // Step 11: Find the winner by identifying the candidate with the maximum votes
        int maxVotes = votes[0];
        int winnerIndex = 0;
        for (int i = 1; i < votes.length; i++) {
            if (votes[i] > maxVotes) {
                maxVotes = votes[i];
                winnerIndex = i;
            }
        }

        // Step 12: Print the winner's name and total votes
        System.out.println("\nThe winner is " + candidates[winnerIndex] + " with " + maxVotes + " votes.");

        // Step 13: Close the scanner to free up resources
        scanner.close();
    }
}

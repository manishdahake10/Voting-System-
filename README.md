# Voting System Project

## Overview
This is a Voting System application built in Java that allows users to vote on a predefined set of candidates. It manages votes, ensures that only authorized users can vote, and displays voting results after the election process.

## Features
- Users can cast votes for available candidates.
- Voting is restricted to authorized users.
- Admin users can view the voting results after the election.
- Simple and efficient design using Object-Oriented Programming principles.

## Class Name
- `VotingSystem`: The main class to manage the voting process.

## Technologies Used
- **Java**: The programming language used for building the system.
- **Text-based Interface**: The voting system is implemented as a command-line interface.

## Requirements
- Java 8 or above.
- No external libraries are required.

## Installation
1. Clone this repository to your local machine:
    ```bash
    git clone https://github.com/manishdahake10/VotingSystem.git
    ```

2. Navigate to the project directory:
    ```bash
    cd VotingSystem
    ```

3. Compile the `VotingSystem.java` file:
    ```bash
    javac VotingSystem.java
    ```

4. Run the application:
    ```bash
    java VotingSystem
    ```

## Usage
Once the program runs, you will be prompted to either:
- Vote for a candidate.
- View voting results (if you are an admin).
- Exit the system.

### Example Output
 ```bash
Welcome to the Voting System
Here are the available candidates:

D:\Project\backEndTech\VotingMachine>javac VotingSystem.java

D:\Project\backEndTech\VotingMachine>java VotingSystem
Simple Voting System
Candidates:
1. Samvidhan Sharma
2. Shahil Thakur
3. Aadhya Mathur
Enter the number of voters: 4

Voter 1:
Enter the candidate number you want to vote for (1 for Alice, 2 for Bob, 3 for Charlie): 2

Voter 2:
Enter the candidate number you want to vote for (1 for Alice, 2 for Bob, 3 for Charlie): 2

Voter 3:
Enter the candidate number you want to vote for (1 for Alice, 2 for Bob, 3 for Charlie): 3

Voter 4:
Enter the candidate number you want to vote for (1 for Alice, 2 for Bob, 3 for Charlie): 1

Voting Results:
Samvidhan Sharma received 1 votes.
Shahil Thakur received 2 votes.
Aadhya Mathur received 1 votes.

The winner is Shahil Thakur with 2 votes.
```

## Code Structure
The project consists of the following structure:

- `VotingSystem.java`: The main file that handles user input, vote processing, and results display.

## Contribution
Feel free to fork this repository and contribute by opening issues or pull requests.

## Author
**Manish Dahake**  
GitHub: [manishdahake10](https://github.com/manishdahake10)

## License
This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.




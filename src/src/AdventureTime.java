import java.util.Scanner;

public class AdventureTime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the IBDP game! You'll have to make a series of choices that will either get you into university or lose. Choose wisely!");
        System.out.println("You'll be making choices that will either decrease or increase your acceptance chance starting from 0");
        System.out.println("The goal is to get an 80 or above acceptance Chance for a prestigious university");
        System.out.println("If your score stays constant or decreases two times in a row, you're out.");
        int acceptanceChance = 0;
        String playerName = "";

        System.out.println("Please enter your name: ");
        playerName = scanner.nextLine();
        System.out.println("Hello, " + playerName + "! Let's Begin\n");

        int previousAcceptanceChance = 0;
        int consecutiveDecreases = 0;

        while (true) {
            System.out.println("Current acceptanceChance: " + acceptanceChance);
            System.out.println("Summer is ending! You're about to enter Year 13, the final year of IBDP!");
            System.out.println("Enter a random number between 1 - 10");

            int playerChoice = scanner.nextInt();

            if (playerChoice >= 0) {
                System.out.println("Would you like to start writing your extended essay?");
                System.out.println("Enter 1 for yes or 2 for no");

                int essayChoice = scanner.nextInt();
                if(essayChoice == 1 || essayChoice == 2){
                    acceptanceChance += 40;
                    consecutiveDecreases += 0;
                    System.out.println("acceptance chance = " + acceptanceChance);

                    System.out.println("Now choose how many co-curricular activities to join this year!");
                    System.out.println("Enter 1 for no CCA");
                    System.out.println("Enter 2 for 1-2 activities");
                    System.out.println("Enter 3 for 3 activities or above");

                    int activities = scanner.nextInt();
                    if (activities == 1) {
                        acceptanceChance -= 5;
                        consecutiveDecreases++;
                        System.out.println("acceptance chance = " + acceptanceChance + " Oh no you lost 5 points :( Another 5 points you will lose the game");

                        System.out.println("Please enter how many universities you've applied to");

                        int noOfUnis = scanner.nextInt();
                        if(noOfUnis <= 3){
                            acceptanceChance -= 5;
                            consecutiveDecreases ++;
                            System.out.println("acceptance chance = " + acceptanceChance + "oh no you've lost the game, please try again.");
                        }
                        else if(noOfUnis > 3) {
                            acceptanceChance += 30;
                            consecutiveDecreases += 0;
                            System.out.println("acceptance chance = " + acceptanceChance + "\n phew, You're safe! The next choice determines your acceptance!");

                            System.out.println("Please enter 1 for test optional and 2 for submitted test scores!");

                            int testOps = scanner.nextInt();

                            if (testOps == 1) {
                                acceptanceChance -= 5;
                                consecutiveDecreases++;
                                System.out.println("acceptance chance = " + acceptanceChance + "\n oh no you've lost the game, please try again.");
                            } else if (testOps == 2) {
                                acceptanceChance += 30;
                                consecutiveDecreases += 0;
                                System.out.println("acceptance chance = " + acceptanceChance + "\n Congrats! You've won the game");

                            }
                        }
                    else if (activities == 2) {
                        acceptanceChance += 20;
                        consecutiveDecreases += 0;
                        System.out.println("acceptance chance = " + acceptanceChance);

                        System.out.println("Almost there! Please enter the numbers of recommendations letters you've recieved so far.");

                        int recLetters = scanner.nextInt();

                        if (recLetters < 3){
                            acceptanceChance -= 5;
                            consecutiveDecreases ++;
                            System.out.print("oh no you've lost 5 points please continue playing.");


                        }
                        else if (recLetters > 2){
                            acceptanceChance += 20;
                            consecutiveDecreases += 0;
                            System.out.println("Congrats you won the game! You're getting into your dream university!");
                            break;
                        }
                    }
                    else if(activities == 3){
                        System.out.println("Please enter your SAT Score");

                        int satScore = scanner.nextInt();

                        if (satScore <= 1200) {
                            acceptanceChance -= 5;
                            consecutiveDecreases ++;
                            System.out.println("Uh oh, is that a friday detention I see for failing 😡you've lost the game :( please try again.");
                            break;
                        } else if (satScore > 1200 && satScore <= 1500) {
                            acceptanceChance += 10;
                            consecutiveDecreases = 0;
                            System.out.println("acceptance chance = " + acceptanceChance + "\n Ayee back at it again!");

                            System.out.println("Oh look who it is! You have asked Jesus to write you a rec letter but he said no he's busy this week :( do you: \n");
                            System.out.println("Enter 1: Get mad and ask another teacher");
                            System.out.println("Enter 2: Immediately raise voice at Mr Ewing (never do that PLS!)");
                            System.out.println("Enter 3: be patient and wait for a week before asking again + ask another subject teacher just in case");

                            int recLetter = scanner.nextInt();
                            if (recLetter == 1) {
                                acceptanceChance += 10;
                                consecutiveDecreases = 0;
                                System.out.println("acceptance chance = " + acceptanceChance + "\n Phew you're safe..close call! 55 more points to go\n");

                                System.out.println("It's almost Christmas Break! Do you: ");

                                System.out.println("Enter 1: Go on a 3 week holiday");
                                System.out.println("Enter 2: Wait at home for ED results and be bored");
                                System.out.println("Enter 3: Hang out with friends and study!");

                                int christmasBreak = scanner.nextInt();
                                if (christmasBreak == 1) {
                                    acceptanceChance -= 5;
                                    consecutiveDecreases++;
                                    System.out.println("acceptance chance = " + acceptanceChance + "\n Oh no you lost 5 points :( Another 5 points you will lose the game");

                                    int ibExam = scanner.nextInt();
                                    System.out.println("It's ib exam season! Are you going to: ");
                                    System.out.println("Enter 1: Revise for exam early");
                                    System.out.println("Enter 2: Put it off and plan the graduation trip");

                                    if (ibExam == 1) {
                                        acceptanceChance -= 5;
                                        consecutiveDecreases++;
                                        System.out.println("acceptance chance = " + acceptanceChance + "\n Oh no you lost another 5 points :( YOU LOST!");
                                        break;
                                    }
                                    acceptanceChance += 30;
                                    consecutiveDecreases += 0;
                                    System.out.println("acceptance chance = " + acceptanceChance + "\n Back at it again!");

                                } else
                                    acceptanceChance -= 5;
                                consecutiveDecreases++;
                                System.out.println();

                                if (christmasBreak == 2) {
                                    acceptanceChance += 10;
                                    consecutiveDecreases += 0;
                                    System.out.println("acceptance chance = " + acceptanceChance + "you're safe.");
                                } else if (christmasBreak == 3) {
                                    acceptanceChance += 30;
                                    consecutiveDecreases += 0;
                                    System.out.println("acceptance chance = " + acceptanceChance + "\n so close!");
                                }

                        } else {

                            System.out.println("How motivated are you for school?");
                            System.out.println("Enter 1 for not at all");
                            System.out.println("Enter 2 for mediocre");
                            System.out.println("Enter 3 for pumped and ready to grind academics!");

                            int motivated = scanner.nextInt();
                            if (motivated == 1) {
                                acceptanceChance -= 5;
                                consecutiveDecreases++;
                                System.out.println("uh oh, you've lost points consecutively, end of the game. Please start again.");
                            } else if (motivated == 2) {
                                acceptanceChance += 10;
                            } else if (motivated == 3) {
                                acceptanceChance += 20;
                            } else {
                                acceptanceChance -= 5;
                                consecutiveDecreases++;
                                System.out.println("acceptance chance = " + acceptanceChance);
                            }
                        }


                if (acceptanceChance >= 80) {
                    System.out.println("Congratulations, " + playerName + "! You have an acceptance chance of " + acceptanceChance + " and are eligible to apply to prestigious universities!");
                    break;
                }
            } else if (playerChoice < 5) {
                acceptanceChance -= 10;
                System.out.println("acceptance chance = " + acceptanceChance);
                System.out.println("Uh-oh! Your acceptance chance decreased.");
            }

            if (consecutiveDecreases >= 2) {
                System.out.println("Sorry, " + playerName + ". Your acceptance chance dropped two times in a row. You have been disqualified from the game.");
                break;
            }

            // Check if acceptance chance decreased
            if (acceptanceChance <= previousAcceptanceChance) {
                consecutiveDecreases++;
            } else {
                consecutiveDecreases = 0;
            }

            previousAcceptanceChance = acceptanceChance;
        }

        System.out.println("Thank you for playing, " + playerName + "! Goodbye! \n ");
    }
}}}}}
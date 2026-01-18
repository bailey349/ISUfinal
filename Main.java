// NAME: Bailey Chu. G1 ROAD TEST PROGRAM
import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String password = "password"; // Admin password
        String username = "";
        boolean passed = true;

        // For the ArrayLists below, they are all connected, in that, index 0 of each signsQuestions, multipleChoiceP1, and signsAnswers are the question, options, and answer. Later in the code, a randomly generated number can grab the corresponding indexes so everything is displayed easily and correctly to the user.
        // First Part (10 Signs Questions)
        ArrayList<String> signsQuestions = new ArrayList<>();
        signsQuestions.add("What does a sign with a red circle and a diagonal line mean?");
        signsQuestions.add("A green sign on the highway is used for?: ");
        signsQuestions.add("What does a red octagonal sign mean?");
        signsQuestions.add("A yellow diamond-shaped sign warns drivers of?");
        signsQuestions.add("What does a white rectangular sign usually indicate?");
        signsQuestions.add("What does a sign with a black “X” and the words “Railway Crossing” mean?");
        signsQuestions.add("A sign showing a curved arrow means");
        signsQuestions.add("What does a fluorescent yellow-green sign indicate?");
        signsQuestions.add("What does a sign with an orange background tell drivers?");
        signsQuestions.add("What does a “Maximum Speed” sign mean?");

        // Second Part (10 Rules of the Road Questions)
        ArrayList<String> rulesQuestions = new ArrayList<>();
        rulesQuestions.add("What does a solid yellow line mean?");
        rulesQuestions.add("When are you allowed to pass on the right?");
        rulesQuestions.add("What is the penalty for failing to wear a seatbelt?");
        rulesQuestions.add("What should drivers do if traffic lights are not working at an intersection?");
        rulesQuestions.add("What should you do when an emergency vehicle approaches with lights and siren on?");
        rulesQuestions.add("When driving at night, you must dim your high beams, ");
        rulesQuestions.add("What is the legal blood alcohol concentration (BAC) for a fully licensed G driver in Ontario?");
        rulesQuestions.add("When approaching a stopped school bus with red lights flashing? What should you do?");
        rulesQuestions.add("When must you yield the right-of-way to pedestrians?");
        rulesQuestions.add("At a four-way stop, who has the right-of-way?");

        // First Part Multiple Choice
        ArrayList<String> multipleChoiceP1 = new ArrayList<>();
        multipleChoiceP1.add("A. Prohibited action\nB. Warning\nC. Mandatory action immediately\nD. Temporary condition");
        multipleChoiceP1.add("A. Directional guidance\nB. Scenic routes\nC. Construction warnings\nD. School crossings");
        multipleChoiceP1.add("A. Yield\nB. Do not enter\nC. Stop\nD. Slow moving vehicle");
        multipleChoiceP1.add("A. Construction zones\nB. School areas\nC. Hazards or changing road conditions\nD. Regulatory rules");
        multipleChoiceP1.add("A. Warning\nB. Speed limits or regulations\nC. Temporary conditions\nD. Tourist information");
        multipleChoiceP1.add("A. Railway crossing ahead\nB. Yield to trains\nC. Stop before crossing\nD. No trains use this track");
        multipleChoiceP1.add("A. Detour ahead\nB. Road curves in the direction shown\nC. Turn prohibited\nD. Winding road ends");
        multipleChoiceP1.add("A. Construction work\nB. Pedestrian or school zones\nC. Hospital area\nD. Emergency routes");
        multipleChoiceP1.add("A. This is a school zone\nB. There is a hazard ahead\nC. There is construction or maintenance\nD. The road is slippery");
        multipleChoiceP1.add("A. Fastest legal speed allowed\nB. Lowest safe speed\nC. Recommended speed\nD. Speed for ideal conditions only");

        // Second Part Multiple Choice
        ArrayList<String> multipleChoiceP2 = new ArrayList<>();
        multipleChoiceP2.add("A. Passing is allowed\nB. Passing is never allowed\nC. Passing is allowed with caution\nD. Passing depends on traffic signs");
        multipleChoiceP2.add("A. Never\nB. When the vehicle ahead is turning left\nC. On a two-lane road\nD. In school zones");
        multipleChoiceP2.add("A. Warning only\nB. Licence suspension\nC. Fine and demerit points\nD. Vehicle repossession");
        multipleChoiceP2.add("A. Proceed without stopping\nB. Treat it as a four-way stop\nC. Yield only to the right\nD. Follow the car ahead");
        multipleChoiceP2.add("A. Speed up to get out of the way\nB. Stop immediately in your lane\nC. Pull over to the right and stop\nD. Turn left at the nearest intersection");
        multipleChoiceP2.add("A. Within 150m of another vehicle\nB. Within 300 m of an oncoming vehicle\nC. Only in city driving\nD. Only during fog");
        multipleChoiceP2.add("A. 0.08%\nB. 0.05%\nC. 0.02%\nD. 0.00%");
        multipleChoiceP2.add("A. Slow down and proceed with caution\nB. Stop only if children are visible\nC. Stop regardless of direction unless separated by a median\nD. Honk and pass carefully");
        multipleChoiceP2.add("A. Only at intersections\nB. Only when traffic lights are present\nC. At marked and unmarked crosswalks\nD) Only in school zones");
        multipleChoiceP2.add("A. The first vehicle to stop\nB. The vehicle on the left\nC. The largest vehicle\nD. The vehicle going straight");

        // First Part Letter Answers
        ArrayList<String> signsAnswers = new ArrayList<>();
        signsAnswers.add("A");
        signsAnswers.add("A");
        signsAnswers.add("C");
        signsAnswers.add("C");
        signsAnswers.add("B");
        signsAnswers.add("A");
        signsAnswers.add("B");
        signsAnswers.add("B");
        signsAnswers.add("C");
        signsAnswers.add("A");

        // Second Part Letter Answers
        ArrayList<String> rulesAnswers = new ArrayList<>();
        rulesAnswers.add("B");
        rulesAnswers.add("B");
        rulesAnswers.add("C");
        rulesAnswers.add("B");
        rulesAnswers.add("C");
        rulesAnswers.add("A");
        rulesAnswers.add("A");
        rulesAnswers.add("C");
        rulesAnswers.add("C");
        rulesAnswers.add("A");

        System.out.println("Welcome to our G1 Test Roads Rules Practice Test!\nPlease type in the corresponding letter from the option to begin.\na. Write the G1 Test\nb. Login as admin");

        String userInput = ""; // Used various times throughout my code for error handling and to store user input in a variable instead of using multiple "sc.nextLine()" which would need to be consumed.
        String startMenu = "";

        // Determine whether admin/normal quiz. Error handling because user's input must but either 'a' or 'b' or else variable will stay empty. Will loop as needed.
        while(startMenu.equals("")) {
            userInput = sc.nextLine();
            if (userInput.equalsIgnoreCase("A")) {
               startMenu = "A";
            } else if (userInput.equalsIgnoreCase("B")) {
                startMenu = "B";
        } else {
                System.out.println("Invalid option. Try again!");
            }
        }

        boolean adminFail = false; // For if admin does not know password, can still take test.
        boolean adminPassword = false; // If correct, becomes true and admin can remove or add a question.
        boolean adminModifiedQuiz = false; // When admin finishes modifications, can take it after.
        boolean adminAdded = false; // Special statement so that when admin adds a question, they can see it when they take the quiz after
        String userPassword = ""; // Store user input to check if correct. If they want to quit and continue to the quiz they can type 'X'

        // Initial Admin Login
        if (startMenu.equals("B")) {
          while(!adminPassword) {
              System.out.println("Enter the secret password (case sensitive): ");
              userPassword = sc.nextLine();
              if (userPassword.equalsIgnoreCase("X")) {
                  break;
              } else if (userPassword.equals(password)) {
                      System.out.println("Access granted!");
                      adminPassword = true;
                  } else {
                      System.out.println("The password is incorrect (type 'X' to quit and continue as a user)");
                      adminFail = true;
                  }
        }
          // This variable store's the user's customized multiple choice options.
          String userMCOptions = "";

          // If the user were to remove a question, their number is stored here. It is a String data type just in case user inputs letters instead of numbers (1-10)
          String adminInteger = "";

          // If user were to remove a question, this count variable helps them associate a number with the question to remove
          int count = 1;

          // Variables for error handling for lines of code below
          boolean adminCorrectInput = false;
          String adminOption = "";

            // After password is correct, then prompt for adding/removing one question
            if (adminPassword) {
              while (!adminCorrectInput) {
                  System.out.println("Please type in the corresponding letter from the option.\na. Add a question\nb. Remove a question");
                  adminOption = sc.nextLine();
                  // To add a question, I need the user to enter their question, their multiple choice options, and their answer to 3 separate ArrayLists
                  if (adminOption.equalsIgnoreCase("A")) {
                      adminCorrectInput = true; // If admin typed letter wrong then can try again
                      adminModifiedQuiz = true; // Allows for admin to take the modified quiz with changes later
                      System.out.print("Enter your question (will be included in your test after): "); // Gather question
                      rulesQuestions.add(sc.nextLine());
                      // Loop ensures user gets exact multiple choice they want.
                      while (true) {
                          userMCOptions = "";
                          System.out.println("Enter your multiple choice options in the format of letters A-D then a subsequent period\nExample: A. Option 1"); // Gather multiple choice options
                          for (int i = 0; i < 4; i++) {
                              userMCOptions += sc.nextLine() + "\n"; // Concatenate with consistent line breaks.
                          }
                          System.out.println("Options saved. Would you like the change any options? Enter 'Y' for yes and 'N' for no.\n" + userMCOptions); // Final check with user if multiple choice questions correct
                          userInput = sc.nextLine();
                          if (userInput.equalsIgnoreCase("Y")) {
                              System.out.println("Restarting multiple choice...");
                          } else {
                              multipleChoiceP2.add(userMCOptions); // When confirmed, save to ArrayList
                              break;
                          }
                      }
                      System.out.println("Finally, what is the letter answer to your question?"); // Gather single letter answer
                      while (true) {
                          userInput = sc.nextLine().toUpperCase();
                          // Code below ensures that the length is only 1 and contains either A, B, C, or D
                          if (!userInput.contains("A") && !userInput.contains("B") && !userInput.contains("C") && !userInput.contains("D") && userInput.length() == 1) {
                              System.out.println("Make sure you have only one letter of A, B, C, or D. Try again.");
                          } else {
                              rulesAnswers.add(userInput);
                              System.out.println("Letter saved!");
                              break;
                          }
                      }
                      adminAdded = true;
                      // Block to remove a question from list
                      // Code below allows users choose which set of questions to remove from (Signs/Rules of road)
                  } else if (adminOption.equalsIgnoreCase("B")) {
                      adminCorrectInput = true;
                      adminModifiedQuiz = true;
                      System.out.println("Please specify whether you want to remove a signs or rules of the road question?\na. Signs\nb. Rules of the Road");
                      userInput = "";
                      while(userInput.equals("")) {
                          userInput = sc.nextLine().toUpperCase();
                          // Code below removes question from signs
                          if (userInput.equals("A")) {
                              userInput = "A";
                              System.out.println("The signs questions are listed below: ");
                              for (String signsQuestion : signsQuestions) {
                                  System.out.println(count + ". " + signsQuestion);
                                  count += 1;
                              }
                              System.out.println("Type the number corresponding to the question you want to remove");
                              adminInteger = sc.nextLine(); // Stored as a String for error handling.
                              // If user's number were greater than or less than 1-10 (within ArrayList indexes) or letters then program asks the user as much as needed.
                              while(true) {
                                  if (adminInteger.trim().equalsIgnoreCase("10")) {
                                      break;
                                  } else if (adminInteger.length() == 1 && adminInteger.charAt(0) <= '9' && adminInteger.charAt(0) >= '1') {
                                      break;
                                  } else {
                                      System.out.println("Please enter a number from 1-10. Try again!");
                                      adminInteger = sc.nextLine();
                                  }
                              }
                              System.out.println("Question removed!\nCommencing Quiz...");
                              signsQuestions.remove(Integer.parseInt(adminInteger) - 1); // Indexes start at 0 while user starts at 1 so subtract 1 for actual index
                              multipleChoiceP1.remove(Integer.parseInt(adminInteger) - 1);
                              signsAnswers.remove(Integer.parseInt(adminInteger) - 1);

                          } else if (userInput.equals("B")) { // Code removes a Rules of the road question. Code below is copied and pasted code from above but modified for second set of questions
                              userInput = "B";
                              System.out.println("The Rules of the Road questions are listed below: ");
                              for (String rulesQuestion : rulesQuestions) {
                                  System.out.println(count + ". " + rulesQuestion);
                                  count += 1;
                              }
                              System.out.println("Type the number corresponding to the question you want to remove");
                              adminInteger = sc.nextLine();
                              while(true) {
                                  if (adminInteger.trim().equalsIgnoreCase("10")) {
                                      break;
                                  } else if (adminInteger.length() == 1 && adminInteger.charAt(0) <= '9' && adminInteger.charAt(0) >= '1') {
                                      break;
                              } else {
                                      System.out.println("Please enter a number from 1-10. Try again!");
                                      adminInteger = sc.nextLine();
                                  }
                              }
                              System.out.println("Question removed!\nCommencing Quiz...");
                              rulesQuestions.remove(Integer.parseInt(adminInteger) - 1);
                              multipleChoiceP2.remove(Integer.parseInt(adminInteger) - 1);
                              rulesAnswers.remove(Integer.parseInt(adminInteger) - 1);

                          } else {
                              System.out.println("Invalid input. Answer with singular letter A or B."); // Error handling
                          }
                      }
                  } else {
                      System.out.println("Invalid input. Please type a singular letter either A or B to remove or add a question! Try again."); // Error handling
                  }
              }
          }

        }
        // Main variables used for calculating total percentage, section percentage, and logic for if user cannot score minimum mark
        int partAScore = 0;
        int questionsAskedA = 0;
        int partBScore = 0;
        int questionsAskedB = 0;
        int remainingQuestions = 0;
        int maxPossible = 0;
        int totalAnswered = 0;
        int totalCorrect = 0;

        // Two arraylists below store the used random indexes and if random number is in the ArrayLists, random number is generated until it's not.
        int randomNumber = 0;
        ArrayList<Integer> used = new ArrayList<>(); // Stores indexes for Part A section
        ArrayList<Integer> used2 = new ArrayList<>(); // Stores indexes for Part B section

        if (startMenu.equals("A") || adminModifiedQuiz || adminFail) {
            System.out.println("Note: This test is comprised of 12 multiple choice questions with two sections (Part A/B). Your answer should only include a single letter.\nFailure to score at least 75% or correctly answer 4 questions per section will lead to test failure.\nBefore you start the test, what is your name?");
            username = sc.nextLine();
            System.out.println("Good luck " + username + "!");

            // Part A
            for(int i = 0; i < 6 && passed; i++) {
                randomNumber = (int)(Math.random() * (9 + 1));
                while(used.contains(randomNumber)) {
                        randomNumber = (int)(Math.random() * (9 + 1));
                }
                used.add(randomNumber); // When unique then add to 'used' ArrayList
                System.out.println((totalAnswered + 1) + ". " + signsQuestions.get(randomNumber) + "\n" + multipleChoiceP1.get(randomNumber)); // Print question with the multiple choice and displays question number.
                userInput = sc.nextLine(); // Gather user answer
                if (userInput.equalsIgnoreCase(signsAnswers.get(randomNumber))) { // Check if correct then increase section score and total score
                    partAScore++;
                    totalCorrect++;
                    System.out.println("Your answer is correct!");
                } else {
                    System.out.println("Your answer is incorrect :(");
                }
                totalAnswered++; // Increase variable to output correct section score if were to end early
                questionsAskedA++; // Increase variable to output correct total score if were to end early

                // Calculation to see if user will at least score 4 questions right per section. If not, then break statement.
                remainingQuestions = 6 - questionsAskedA;
                maxPossible = partAScore + remainingQuestions;
                if (maxPossible < 4) {
                    System.out.println("It is not possible to answer 4 questions correctly for this section at this point. You have failed the quiz.");
                    passed = false; // Ensure Part B doesn't run
                    break;
                }
                // Calculation to see if user will at least score 75% overall because lower than a 9/12 is already failing
                remainingQuestions = 12 - totalAnswered;
                maxPossible = totalCorrect + remainingQuestions;
                if (maxPossible < 9) {
                    System.out.println("Unfortunately, you can no longer reach 75%. You have failed the quiz.");
                    passed = false; // Ensure Part B doesn't run
                    break;
                }
            }
            // Check if passing before printing
            if (passed) {
                System.out.println("You are halfway finished with the quiz! Part B commencing...");
            }
            // Part B. Basically copy and pasted logic from Part A but tweaked for Rules of the Road question and one unique if statement below.
            if (adminAdded && passed) { // Runs if admin added a question, then their question, multiple choice, and answer will appear here
                questionsAskedB++;
                System.out.print(rulesQuestions.get(rulesQuestions.size() - 1) + "\n" + multipleChoiceP2.get(multipleChoiceP2.size() - 1));
                userInput = sc.nextLine();
                if (userInput.equalsIgnoreCase(rulesAnswers.get(rulesAnswers.size() - 1))) {
                    partBScore++;
                    totalCorrect++;
                    System.out.println("Your answer is correct!");
                } else {
                    System.out.println("Your answer is incorrect :(");
                }
                // Again, it's a check if user will score at least 75%
                totalAnswered++;
                remainingQuestions = 12 - totalAnswered;
                maxPossible = totalCorrect + remainingQuestions;
                if (maxPossible < 9) {
                    System.out.println("Unfortunately, you can no longer reach 75%. You have failed the quiz.");
                    passed = false;
                }
            }
            while(questionsAskedB < 6 && passed) { // Admin question is counted and questionsAskedB variable is increased
                randomNumber = (int)(Math.random() * (9 + 1));
                while(used2.contains(randomNumber)) {
                    randomNumber = (int)(Math.random() * (9 + 1) + 1);
                }
                used2.add(randomNumber);
                System.out.println((totalAnswered + 1) + ". " + rulesQuestions.get(randomNumber) + "\n" + multipleChoiceP2.get(randomNumber));
                userInput = sc.nextLine();
                questionsAskedB++;
                if (userInput.equalsIgnoreCase(rulesAnswers.get(randomNumber))) {
                    partBScore++;
                    totalCorrect++;
                    System.out.println("Your answer is correct!");
                } else {
                    System.out.println("Your answer is incorrect :(");
                }
                totalAnswered++;
                remainingQuestions = 6 - questionsAskedB;
                maxPossible = partBScore + remainingQuestions;
                if (maxPossible < 4) {
                    System.out.println("It is not possible to answer 4 questions correctly for this section at this point. You have failed the quiz.");
                    passed = false;
                    break;
                }
                remainingQuestions = 12 - totalAnswered;
                maxPossible = totalCorrect + remainingQuestions;
                if (maxPossible < 9) {
                    System.out.println("Unfortunately, you can no longer reach 75%. You have failed the quiz.");
                    passed = false;
                }
            }
        }

        // Calculations to be displayed to the user including the score in each section, final score and failing/passing at the end of the quiz
        double partAPercent = ((double)partAScore / questionsAskedA) * 100.0;
        partAPercent = Math.round(partAPercent * 100) / 100.0; // Rounds to two decimal places

        double partBPercent = ((double) partBScore / questionsAskedB) * 100.0;
        partBPercent = Math.round(partBPercent * 100) / 100.0;

        double totalPercent = ((double) totalCorrect / totalAnswered) * 100.0;
        totalPercent = Math.round(totalPercent * 100) / 100.0;

        // Displayed final scores and failing/passing percentages
        if (passed) {
            System.out.println("\nCongratulations " + username + " you have passed the quiz!\nScores:\nPart A: " + partAScore + "/6" + " (" + partAPercent + "%)" + "\nPart B: " + partBScore + "/6" + " (" + partBPercent + "%)" + "\nFinal Score: " + totalCorrect + "/12" + " (" + totalPercent + "%)");
        } else {
            System.out.println("Test Results (ended early)\nScores:\nPart A: " + partAScore + "/" + questionsAskedA + " (" + partAPercent + "%)" + "\nPart B: " + partBScore + "/" + questionsAskedB + " (" + partBPercent + "%)" + "\nFinal Score: " + totalCorrect + "/" + totalAnswered + " (" + totalPercent + "%)\nYou have failed, but you can always try again, " + username + "!");
        }
        sc.close();
    }
}

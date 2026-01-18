# ISUfinal
Purpose: 
The program simulates a G1 Road Rules Test with 12 multiple-choice questions divided into Part A and Part B. The program allows the test to be taken normally or for an admin to remove/add a question before taking the quiz. The program will display results, give feedback for the user, handle most user errors, ensures the test ends early if 4 questions are not answered for each section or if 75% overall is unachievable. 

ArrayLists:
Part A - Signs 
As the actual G1 test is divided into Signs/Rules of the Road, there are distinct questions from Part B. 

‘signsQuestions’ stores 10 multiple choice questions
‘multipleChoiceP1’ stores corresponding answers from signsQuestions
‘signsAnswers’ stores the correct answer for each question

Part B - Rules of the Road
‘rulesQuestions’ stores 10 multiple choice questions
‘multipleChoiceP2’ stores corresponding answers from rulesQuestions
‘rulesAnswers’ stores the correct answer for each question

Main Variables:
‘passed’ - tracks whether user can still pass the test. Is a boolean statement to track if termination early is necessary 
‘adminModifiedQuiz and adminAdded’ - are boolean statements that allow the admin to take the quiz after modifying and allow for their question to appear
‘userInput’ - String variable used various times in code to store the question during menus, ensuring correct input is received. 

Error handling:
In menus, users can mistype their answers. Throughout the program, there are loops to prevent the program from crashing from inputting wrong characters/numbers.

Quiz Scoring Variables:

partAScore/partBScore - counts the correct answers for each section 
questionsAskedA/questionsAskedB - counts the questions answered in each section 
totalCorrect and totalAnswered - tracks overall 
reaminingQuestions is the total questions minus the questions asked, which is used for the calculation for termination.
maxPossible - stores the addition of individual section scores and total scores to determine whether 4 questions can be answered per section or if 75%  is achievable

Example (Part A): 
remainingQuestions = 6 - questionsAskedA;

maxPossible = partAScore + remainingQuestions;

if (maxPossible < 4) {

                    System.out.println("It is not possible to answer 4 questions correctly for this section at this point. You have failed the quiz.");

passed = false; break; (ensures Part B doesn't run)
                    
These variables allow for the program to calculate early terminations for the quiz and to store answers to be displayed for failing/passing at the end of quiz.

Random Question Selection:
The ArrayLists for Part A and B store 10 questions. To randomly select 6 from each ArrayList. The program generates a random number between 0-9 to grab the index of the ArrayLists for questions, multiple choice options, and answers. The index is the same throughout the three ArrayLists. 

Admin Modifications:
Admins can add questions by entering their question, multiple choice option, and the character answer, which will appear during the quiz, or remove questions that will no longer appear. 
Additional ArrayLists:
‘used’ - is an ArrayList that stores the questions already presented (in Part A) to the user, so repetitive questions are not given to the user
‘used2’ - is an ArrayList that stores the questions already presented (in Part B) to the user, so repetitive questions are not given to the user

Final Calculations:
For each section and final score, the calculation follows the format below: 
partAPercent = ((double)partAScore / questionsAskedA) * 100.0 (Percentage)
partAPercent = Math.round(partAPercent * 100) / 100.0 (Rounding)

By dividing the score by the total number of questions asked, this variable changes dynamically if you were to fail early.

random-exam-generator Program Version 1.0 02/01/2018

@author Kyler Boyle
@netID kboyle7

General Usage Notes
-------------------

- This program uses a hardcoded dictionary to simply populate strings into the questions
  and answers. While these are not actually questions, it is a proof of concept of the
  program placing strings into the question title and each answer title.

- The program selects and unselects answers so the value of the exam will change when scored.
  It also shuffles answers and questions so on each successive run, questions and answers
  within those questions will change.

- It is possible to redefine a new ExamTester class with a different main function in order
  to run other unit tests.

- To see the shuffling of individual answers, comment out line 70.

To Run the Program
------------------

- To run the program, ensure the dictionary-small.txt and makefile are available in
  the directory. Type 'make' and the program will compile the ExamTester.java class
  that contains the main function. By typing 'java ExamTester' you will run the program.

Extra Methods
-------------

- The program has an extra method in the Answer class defined as isSelected().
  This allows the program to see if an answer is selected in order to check
  for multiple selected answers.

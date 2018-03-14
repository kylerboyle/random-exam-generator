random-exam-generator Program Version 1.2 03/09/2018

@author Kyler Boyle

@netID kboyle7

## General Usage Notes

- This program will print questions from a file called input.txt and will prompt for user input after each
  question. Multiple choice questions should be answered by typing in the corresponding letter and
  short answer questions should be answered accordingly.

- It is possible to redefine a new ExamTester class with a different main function in order
  to run other unit tests.

## To Run the Program

- To run the program, ensure the makefile and all .java files are available in
  the directory. Ensure there is an input file called input.txt with a correctly formatted
  form of the Exam data file as seen in HW3.pdf.
  
- Type 'make' and the program will compile the ExamTester.java class
  that contains the main function. By typing 'java ExamTester' you will run the program.

- Note that the program will generate a file called shuffled.txt that is a correctly formatted
  Exam data file of the same questions and answers as input.txt, but shuffled. It also creates answers.txt
  which is of the Answer data file format outlined in HW3.pdf. This is reloaded into the shuffled exam
  after everything is removed from memory, and graded again for proof of concept.

## Extra Methods

- The program has a couple extra functions to convert between chars and ints. They will not affect
  the user in any way.

- I had to include more saveStudentAnswer and restoreStudentAnswer functions than required. This will not
  impact the functionality of the program.

## Optional Enhancements

- Not 100% of the enhancement is present, but the program can handle an arbitrary number of
  lines of whitespace that is not in the middle of the question. I realize this will not increase
  points, but I wanted it documented.

**Copyright 2018 Kyler Boyle. All Rights Reserved.**

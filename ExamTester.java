import java.io.*;
import java.util.*;


public class ExamTester
{

    public static void main(String args[]) throws FileNotFoundException {
        System.out.println("Kyler Boyle");
        System.out.println("kboyle7");
        File theExam1 = new File("input.txt");
        File shuffledExam = new File("shuffled.txt");
        File studentAnswers = new File("answers.txt");
        PrintWriter shuffle = new PrintWriter(shuffledExam);
        PrintWriter answers = new PrintWriter(studentAnswers);
        Scanner inputExam = new Scanner(theExam1);
        Exam theExam = new Exam(inputExam);

        theExam.getName();

        // reorder the MCAnswers and the questions
        theExam.reorderMCAnswers(-1);
        theExam.reorderQuestions();

        // print the exam and get the value/value for each question
        theExam.print();
        double value = theExam.getValue();
        System.out.println("The value of the exam is: " + value);

        theExam.reportQuestionValues();
        theExam.save(shuffle);
        theExam.saveStudentAnswers(answers);
        shuffle.close();
        answers.close();
        inputExam.close();
        theExam = null;
        
        Scanner shuffleInput = new Scanner(shuffledExam);
        Scanner theAnswers = new Scanner(studentAnswers);

        theExam = new Exam(shuffleInput);
        theExam.restoreStudentAnswers(theAnswers);
        value = theExam.getValue();
        System.out.println("The value of the exam is: " + value);

        theExam.reportQuestionValues();

        shuffleInput.close();
        theAnswers.close();
    }

}

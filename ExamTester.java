import java.io.*;
import java.util.*;


public class ExamTester
{

    public static void main(String args[]) throws FileNotFoundException {
        System.out.println("Kyler Boyle");
        System.out.println("kboyle7");
        //Exam theExam = new Exam("This is my test Exam");
        File text = new File("input.txt");
        File output = new File("test.txt");
        File studentAnswers = new File("answers.txt");
        PrintWriter pw = new PrintWriter(output);
        PrintWriter pw2 = new PrintWriter(studentAnswers);
        Scanner s = new Scanner(text);
        Exam theExam = new Exam(s);

        theExam.getName();

        // reorder the MCAnswers and the questions
        theExam.reorderMCAnswers(-1);
        theExam.reorderQuestions();

        // print the exam and get the value/value for each question
        theExam.print();
        double value = theExam.getValue();
        System.out.println("The value of the exam is: " + value);

        theExam.reportQuestionValues();
        theExam.save(pw);
        theExam.saveStudentAnswers(pw2);
        pw.close();
        pw2.close();
        s.close();
        theExam = null;
        
        s = new Scanner(output);

        theExam = new Exam(s);
        theExam.print();
        value = theExam.getValue();
        System.out.println("The value of the exam is: " + value);

        theExam.reportQuestionValues();
    }

}

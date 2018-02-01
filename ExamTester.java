import java.io.*;
import java.util.*;


public class ExamTester
{

    public static void main(String args[]) {
        Exam theExam = new Exam("This is my test Exam");
        
        Question q = new Question("What is the capital of Illinois?");
        Answer a = new Answer("Springfield");
        Answer b = new Answer("Jello");
        Answer c = new Answer("Kyler");

        theExam.addQuestion(q);
        theExam.getQuestion(0).addAnswer(a);
        theExam.getQuestion(0).addAnswer(b);
        theExam.getQuestion(0).addAnswer(c);
        theExam.print();
        theExam.getQuestion(0).selectAnswer(0);
        a.setValue(100, 0);
        System.out.println(theExam.getValue());
        theExam.getQuestion(0).unselectAnswer(0);
        System.out.println(theExam.getValue());





    }
}

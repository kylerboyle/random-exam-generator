import java.io.*;
import java.util.*;

/* A Java class to represent an exam
    @author Kyler Boyle
    @ACCC kboyle7
*/
class Exam
{
    
    private String title;
    private ArrayList<Question> questions;
    private int numQuestions;

    // Constructor
    public Exam(String text) {
        title = text;
        questions = new ArrayList<Question>(100);
    }

    // add a question to the exam
    public void addQuestion(Question theQuestion) {
        questions.add(theQuestion);
        numQuestions++;
    }

    // print the entire exam
    public void print() {
        System.out.println(title);
        for(int i = 1; i <= numQuestions; i++) {
            questions.get(i-1).print(i);
        }
    }

    // return a reference to question object in given position
    public Question getQuestion(int position) {
        return questions.get(position);
    }

    public void reorderQuestions() {
        Collections.shuffle(questions, new Random());
    }

    public double getValue() {
        int accum = 0;
        for(Question q : questions) {
            accum += q.getValue();
        }
        return accum;
    }

}

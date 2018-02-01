import java.io.*;
import java.util.*;

/* A Java class to represent an exam
    @author Kyler Boyle
    @ACCC kboyle7
*/
class Exam
{
    
    String title;
    ArrayList<Question> questions;
    int numQuestions;

    // Constructor
    public Exam(String text) {
        title = text;
        questions = new ArrayList<Question>();
    }

    // add a question to the exam
    public void addQuestion(Question theQuestion) {
        questions.add(theQuestion);
    }

    // print the entire exam
    public void print() {
        System.out.println(title);
        int i = 1;
        for(Question q : questions) {
            q.print(i++);
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

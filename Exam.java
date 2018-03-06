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

    // print the entire exam
    public void print() {
        System.out.println(title);
        int i = 1;
        for(Question q : questions) {
            System.out.print(i + ". ");
            questions.get(i-1).print();
            if(i-1 < numQuestions) {
                questions.get(i-1).getAnswerFromStudent();
            }
            i++;
        }
    }
    
    // add a question to the exam
    public void addQuestion(Question theQuestion) {
        questions.add(theQuestion);
        numQuestions++;
    }
    /*
    // return a reference to question object in given position
    public Question getQuestion(int position) {
        return questions.get(position);
    }
    */
    public void reorderQuestions() {
        Collections.shuffle(questions, new Random());
    }

    public void reorderMCAnswers(int position) {
        if(!(position < 0)) {
            Question tmp = questions.get(position-1);
            if(tmp instanceof MCQuestion) {
                MCQuestion tmp2 = (MCQuestion)tmp;
                tmp2.reorderAnswers();
            }
        } else {
            for(Question q : questions) {
                if(q instanceof MCQuestion) {
                    MCQuestion tmp = (MCQuestion)q;
                    tmp.reorderAnswers();
                }
            }
        }
    }

    public void getAnswerFromStudent(int position) {
        questions.get(position-1).getAnswerFromStudent();
    }

    public double getValue() {
        double accum = 0;
        int i = 1;
        for(Question q : questions) {
            accum += q.getValue();
        }
        return accum;
    }

    public void reportQuestionValues() {
        int i = 1;
        for(Question q : questions) {
            System.out.println("Question " + i++ + " contributed " +
                                q.getValue() + " points");
        }
    }

}

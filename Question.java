import java.io.*;
import java.util.*;

/* A Java class to represent questions on an exam
    @author Kyler Boyle
    @ACCC kboyle7
*/

class Question
{
    // number of answers per question
    int N = 5;
    
    private String text;
    private Answer answers[];
    private int numSelected;
    private double value;

    // current number of answers
    private int numAnswers;
    

    // Constructor
    public Question(String text) {
        this.text = text;
        answers = new Answer[N];
        numSelected = 0;
        value = 0;
        numAnswers = 0;
    }
    
    // add an answer to the question
    public void addAnswer(Answer theAnswer) {
        answers[numAnswers++] = theAnswer;
    }
    
    // print the question and all answers
    public void print(int position) {
        System.out.println(position + ": " + text);
        for(int i = 0; i < numAnswers; i++) {
            answers[i].print(i);
        }
        System.out.println("\n");
    }

    // select answer at specified position
    public void selectAnswer(int position) {
        if(!answers[position].isSelected() && numSelected > 0) {
            for(int i = 0; i < N; i++) {
                if(answers[i].isSelected()) {
                    answers[i].setSelected();
                    break;
                }
            }
        }
        answers[position].setSelected();
        numSelected++;
    }
    
    // unselect answer at specified position
    public void unselectAnswer(int position) {
        if(answers[position].isSelected()) {
            answers[position].setSelected();
            numSelected--;
        }
    }
    
    // pseudorandomly reorder questions
    public void reorderAnswers() {
        Collections.shuffle(Arrays.asList(answers), new Random());
    }

    // get value of question based on selected/unselected
    public double getValue() {
        double accum = 0.0;
        for(int i = 0; i < 3; i++) {
            accum += answers[i].getValue();
        }

        return accum;
    }

    

}

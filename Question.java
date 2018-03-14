import java.io.*;
import java.util.*;

/* A Java class to represent questions on an exam
    @author Kyler Boyle
    @ACCC kboyle7
*/

abstract class Question
{
    // number of answers per question
    int N = 5;
    
    protected String text;
    protected Answer rightAnswer;
    protected Answer studentAnswer;
    protected double maxValue;

    // Constructor

    protected Question() {
        text = "";
        maxValue = 0.0;
        rightAnswer = null;
        studentAnswer = null;
    }

    protected Question(Scanner s) {
        
    }
    
    protected Question(String text, double maxValue) {
        this.text = text;
        this.maxValue = maxValue;
        rightAnswer = null;
        studentAnswer = null;
    }
    
    // print the question and all answers
    public void print() {
        System.out.println(text + "\n");
    }

    // sets the right answer to the question
    public abstract void setRightAnswer(Answer ans);

    // creates and returns a new Answer object for type of Question
    // overridden in concrete classes
    public abstract Answer getNewAnswer();

    // get the answer to the question from the student
    // and store in the studentAnswer variable
    public abstract void getAnswerFromStudent();
/*
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
*/
    // get value of question based on selected/unselected
    public abstract double getValue();

}

import java.io.*;
import java.util.*;

abstract class MCAnswer extends Answer
{
    protected String text;
    protected boolean selected;
    protected double creditIfSelected;
    
    protected MCAnswer() {
        text = "";
        selected = false;
        creditIfSelected = 0.0;
    }

    protected MCAnswer(String text, double creditIfSelected) {
        this.text = text;
        selected = false;
        this.creditIfSelected = creditIfSelected;
    }

    public MCAnswer(Scanner s) {
        creditIfSelected = s.nextDouble();
        text = s.nextLine();
    }
    
    public void print() {
        System.out.println(text);
    }

    public void setSelected(boolean selected) {
        this.selected = selected;
    }

    protected String getText() {
        return text;
    }

    public void setText(String theText) {
        text = theText;
    }

    public double getCredit(Answer theAnswer) {
        MCAnswer tmp = (MCAnswer)theAnswer;
        if(text.equalsIgnoreCase(tmp.getText())) {
            return creditIfSelected;
        } else {
            return 0.0;
        }
    }

}

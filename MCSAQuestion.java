import java.io.*;
import java.util.*;


class MCSAQuestion extends MCQuestion {

    public MCSAQuestion(String text, double maxValue) {
        super(text, maxValue);
    }

    public MCSAAnswer getNewAnswer() {
        MCSAAnswer theAnswer = new MCSAAnswer();
        return theAnswer;
    }

    public MCSAAnswer getNewAnswer(String text) {
        MCSAAnswer theAnswer = new MCSAAnswer(text);
        return theAnswer;
    }

    public MCSAAnswer getNewAnswer(String text, double value) {
        MCSAAnswer theAnswer = new MCSAAnswer(text, value);
        return theAnswer;
    }

    public int convertCharToInt(char a) {
        return (int)(a - 65);
    }

    // NEEDS ATTENTION
    public void getAnswerFromStudent() {
        Scanner s = new Scanner(System.in);
        String answer = s.nextLine();
        answer = answer.toUpperCase();
        char answerChar = answer.charAt(0);
        MCSAAnswer tmp = (MCSAAnswer)answers.get(convertCharToInt(answerChar));
        tmp.setSelected(true);
        
        /*
        for(Answer a : answers) {
            MCSAAnswer tmp = (MCSAAnswer)a;
            if(tmp.getText().equalsIgnoreCase(answer)) {
                tmp.setSelected(true);
            }
        }
        */
    }

    public double getValue() {
        double accum = 0.0;
        for(Answer a : answers) {
            accum+= a.getCredit(rightAnswer);
        }
        return accum;
    }

    public void setRightAnswer(Answer ans) {
        super.setRightAnswer(ans);
    }

    

}

import java.io.*;
import java.util.*;

class SAQuestion extends Question
{

    public SAQuestion(String text) {
        super(text);
    }

    public SAAnswer getNewAnswer() {
        SAAnswer theAnswer = new SAAnswer();
        return theAnswer;
    }

    public SAAnswer getNewAnswer(String text) {
        SAAnswer theAnswer = new SAAnswer(text);
        return theAnswer;
    }

    public void getAnswerFromStudent() {
        Scanner s = new Scanner(System.in);
        String answer = s.nextLine();
        SAAnswer theAnswer = new SAAnswer(answer);
        studentAnswer = theAnswer;
    }

    public double getValue() {
        return studentAnswer.getCredit(rightAnswer);
    }

    public void setRightAnswer(Answer ans) {
        rightAnswer = ans;
    }
}

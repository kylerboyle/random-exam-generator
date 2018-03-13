import java.io.*;
import java.util.*;

class SAQuestion extends Question
{

    public SAQuestion(String text, double value) {
        super(text, value);
    }

    public SAAnswer getNewAnswer() {
        return new SAAnswer();
    }

    public SAAnswer getNewAnswer(String text) {
        return new SAAnswer(text);
    }

    public void getAnswerFromStudent() {
        Scanner input = ScannerFactory.getScanner();
        studentAnswer = new SAAnswer(input.nextLine());
    }

    public double getValue() {
        if(studentAnswer == null)
            return 0.0;
        return studentAnswer.getCredit(rightAnswer) * maxValue;
    }

    public void setRightAnswer(Answer ans) {
        rightAnswer = ans;
    }
}

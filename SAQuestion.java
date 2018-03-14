import java.io.*;
import java.util.*;

class SAQuestion extends Question
{

    public SAQuestion(String text, double value) {
        super(text, value);
    }

    public SAQuestion(Scanner s) {
        maxValue = s.nextDouble();
        s.nextLine();
        text = s.nextLine();
        rightAnswer = new SAAnswer(s);
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

    public void save(PrintWriter pw) {
        pw.println(maxValue);
        pw.println(text);
        rightAnswer.save(pw);
    }
}

import java.io.*;

class MCSAAnswer extends MCAnswer
{
    public MCSAAnswer() {
        super();
    }
    public MCSAAnswer(String text) {
        super(text);
    }

    public MCSAAnswer(String text, double creditIfSelected) {
        super(text, creditIfSelected);
    }

    // need to update to support partial credit
    public double getCredit(Answer rightAnswer) {
        MCSAAnswer tmp = new MCSAAnswer();
        tmp = (MCSAAnswer)rightAnswer;
        if(text.equalsIgnoreCase(tmp.getText()) && selected) {
            return creditIfSelected;
        } else {
            return 0.0;
        }
    }

}

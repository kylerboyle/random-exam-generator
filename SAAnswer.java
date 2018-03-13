import java.io.*;


class SAAnswer extends Answer
{
    protected String text;
    
    public SAAnswer() {
        text = "";
    }
    public SAAnswer(String text) {
        this.text = text;
    }

    @Override
    public void print() {
        System.out.println("\t" + text);
    }

    protected String getText() {
        return text;
    }

    // need to update to support partial credit
    @Override
    public double getCredit(Answer rightAnswer) {
        SAAnswer tmp = new SAAnswer();
        tmp = (SAAnswer)rightAnswer;
        if(text.equalsIgnoreCase(tmp.getText())) {
            return 1.0;
        } else {
            return 0.0;
      
        }
    }
}

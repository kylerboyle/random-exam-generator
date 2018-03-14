import java.io.*;
import java.util.*;


class MCSAQuestion extends MCQuestion {

    public MCSAQuestion(String text, double maxValue) {
        super(text, maxValue);
    }
     
    // will most likely have a bug where nextDouble is called 
    // burn newline character with another call to nextLine
   public MCSAQuestion(Scanner s) {
        answers = new ArrayList<Answer>(5);
        maxValue = s.nextDouble();
        s.nextLine();
        text = s.nextLine();
        int i = s.nextInt();
        s.nextLine();

        for(int j = 0; j < i; j++) {
            answers.add(new MCSAAnswer(s));
        }
    } 

    public MCSAAnswer getNewAnswer() {
        MCSAAnswer theAnswer = new MCSAAnswer();
        return theAnswer;
    }

    public MCSAAnswer getNewAnswer(String text, double value) {
        MCSAAnswer theAnswer = new MCSAAnswer(text, value);
        return theAnswer;
    }

    public int convertCharToInt(char a) {
        return (int)(a - 65);
    }

    public void getAnswerFromStudent() {
        Scanner input = ScannerFactory.getScanner();
        String answer = input.nextLine();
        answer = answer.toUpperCase();
        char answerChar = answer.charAt(0);
        MCSAAnswer tmp = (MCSAAnswer)answers.get(convertCharToInt(answerChar));
        studentAnswer = tmp; 
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
        return super.getValue((MCAnswer)studentAnswer)*maxValue;
    }

    public void setRightAnswer(Answer ans) {
        super.setRightAnswer(ans);
    }

    

}

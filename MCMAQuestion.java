import java.io.*;
import java.util.*;

class MCMAQuestion extends MCQuestion {

    protected ArrayList<Answer> studentAnswer;
    public double baseCredit;

    public MCMAQuestion(String text, double maxValue, double baseCredit) {
        super(text, maxValue);
        this.baseCredit = baseCredit;
        studentAnswer = new ArrayList<Answer>(5);
    }

    public MCMAQuestion(Scanner s) {
        answers = new ArrayList<Answer>(5);
        studentAnswer = new ArrayList<Answer>(5);
        maxValue = s.nextDouble();
        s.nextLine();
        text = s.nextLine();
        baseCredit = s.nextDouble();
        s.nextLine();
        int i = s.nextInt();
        s.nextLine();
        for(int j = 0; j < i; j++) {
            answers.add(new MCMAAnswer(s));
        }
    }

    public MCMAAnswer getNewAnswer() {
        MCMAAnswer theAnswer = new MCMAAnswer();
        return theAnswer;
    }

    public MCMAAnswer getNewAnswer(String text, double value) {
        MCMAAnswer theAnswer = new MCMAAnswer(text, value);
        return theAnswer;
    }

    public int convertCharToInt(char a) {
        return (int)(a - 65);
    }

    public void getAnswerFromStudent() {
        Scanner input = ScannerFactory.getScanner();
        String tmp = input.nextLine();
        String ans[] = tmp.split(" ");
        for(String a : ans) {
            a = a.toUpperCase();
            MCMAAnswer ansTmp = (MCMAAnswer)answers.get(convertCharToInt(a.charAt(0)));
            studentAnswer.add(ansTmp);
        }
    }

    public double getValue() {
        double accum = 0.0;
        for(Answer a : studentAnswer) {
            accum += super.getValue((MCAnswer)a);
        }
        return (accum + baseCredit) * maxValue; 

    }
    
    @Override
    public void save(PrintWriter pw) {
        pw.println(maxValue);
        pw.println(text);
        pw.println(baseCredit);
        pw.println(answers.size());
        for(Answer a : answers) {
            a.save(pw);
        }
    }

    public void saveStudentAnswer(PrintWriter pw) {
        pw.println(studentAnswer.size());
        for(Answer a : studentAnswer) {
            a.saveStudentAnswer(pw);
        }
    }
   
}


import java.util.*;


abstract class MCQuestion extends Question {
    protected ArrayList<Answer> answers;

    protected MCQuestion() {
        text = "";
        maxValue = 0.0;
    }

    protected MCQuestion(String text, double maxValue) {
        super(text, maxValue);
        answers = new ArrayList<Answer>(5);
    }

    protected MCQuestion(Scanner s) {
        
    }

    public char convertIntToChar(int num) {
        return (char)(num+65);
    }
    
    public void print() {
        super.print();
        int i = 0;
        for(Answer a : answers) {
            System.out.print("\t" + convertIntToChar(i) + ". ");
            a.print();
            i++;
        }
    }

    public void addAnswer(Answer theAnswer) {
        answers.add(theAnswer);
    }

    public void reorderAnswers() {
        Collections.shuffle(answers, new Random());
    }

    public void setRightAnswer(Answer ans) {
        rightAnswer = ans;
    }

    public double getValue(MCAnswer theStudentAnswer) {
        double accum = 0.0;
        for(Answer a : answers) {
            accum += theStudentAnswer.getCredit(a);
        }
        return accum;
    }
    
}

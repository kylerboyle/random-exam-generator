import java.io.*;

/* A Java class to represent answers on an exam
    @author Kyler Boyle
    @ACCC kboyle7
*/

class Answer
{
    private boolean selected;
    private double selectedValue;
    private double unselectedValue;
    private String text;

    public Answer(String text) {
        selected = false;
        selectedValue = 0;
        unselectedValue = 0;
        this.text = text;
    }

    public void print(int position) {
        char pos = 0;
        switch (position) {
            case 0:
                pos = 'A';
            case 1:
                pos = 'B';
            case 2:
                pos = 'C';
            case 3:
                pos = 'D';
            case 4:
                pos = 'E';
            default:
                break;
        }
        System.out.println("\t" + pos + ": " + text);
    }

    public void setSelected() {
        selected = !selected;
    }

    // extra method
    public boolean isSelected() {
        return selected;
    }
    
    // how will unselected answers get value?
    public void setValue(double d1, double d2) {
        selectedValue = d1;
        unselectedValue = d2;
    }

    public double getValue() {
        if(selected) {
            return selectedValue;
        } else {
            return unselectedValue;
        }
    }
}

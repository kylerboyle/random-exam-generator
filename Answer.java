import java.io.*;

/* A Java class to represent answers on an exam
    @author Kyler Boyle
*/

class Answer
{
    private boolean isSelected;
    private double selectedValue;
    private double unselectedValue;
    private String text;

    public Answer(String text) {
        isSelected = false;
        selectedValue = 0;
        unselectedValue = 0;
        this.text = text;
    }

    public void print(int position) {
        System.out.println(text);
    }

    public void setSelected() {
        isSelected = !isSelected;
    }

    public void setValue(double d1, double d2) {
        selectedValue = d1;
        unselectedValue = d2;
    }

    public double getValue() {
        if(isSelected) {
            return selectedValue;
        } else {
            return unselectedValue;
        }
    }
}

import java.io.*;
import java.util.*;


public class ExamTester
{

    public static void main(String args[]) {
        System.out.println("Kyler Boyle");
        System.out.println("kboyle7");
        Exam theExam = new Exam("This is my test Exam");

        int j = -1;
        int i = 0;
        try
        {
            // create a Buffered Reader object instance with a FileReader
            BufferedReader br = new BufferedReader(new FileReader("dictionary-small.txt"));

            // read the first line from the text file
            String fileRead = br.readLine();
            // loop until all lines are read
            while (fileRead != null)
            {
                // use string.split to load a string array with the values from each line of
                // the file, using an endline char as the delimiter
                String[] tokenize = fileRead.split("\n");

                // assume file is made correctly
                // and make a temporary variable for data.
                String tempItem = tokenize[0];

                // creat temporary instance of Inventory object
                // and load with data value
                if(i % 6 == 0) {
                    Question tempQues = new Question(tempItem + "?");
                    theExam.addQuestion(tempQues);
                    j++;
                } else { 
                    Answer tempAns = new Answer(tempItem);
                    tempAns.setValue(-5, 20);
                    theExam.getQuestion(j).addAnswer(tempAns);
                }

                // read next line before looping
                // if end of file reached
                fileRead = br.readLine();
                i++;
            }

            // close file stream
            br.close();
        }

        // handle exceptions
        catch (FileNotFoundException fnfe)
        {
            System.out.println("file not found");
        }

        catch (IOException ioe)
        {
            ioe.printStackTrace();
        }
        
        for(int k = 0; k <= j; k++) {
            theExam.getQuestion(k).reorderAnswers();
        }

        theExam.reorderQuestions();
        theExam.print();

        System.out.println("The value of the exam: " + theExam.getValue());

    }
}

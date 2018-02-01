import java.io.*;
import java.util.*;


public class ExamTester
{

    public static void main(String args[]) {
        Exam theExam = new Exam("This is my test Exam");
        
       //  Question q = new Question("What is the capital of Illinois?");
       //  Answer a = new Answer("Springfield");
       //  Answer b = new Answer("Jello");
       //  Answer c = new Answer("Kyler");

       //  theExam.addQuestion(q);
       //  theExam.getQuestion(0).addAnswer(a);
       //  theExam.getQuestion(0).addAnswer(b);
       //  theExam.getQuestion(0).addAnswer(c);
       //  theExam.print();
       //  theExam.getQuestion(0).selectAnswer(0);
       //  a.setValue(100, 0);
       //  System.out.println(theExam.getValue());
       //  theExam.getQuestion(0).unselectAnswer(0);
       //  System.out.println(theExam.getValue());
       //  theExam.getQuestion(0).reorderAnswers();
       //  theExam.print();

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
                // the file, using a comma as the delimiter
                String[] tokenize = fileRead.split("\n");

                // assume file is made correctly
                // and make temporary variables for the three types of data
                String tempItem = tokenize[0];

                // creat temporary instance of Inventory object
                // and load with three data values
                if(i % 6 == 0) {
                    Question tempQues = new Question(tempItem);
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
        
        for(int k = 0; k < j; k++) {
            theExam.getQuestion(k).reorderAnswers();
        }

        //theExam.reorderQuestions();
        theExam.print();

        System.out.println("The value of the exam: " + theExam.getValue());

    }
}

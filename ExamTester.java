import java.io.*;
import java.util.*;


public class ExamTester
{

    public static void main(String args[]) throws FileNotFoundException {
        System.out.println("Kyler Boyle");
        System.out.println("kboyle7");
        //Exam theExam = new Exam("This is my test Exam");
        File text = new File("input.txt");
        Scanner s = new Scanner(text);
        Exam theExam = new Exam(s);


        /*
        // creating MCSAQuestion
        // shows shuffling of answers and questions
        MCSAQuestion q1 = new MCSAQuestion("This is question 1?", 10);
        MCSAAnswer first = q1.getNewAnswer("First!", 1);
        q1.addAnswer(first);
        MCSAAnswer second = q1.getNewAnswer("Second!", .5);
        q1.addAnswer(second);
        MCSAAnswer third = q1.getNewAnswer("Third!", 0);
        q1.addAnswer(third);
        MCSAAnswer fourth = q1.getNewAnswer("Fourth!", 0);
        q1.addAnswer(fourth);
        MCSAAnswer fifth = q1.getNewAnswer("Fifth!",0);
        q1.addAnswer(fifth);

        theExam.addQuestion(q1);

        // creating SAQuestion
        // shows shuffling of questions
        SAQuestion q2 = new SAQuestion("This is SA question 2?", 20);
        SAAnswer q2Ans = q2.getNewAnswer("Tester charlie");
        
        q2.setRightAnswer(q2Ans);
        theExam.addQuestion(q2);
        
        // creating MCSAQuestion
        MCSAQuestion q3 = new MCSAQuestion("How many eggs are in a carton?", 2);
        MCSAAnswer q3First = q3.getNewAnswer("One", 0);
        q3.addAnswer(q3First);
        MCSAAnswer q3Second = q3.getNewAnswer("Five", 0);
        q3.addAnswer(q3Second);
        MCSAAnswer q3Third = q3.getNewAnswer("Twelve", 1);
        q3.addAnswer(q3Third);
        
        theExam.addQuestion(q3);

        // creating SAQuestion
        SAQuestion q4 = new SAQuestion("How do you spell 'fort'?", 10);
        SAAnswer q4Ans = q4.getNewAnswer("fort");

        q4.setRightAnswer(q4Ans);
        theExam.addQuestion(q4);
        
        // creating MCMAQuestion
        MCMAQuestion q5 = new MCMAQuestion("Choose Yes1 and Yes2!", 10, 2);
        MCMAAnswer q5First = q5.getNewAnswer("Yes1", 4);
        q5.addAnswer(q5First);
        MCMAAnswer q5Second = q5.getNewAnswer("Yes2", 4);
        q5.addAnswer(q5Second);
        MCMAAnswer q5Third = q5.getNewAnswer("Yes3", -1);
        q5.addAnswer(q5Third);

        theExam.addQuestion(q5);
        */

        // reorder the MCAnswers and the questions
        theExam.reorderMCAnswers(-1);
        theExam.reorderQuestions();

        // print the exam and get the value/value for each question
        theExam.print();
        double value = theExam.getValue();
        System.out.println("The value of the exam is: " + value);

        theExam.reportQuestionValues();

        // ***DISREGARD COMMENTED SECTION BELOW***
        
        /*
        try
        {
            BufferedReader br = new BufferedReader(new FileReader("input.txt"));

            Exam theExam = new Exam(br.readLine());
            
            while(fileRead != null)
            {
               if(
            }
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
        */

                 /*
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
                MCSAQuestion tempQues = new MCSAQuestion(tempItem + "?", 10);
                while(fileRead != null) {
                    String[] tokensize = fileRead.split("\n");
                    tempItem = tokenize[0];
                    Answer tempAns = new MCSAAnswer(tempItem);
                    if(i % 3 == 0) {
                        tempQues.setRightAnswer(tempAns);
                    }
                    i++;
                }

                theExam.addQuestion(tempQues);

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
        */
       /* 
        for(int k = 0; k <= j; k++) {
            theExam.getQuestion(k).reorderAnswers();
        }

        theExam.reorderQuestions();
        theExam.print();

        System.out.println("The value of the exam: " + theExam.getValue());
        */

    }
}

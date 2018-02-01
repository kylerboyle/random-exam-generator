# makefile variable for compiler
#
JCC = javac

# typing 'make' will invoke ExamTester target

default: ExamTester.class  Exam.class Question.class Answer.class

ExamTester.class: ExamTester.java
	$(JCC) ExamTester.java

Exam.class: Exam.java
	$(JCC) Exam.java

Question.class: Question.java
	$(JCC) Question.java

Answer.class: Answer.java
	$(JCC) Answer.java

clean:
	$(RM) *.class



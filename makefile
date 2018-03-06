# makefile variable for compiler
#
JCC = javac

# typing 'make' will invoke ExamTester target

default: ExamTester.class Exam.class Question.class MCQuestion.class MCSAQuestion.class SAQuestion.class Answer.class MCAnswer.class MCSAAnswer.class SAAnswer.class

ExamTester.class: ExamTester.java
	$(JCC) ExamTester.java

Exam.class: Exam.java
	$(JCC) Exam.java

Question.class: Question.java
	$(JCC) Question.java

MCQuestion.class: MCQuestion.java
	$(JCC) MCQuestion.java

MCSAQuestion.class: MCSAQuestion.java
	$(JCC) MCSAQuestion.java

SAQuestion.class: SAQuestion.java
	$(JCC) SAQuestion.java

Answer.class: Answer.java
	$(JCC) Answer.java

MCAnswer.class: MCAnswer.java
	$(JCC) MCAnswer.java

MCSAAnswer.class: MCSAAnswer.java
	$(JCC) MCSAAnswer.java

SAAnswer.class: SAAnswer.java
	$(JCC) SAAnswer.java

clean:
	$(RM) *.class



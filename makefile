# makefile variable for compiler
#
JCC = javac

# typing 'make' will invoke ExamTester target

default: ExamTester.class Exam.class Question.class MCQuestion.class MCSAQuestion.class MCMAQuestion.class SAQuestion.class Answer.class MCAnswer.class MCSAAnswer.class MCMAAnswer.class SAAnswer.class ScannerFactory.class

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

MCMAQuestion.class: MCMAQuestion.java
	$(JCC) MCMAQuestion.java

SAQuestion.class: SAQuestion.java
	$(JCC) SAQuestion.java

Answer.class: Answer.java
	$(JCC) Answer.java

MCAnswer.class: MCAnswer.java
	$(JCC) MCAnswer.java

MCSAAnswer.class: MCSAAnswer.java
	$(JCC) MCSAAnswer.java

MCMAAnswer.class: MCMAAnswer.java
	$(JCC) MCMAAnswer.java

SAAnswer.class: SAAnswer.java
	$(JCC) SAAnswer.java

ScannerFactory.class: ScannerFactory.java
	$(JCC) ScannerFactory.java

clean:
	$(RM) *.class



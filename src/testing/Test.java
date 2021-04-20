package testing;

import java.util.ArrayList;
import java.util.Arrays;

import system.quiz.Question;
import system.quiz.QuestionBank;
import system.quiz.Quiz;
import system.quiz.QuizSystem;
import system.quiz.Student;

public class Test {
	
	public static void main(String[] args) {
		QuizSystem.getInstance().registerUser("Ram");
		QuizSystem.getInstance().registerUser("Sita");
		
		Question ques1 = new Question(1, 2, 3, 4, 1);
		Question ques2 = new Question(1, 2, 3, 4, 2);
		Question ques3 = new Question(1, 2, 3, 4, 4);
		Question ques4 = new Question(1, 2, 3, 4, 1);
		Question ques5 = new Question(1, 2, 3, 4, 2);
		QuestionBank.getInstance().addQuestion(ques1);
		QuestionBank.getInstance().addQuestion(ques2);
		QuestionBank.getInstance().addQuestion(ques3);
		QuestionBank.getInstance().addQuestion(ques4);
		QuestionBank.getInstance().addQuestion(ques5);
		
		Quiz quiz = Quiz.getInstance().createQuiz(3);
		System.out.println("Quiz created --"+ quiz);

		QuizSystem.getInstance().addQuiz(quiz);
		Student studentObj = new Student("Ram");
		ArrayList<Integer> listOfAnswers = new ArrayList<>(Arrays.asList(1,2,4));
		studentObj.doSubmission(0, listOfAnswers); //quizId, listOfAnswers
		System.out.println("Score "+studentObj.getScore(0));
	}

}

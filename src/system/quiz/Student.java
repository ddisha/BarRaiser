package system.quiz;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Student extends User {

	private Map<Integer, Integer> scoreBoard;

	public Student(String userName) {
		super(userName);
		this.scoreBoard = new HashMap<>();
	}

	public void doSubmission(int quizId, ArrayList<Integer> listOfAnswers) {
		int score = 0;
		Quiz quiz = QuizSystem.getInstance().getQuizes().get(quizId);
		for (int i = 0; i < listOfAnswers.size(); i++) {
			if (listOfAnswers.get(i) == quiz.getQuestions().get(i).getCorrectOption())
				score++;
		}
		scoreBoard.put(quizId, score);
	}

	public int getScore(int quizId) {
		return scoreBoard.get(quizId);
	}

}

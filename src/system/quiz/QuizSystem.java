package system.quiz;

import java.util.ArrayList;

public class QuizSystem {
	public static QuizSystem quizSysObj = null;
	private ArrayList<Quiz> quizes = new ArrayList<>();
	
	private QuizSystem() {

	}

	public static QuizSystem getInstance() {
		if (quizSysObj == null)
			quizSysObj = new QuizSystem();
		return quizSysObj;
	}

	
	public ArrayList<Quiz> getQuizes() {
		return quizes;
	}

	public void setQuizes(ArrayList<Quiz> quizes) {
		this.quizes = quizes;
	}

	public void registerUser(String userName) {
		
	}
	
	public void addQuiz(Quiz quiz)
	{
		quizes.add(quiz);
	}

	@Override
	public String toString() {
		return "QuizSystem [quizes=" + quizes + "]";
	}
	
	
}

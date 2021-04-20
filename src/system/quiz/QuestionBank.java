package system.quiz;

import java.util.ArrayList;

public class QuestionBank {
	public static QuestionBank INSTANCE = null;
	private ArrayList<Question> questions = new ArrayList<Question>();

	private QuestionBank() {
		
	}

	public static QuestionBank getInstance()
	{
		if(INSTANCE == null)
			INSTANCE = new QuestionBank();
		return INSTANCE;
	}

	public QuestionBank(ArrayList<Question> questions) {
		this.questions = new ArrayList<>();
	}

	public ArrayList<Question> getQuestions() {
		return questions;
	}

	public void setQuestions(ArrayList<Question> questions) {
		this.questions = questions;
	}

	public void addQuestion(Question ques) {
		questions.add(ques);
	}

	@Override
	public String toString() {
		return "QuestionBank [questions=" + questions + "]";
	}

}

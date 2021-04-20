package system.quiz;

import java.util.ArrayList;

public class Quiz {
	private ArrayList<Question> questions;
	private int quizId;
	private int counterId = 0;
	private static Quiz INSTANCE = null;

	public Quiz() {
		this.questions = new ArrayList<>();
		this.quizId = counterId;
		counterId++;
	}

	public static Quiz getInstance()
	{
		if(INSTANCE == null)
			INSTANCE = new Quiz();
		return INSTANCE;
	}
	public ArrayList<Question> getQuestions() {
		return questions;
	}

	public void setQuestions(ArrayList<Question> questions) {
		this.questions = questions;
	}

	public int getQuizId() {
		return quizId;
	}

	public void setQuizId(int quizId) {
		this.quizId = quizId;
	}

	public Quiz createQuiz(int numberOfQues) {
		if (numberOfQues > QuestionBank.getInstance().getQuestions().size())
			throw new RuntimeException("Quiz can't be created");
		for (int i = 0; i < numberOfQues; i++) {
			int questionNo = (int) ((Math.random() * (QuestionBank.getInstance().getQuestions().size() - 1)) + 0);
			questions.add(QuestionBank.getInstance().getQuestions().get(questionNo));
		}
		return this;
	}
	
	public void doSubmssion(User userName, int quizId)
	{
		Quiz quiz = QuizSystem.getInstance().getQuizes().get(quizId);
	}

	@Override
	public String toString() {
		return "Quiz [questions=" + questions + ", quizId=" + quizId + ", counterId=" + counterId + "]";
	}
	
}

package system.quiz;

import java.util.ArrayList;

public class ScoreBoard {

	private Quiz quiz;
	private ArrayList<Student> students;
	
	public ScoreBoard(Quiz quiz, ArrayList<Student> students) {
		super();
		this.quiz = quiz;
		this.students = new ArrayList<>();
	}

	public Quiz getQuiz() {
		return quiz;
	}

	public void setQuiz(Quiz quiz) {
		this.quiz = quiz;
	}

	public ArrayList<Student> getStudents() {
		return students;
	}

	public void setStudents(ArrayList<Student> students) {
		this.students = students;
	}
	
	
}

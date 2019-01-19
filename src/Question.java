import java.util.ArrayList;

public class Question extends Answer {
	public String longQuestion;
	public ArrayList<Answer> answer;
	public String data;

	public Question(String longQuestion, String data) {
		this.longQuestion = longQuestion;
		this.data = data;
		answer = new ArrayList<Answer>();
	}

	public void addAnswer(String a, int w) {
		Answer ans = new Answer(a, w);
		answer.add(ans);
	}

}

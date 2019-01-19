
public class Question {
	public String q; // Question
	public String a; // Answer
//	public int answerType;
	
	public Question (String question) {
		q = question;
		a = "";
	}
	
	public void setAnswer (String answer) {
		a = answer;
	}
}

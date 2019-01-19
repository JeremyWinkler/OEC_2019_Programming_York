import java.util.ArrayList;

public class Question extends Answer {
	public String question;
	 public ArrayList <Answer> answer;  
	
	 public Question()
		{
			question="";
			answer  = new ArrayList <Answer>();
		}

		
	 public void addAnswer( String a, int w)
	 {
		 Answer ans = new Answer(a,w);
		 answer.add(ans); 
	 }
	

}

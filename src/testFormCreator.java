
import static org.junit.Assert.fail;

import java.io.IOException;
import java.util.ArrayList;

import org.junit.jupiter.api.Test;

public class testFormCreator {

	@Test
	public void testConstructor() {
		try {
			FormCreator test = new FormCreator();
		} catch (IOException e) {
			fail();
		}
	}
	
	@Test
	public void testPrint() {
		Question q1 = new Question("Does this work?", "Working", false);
		q1.addAnswer("Ya", 1);
		q1.addAnswer("No", 0);
		
		FormCreator test = null;
		try {
			test = new FormCreator();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			fail();
		}
		
		ArrayList<Question> questions = new ArrayList<Question>();
		questions.add(q1);
		
		try {
			test.printForm(questions);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			fail();
		}
	}
}

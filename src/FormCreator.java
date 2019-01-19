import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class FormCreator {

	// PrintWriter out;
	FileWriter write;
	PrintWriter print;
    String fileContents = "";

    public FormCreator() throws IOException {
    	File file = new File("Form.html");
    	
    }
    
//	public FormCreator() throws IOException {
//		try {
//			// Whatever the file path is.
//			form = new File("./Form.html");
//			outputStream = new FileOutputStream(form);
//			outputStreamWriter = new OutputStreamWriter(outputStream);
//			w = new BufferedWriter(outputStreamWriter);
//
//		} catch (IOException e) {
//			System.err.println("Problem writing to the file statsTest.txt");
//		}
//		// out = new PrintWriter("./Form.txt", "UTF-8");
//	}

	private void addQuestion(Question question) throws IOException {

		fileContents += question.longQuestion + "<br>\n";
		String inputType = (question.multipleChoices) ? "checkbox" : "radio";

		for (Answer ans : question.answer) {
			fileContents += "<input type=\"" + inputType + "\" name=\"" + question.data + "\" value=\"" + ans.answer + "\"> "
					+ ans.answer + "<br>\n";
		}
	}

	public void printForm(ArrayList<Question> questions) throws IOException {

		fileContents += "<!DOCTYPE html>\n" + "<html lang=\"en\">\n" + "\n" + "<head>\n" + "    <meta charset=\"UTF-8\">\n"
				+ "    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n"
				+ "    <meta http-equiv=\"X-UA-Compatible\" content=\"ie=edge\">\n"
				+ "    <title>Self Patient Registration Module</title>\n" + "</head>\n" + "\n" + "<body>\n"
				+ "    <form action=\"\">\n" + "        First name:<br>\n"
				+ "        <input type=\"text\" name=\"firstname\">\n" + "        <br>\n" + "        Last name:<br>\n"
				+ "        <input type=\"text\" name=\"lastname\">\n" + "        <br>\n"
				+ "        Date of Birth:<br>\n"
				+ "        <input type=\"date\" id=\"date-of-birth\" name=\"date-of-birth\" value=\"2018-07-22\" min=\"1918-01-01\" max=\"2018-12-31\">\n"
				+ "        <br>\n" + "        Street Address:<br>\n"
				+ "        <input type=\"text\" name=\"lastname\">\n" + "        <br>\n" + "        City:<br>\n"
				+ "        <input type=\"text\" name=\"lastname\">\n" + "        <br>\n" + "        State:<br>\n"
				+ "        <input type=\"text\" name=\"lastname\">\n" + "        <br>\n" + "        Postal Code:<br>\n"
				+ "        <input type=\"text\" name=\"lastname\">\n" + "        <br>\n"
				+ "        Health Card Number:<br>\n" + "        <input type=\"text\" name=\"lastname\">\n"
				+ "        <br>\n" + "        Cell Phone:<br>\n" + "        <input type=\"text\" name=\"lastname\">\n"
				+ "        <br>\n" + "        Email Address:<br>\n"
				+ "        <input type=\"text\" name=\"lastname\">\n" + "        <br>\n" + "        Race:<br>\n"
				+ "        <input type=\"text\" name=\"lastname\">\n" + "        <br>\n"
				+ "        Family Doctor Name:<br>\n" + "        <input type=\"text\" name=\"lastname\">\n"
				+ "        <br>\n" + "        Family Doctor City:<br>\n"
				+ "        <input type=\"text\" name=\"lastname\">\n" + "        <br>\n" + "\n";
			

		for (Question q : questions)
			addQuestion(q);
		
		fileContents +=  "        <input type=\"submit\" value=\"Submit\">\n";
		fileContents += "</form>" + "</body>\n" + "\n" + "</html>";
		write = new FileWriter("Form.html", false);
    	print = new PrintWriter(write);
		print.print(fileContents);
		print.close();
	}

}

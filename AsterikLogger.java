package codingAssignment;

public class AsterikLogger implements Logger {

	@Override
	public void log(String log) {
		System.out.println("***" + log + "***" + "\n");
	}
 
	@Override
	public void error(String error) {
		System.out.println("*************************"  + "\n" +  "***" + "Error: " + error + "***" + "\n" + "*************************" + "\n");
	}

}

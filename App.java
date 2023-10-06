package codingAssignment;


public class App {
	
	public static void main(String[] args) {
		
		AsterikLogger logger = new AsterikLogger();
		SpacedLogger logger1 = new SpacedLogger();
		
		logger.log("Welcome");
		
		logger.error("Oops, error!");
		logger1.log("Welcome");
		logger1.error("Oops, error!");
		
		setLogger(new AsterikLogger());
		setLogger(new SpacedLogger());
		
		
		
	}

	private static void setLogger(SpacedLogger spacedLogger) {
		// TODO Auto-generated method stub
		
	}

	private static void setLogger(AsterikLogger asterikLogger) {
		// TODO Auto-generated method stub
		
	}

}

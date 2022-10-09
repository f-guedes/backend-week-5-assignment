package assignment;

public class App {

	public static void main(String[] args) {
		Logger AsteriskLogger = new AsteriskLogger();
		Logger SpacedLogger = new SpacedLogger();
		
		AsteriskLogger.log("Hello");
		AsteriskLogger.error("Attention");
		
		SpacedLogger.log("Hello");
		SpacedLogger.error("Attention");
	}

}

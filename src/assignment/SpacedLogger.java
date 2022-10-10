package assignment;

public class SpacedLogger implements Logger{
	
	@Override
	public void log(String log) {
		StringBuilder newString = new StringBuilder();
		for (int i = 0; i < log.length(); i++) {
			newString.append(log.charAt(i) + " ");
		}
		System.out.println(newString.toString());
	}

	@Override
	public void error(String error) {
		StringBuilder newString = new StringBuilder();;
		for (int i = 0; i < error.length(); i++) {
			newString.append(error.charAt(i) + " ");
			}
		System.out.println("ERROR: " + newString);
	}

	
}

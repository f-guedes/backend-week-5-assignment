package assignment;

public class SpacedLogger implements Logger{
	
	@Override
	public void log(String log) {
		String newString = "";
		for (int i = 0; i < log.length(); i++) {
			newString += log.charAt(i) + " ";
			}
		System.out.println(newString);
		}

	@Override
	public void error(String error) {
		String newString = "";
		for (int i = 0; i < error.length(); i++) {
			newString += error.charAt(i) + " ";
			}
		System.out.println("ERROR: " + newString);
	}

	
}

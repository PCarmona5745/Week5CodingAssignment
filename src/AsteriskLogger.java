
public class AsteriskLogger implements Logger {

	@Override
	public void Log(String s) {
		System.out.println("***" + s + "***");
	}

	@Override
	public void Error(String s) {
		
		//creates the line of text that will go in the middle of the box
		//this string allows the "width" of the box to be measured
		String middleString = "***" + "ERROR: " + s + "***";
		String sandwichString = "";
		
		//makes a string of asterisks as long as the middle string
		//this allows the box to be dynamically sized depending on the input string
		for(int i=0; i < middleString.length(); i++) {
			sandwichString += "*";
		}
		
		//print the box out!
		System.out.println(sandwichString);
		System.out.println(middleString);
		System.out.println(sandwichString);
	}

}


public class SpacedLogger implements Logger {

	@Override
	public void Log(String s) {
		
		//inserts spaces between all letters of specified string
		s = insertStuff(s, " ");
		
		//prints modified spring
		System.out.println(s);
	}

	@Override
	public void Error(String s) {
		
		//modifies the string with spaces between each letter
		s = insertStuff(s," ");
		
		//prints modified string with Error
		System.out.println("ERROR: " + s);
	}
	
	
	//since this code was used twice, I made it into a method
	//Method adds a specified string in between each letter of another specified string
	private String insertStuff(String s, String stuff) {
		
		//loops through each letter of the string (which is now continuously changing length
		for (int i = 0; i < s.length(); i++) {

			if (i == s.length() - 1) {
				// ensures code doesn't add a space at the end of the word, only in between
				//completely exits the loop
				break;
			}
			
			//if the substring of the letter at index i and the letter right next to it
			//has a space, then the loop will just skip to the next iteration
			if (s.substring(i, i + 2).contains(stuff)) {
				continue;
			} else if (s.charAt(i) != ' ') {
				//if the first letter of the substring is not a space, then add a space
				s = s.substring(0, i + 1) + stuff + s.substring(i + 1);
			} else {
				continue;
			}

		}
		//returns the string modified
		return s;
	}

}

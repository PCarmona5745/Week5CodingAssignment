
public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//create the logger objects!
		Logger as = new AsteriskLogger();
		Logger sp = new SpacedLogger();

		String s = "Hello";
		System.out.println("Testing asterisk Log with word: " + s);
		as.Log(s);
		System.out.println("Testing asterisk Error with word: " + s);
		as.Error(s);
		System.out.println("Testing spaced Log with word: " + s);
		sp.Log(s);
		System.out.println("Testing spaced Error with word: " + s);
		sp.Error(s);
		
		s = "Macaroni";
		System.out.println("Testing asterisk Log with word: " + s);
		as.Log(s);
		System.out.println("Testing asterisk Error with word: " + s);
		as.Error(s);
		System.out.println("Testing spaced Log with word: " + s);
		sp.Log(s);
		System.out.println("Testing spaced Error with word: " + s);
		sp.Error(s);
		
		s = "supercalifragilisticexpialidocious";
		System.out.println("Testing asterisk Log with word: " + s);
		as.Log(s);
		System.out.println("Testing asterisk Error with word: " + s);
		as.Error(s);
		System.out.println("Testing spaced Log with word: " + s);
		sp.Log(s);
		System.out.println("Testing spaced Error with word: " + s);
		sp.Error(s);
	}

}

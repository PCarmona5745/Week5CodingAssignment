
public interface Logger {
	//these methods don't need code bodies as the classes that implement the interface will 
	//define the code functionality
	
	
	//based on description of code assignment, these should be public 
	//since the App class will need to access these methods
	public void Log(String s);
	
	public void Error(String s);

}

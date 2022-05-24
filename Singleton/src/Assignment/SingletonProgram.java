package Assignment;


public class SingletonProgram {

	private static SingletonProgram single_instance = null;
	  
    public String str;
  
    private SingletonProgram()
    {
        this.str = "Hello Singleton world";
    }
  
    public static SingletonProgram getInstance()
    {
        if (single_instance == null)
            single_instance = new SingletonProgram();
  
        return single_instance;
    }
}
  

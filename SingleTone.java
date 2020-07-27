package pack1;

public class SingleTone {

	private static SingleTone INSTANCE ;
	private SingleTone()
	{
		
	}
	public static SingleTone getInstance()
	{
		if(INSTANCE == null) {
			synchronized(SingleTone.class) {
				if(INSTANCE == null) {
					INSTANCE = new SingleTone();
					System.out.println("Instance created");
				}
			}
		}
		return INSTANCE;
	}
	
}

package singleton;

public class StaticBlockSingleton {

	 private static StaticBlockSingleton instance;
	    
	    private StaticBlockSingleton(){}
	    
	    //static block initialization for exception handling
	    static{
	        try{
	            instance = new StaticBlockSingleton();
	            System.out.println("Instance Created");
	        }catch(Exception e){
	            throw new RuntimeException("Exception occured in creating singleton instance");
	        }
	    }
	    
	    public static StaticBlockSingleton getInstance(){
	        return instance;
	    }
	    
	    public void function(){
	    	System.out.println(instance.toString());
	    	System.out.println("The method of singleton class");
	    }
}

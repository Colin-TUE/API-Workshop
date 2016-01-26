package nl.tu.api.apiworkshopteam2;

/**
 * @author CLambrec
 * @version 1.0
 * @created 25-Jan-2016 12:47:41
 */
public abstract class Gate {

	public Gate(){
            
	}

	public void finalize() throws Throwable {

	}
	public abstract double evaluate();

	/**
	 * 
	 * @param value
	 */
	protected void set(double value){

	}
}//end Gate
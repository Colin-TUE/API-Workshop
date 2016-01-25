package nl.tu.api.apiworkshopteam2;

/**
 * @author CLambrec
 * @version 1.0
 * @created 25-Jan-2016 12:47:41
 */
public abstract class CircuitTarget {

	public CircuitTarget(){

	}

	public void finalize() throws Throwable {

	}
	public abstract boolean evaluate();

	/**
	 * 
	 * @param value
	 * @param name
	 */
	public abstract void setInput(Boolean value, String name) throws IllegalArgumentException;
}//end CircuitTarget
package nl.tu.api.apiworkshopteam2;

/**
 * @author CLambrec
 * @version 1.0
 * @created 25-Jan-2016 12:47:41
 */
abstract class Gate {

	public Gate(){

	}

	public void finalize() throws Throwable {

	}
	public abstract boolean evaluate();

	/**
	 * 
	 * @param value
	 */
	public void set(Boolean value){

	}
}//end Gate
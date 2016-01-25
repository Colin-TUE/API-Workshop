

/**
 * @author CLambrec
 * @version 1.0
 * @created 25-Jan-2016 12:47:41
 */
public class CircuitAdapter extends CircuitTarget {

	private Circuit adaptee;

	public CircuitAdapter(){

	}

	public void finalize() throws Throwable {
		super.finalize();
	}
	public boolean evaluate(){
		return false;
	}

	/**
	 * 
	 * @param value
	 * @param name
	 */
	public setInput(Boolean value, String name){

	}
}//end CircuitAdapter
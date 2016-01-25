package nl.tu.api.apiworkshopteam2;

/**
 * @author CLambrec
 * @version 1.0
 * @created 25-Jan-2016 12:47:41
 */
public class CircuitAdapter extends CircuitTarget {

	private Circuit adaptee;

	public CircuitAdapter(Circuit circuit){
            this.adaptee = circuit;
	}

	public void finalize() throws Throwable {
		super.finalize();
	}
	public boolean evaluate(){
		return adaptee.evaluate();
	}

	/**
	 * Set the input of the variable with name {@code name} to value {@code value}
	 * @param value
	 * @param name
         * @throws IllegalArgumentException when the variable referenced is not present in the circuit. 
	 */
	public void setInput(Boolean value, String name) throws IllegalArgumentException {
            adaptee.setInput(value, name);
	}
}//end CircuitAdapter
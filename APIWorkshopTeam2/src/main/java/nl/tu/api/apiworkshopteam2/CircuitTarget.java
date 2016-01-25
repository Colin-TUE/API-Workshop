package nl.tu.api.apiworkshopteam2;

/**
 * @author CLambrec
 * @version 1.0
 * @created 25-Jan-2016 12:47:41
 */
public abstract interface CircuitTarget {
        
        /**
         * Evaluates the circuit starting with the gate at gate1
         * @return true if the circuit results 
         */
	public abstract boolean evaluate();

	/**
	 * 
	 * @param value
	 * @param name
	 */
	public abstract void setInput(Boolean value, String name) throws IllegalArgumentException;
}//end CircuitTarget
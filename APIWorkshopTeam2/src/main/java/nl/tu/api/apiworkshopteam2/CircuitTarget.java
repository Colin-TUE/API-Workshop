package nl.tu.api.apiworkshopteam2;

/**
 * @author CLambrec
 * @version 1.0
 * @created 25-Jan-2016 12:47:41
 */
public abstract interface CircuitTarget {

    /**
     * Evaluates the circuit starting with the gate at gate1
     *
     * @return true if the circuit results in true according to the inputs,
     * false otherwise
     */
    public abstract boolean evaluate();
    
    /**
     * Evaluates the circuit starting with the gate at gate1
     *
     * @return the double outcome of the circuit
     */
    public abstract double evaluateD();

    /**
     * Sets the input referenced by the name {@code name} to the vlaue {@value}
     *
     * @param value
     * @param name
     */
    public abstract void setInput(Boolean value, String name) throws IllegalArgumentException;

    /**
     * Sets the input referenced by the name {@code name} to the value {@value}
     *
     * @param value
     * @param name
     * @throws IllegalArgumentException when the name of the variable is not
     * referencing a name or when the value is out of rang [0.0, 1.0]
     */
    public abstract void setInput(double value, String name) throws IllegalArgumentException;
}//end CircuitTarget

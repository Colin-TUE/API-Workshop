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
     * Sets the input referenced by the name {@code name} to the vlaue {@value}
     *
     * @param value
     * @param name
     */
    public abstract void setInput(Boolean value, String name) throws IllegalArgumentException;
}//end CircuitTarget

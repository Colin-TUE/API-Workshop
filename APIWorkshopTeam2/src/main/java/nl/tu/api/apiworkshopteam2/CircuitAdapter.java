package nl.tu.api.apiworkshopteam2;

/**
 * @author CLambrec
 * @version 1.0
 * @created 25-Jan-2016 12:47:41
 */
public class CircuitAdapter implements CircuitTarget {

    private Circuit adaptee;

    public CircuitAdapter(Circuit circuit) {
        this.adaptee = circuit;
    }

    public boolean evaluate() {
        return (Math.round(adaptee.evaluate()) == 0) ? false : true;
    }
    
    public double evaluateD() {
        return adaptee.evaluate();
    }

    /**
     * Set the input of the variable with name {@code name} to value
     * {@code value}
     *
     * @param value
     * @param name
     * @throws IllegalArgumentException when the variable referenced is not
     * present in the circuit.
     */
    public void setInput(Boolean value, String name) throws IllegalArgumentException {
        adaptee.setInput((value == true) ? 1.0 : 0.0, name);
    }

    /**
     * Set the input of the variable with name {@code name} to value
     * {@code value}
     *
     * @param value
     * @param name
     * @throws IllegalArgumentException when the variable referenced is not
     * present in the circuit or when the value is higher than 1.0 or below 0.0.
     */
    public void setInput(double value, String name) throws IllegalArgumentException {
        adaptee.setInput(value, name);
    }
}//end CircuitAdapter

package nl.tu.api.apiworkshopteam2;

/**
 * @author CLambrec
 * @version 1.0
 * @created 25-Jan-2016 12:47:41
 */
public interface AbstractFactory {

    /**
     * Initialazes an emtpy circuit for adding gates.
     */
    public void initiliazeEmptyCircuit();

    /**
     * Creates the circuit that you specified using the other functions. From
     * this point onwards no modifications are allowed.
     */
    public CircuitAdapter createCicruit();

    /**
     * Add the gate on top of gate1 and gate2 and outputs it at gate3
     *
     * @param specification the string representation of the specific gate
     * ("and", "or" or "not" for the &&, || or ! operation respectively)
     */
    public void addGate(String specification);

    /**
     * Adds an input gate to gate3, if it was referenced before it will use that
     * one
     *
     * @param name The name referenced for the input
     */
    public void addInput(String name);

    /**
     * Moves the gate3 to the gate depicted at the param
     *
     * @param i The gate number to move gate3 to
     */
    public void moveGate(int i);

    /**
     * Register you custom operation to the API.
     *
     * @param op The operation and its evaluation
     * @param call The specific string to call it from using the Factory method
     * for addGate()
     * @throws IllegalArgumetnException if there is an operation with the call
     * {@code call} already, or {@code op} was not of the type Gate, or {@code
     * op} was null
     */
    public void addCustomOperation(Class op, String call) throws IllegalArgumentException;
}//end AbstractFactory

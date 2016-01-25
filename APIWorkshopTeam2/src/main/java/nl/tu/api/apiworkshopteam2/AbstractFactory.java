package nl.tu.api.apiworkshopteam2;

/**
 * @author CLambrec
 * @version 1.0
 * @created 25-Jan-2016 12:47:41
 */
public interface AbstractFactory {

    /*public AbstractFactory(){

     }

     public void finalize() throws Throwable {

     }*/
    /**
     * Creates the circuit that you specified using the other functions. From
     * this point onwards no modifications are allowed.
     */
    public CircuitAdapter createCicruit();

    /**
     * Add the gate on top of gate1 and gate2 and outputs it at gate3
     *
     * @param specification the string representation of the specific gate
     * ("and", "or" or "not")
     */
    public void addGate(String specification);

    /**
     * Adds an input gate to gate 3
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
}//end AbstractFactory

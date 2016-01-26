package nl.tu.api.apiworkshopteam2;

import java.util.HashMap;

/**
 * @author CLambrec
 * @version 1.0
 * @created 25-Jan-2016 12:47:41
 */
public class ConcreteFactory implements AbstractFactory {

    private Circuit cirInstance;
    private boolean created = false;

    public ConcreteFactory() {
        
    }

    public void finalize() throws Throwable {
        super.finalize();
    }
    
    public void initiliazeEmptyCircuit() {
        cirInstance = new Circuit(new HashMap<String, Gate>());
    }

    /**
     * Creates the actual circuit 
     * @param specification
     */
    public CircuitAdapter createCicruit() {
        this.created = true;
        return new CircuitAdapter(this.cirInstance);
    }

    public void addGate(String specification) {
        if (this.created) {
            return;
        }
        switch (specification) {
            case "and":
                this.cirInstance.createAnd();
                break;

            case "or":
                this.cirInstance.createOR();
                break;

            case "not":
                this.cirInstance.createNOT();
                break;
        }
    }

    public void addInput(String name) {
        if (this.created) {
            return;
        }
        this.cirInstance.createInput(name);
    }

    public void moveGate(int i) {
        if (this.created) {
            return;
        }
        this.cirInstance.reAssign(i);
    }
   

}//end ConcreteFactory

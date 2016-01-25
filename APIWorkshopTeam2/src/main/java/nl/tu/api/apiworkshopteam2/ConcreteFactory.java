package nl.tu.api.apiworkshopteam2;

import java.util.HashMap;

/**
 * @author CLambrec
 * @version 1.0
 * @created 25-Jan-2016 12:47:41
 */
class ConcreteFactory implements AbstractFactory {

    private Circuit cirInstance;
    private boolean created = false;

    public ConcreteFactory() {
        cirInstance = new Circuit(new HashMap<String, Gate>());
    }

    public void finalize() throws Throwable {
        super.finalize();
    }

    /**
     *
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
            case "add":

                break;

            case "or":

                break;

            case "not":

                break;
        }
    }

    public void addInput(String name) {
        if (this.created) {
            return;
        }
    }

    public void moveGate(int i) {
        if (this.created) {
            return;
        }

    }

}//end ConcreteFactory

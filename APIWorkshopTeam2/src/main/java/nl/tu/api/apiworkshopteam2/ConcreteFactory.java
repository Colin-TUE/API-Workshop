package nl.tu.api.apiworkshopteam2;

import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author CLambrec
 * @version 1.0
 * @created 25-Jan-2016 12:47:41
 */
public class ConcreteFactory implements AbstractFactory {

    private Circuit cirInstance;
    private boolean created = false;
    private Map<String, Class> operations;

    public ConcreteFactory() {
        this.operations = new HashMap<String, Class>();
    }

    public void finalize() throws Throwable {
        super.finalize();
    }

    public void initiliazeEmptyCircuit() {
        this.created = false;
        cirInstance = new Circuit(new HashMap<String, Gate>());
    }

    /**
     * Creates the actual circuit
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
            case "and":
                this.cirInstance.createAnd();
                break;

            case "or":
                this.cirInstance.createOR();
                break;

            case "not":
                this.cirInstance.createNOT();
                break;

            default:
                Class op = operations.get(specification);
                if (op == null) {
                    //do nothing unknow command
                    break;
                } else if (isTypeOf(op.getName(), BiGate.class)) {
                    cirInstance.createCustomBinOp(op);
                } else if (isTypeOf(op.getName(), UniGate.class)) {
                    cirInstance.createCustomUniOp(op);
                }
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

    @Override
    public void addCustomOperation(Class op, String call) throws IllegalArgumentException {
        if (op == null) {
            throw new IllegalArgumentException("Invalid type of operation, op was null");
        }
        if (!isTypeOf(op.getName(), Gate.class)) {
            throw new IllegalArgumentException("Invlaid type of class, is not subclass of Gate.");
        }

        Class opFind = operations.get(call);
        if (opFind == null && op != null) {
            operations.put(call, op);
        } else {
            throw new IllegalArgumentException("call already exists" + call);
        }
    }

    protected boolean isTypeOf(String myClass, Class<?> superClass) {
        boolean isSubclassOf = false;
        try {
            Class<?> clazz = Class.forName(myClass);
            if (!clazz.equals(superClass)) {
                clazz = clazz.getSuperclass();
                if (clazz == null) {
                    return false;
                }
                isSubclassOf = isTypeOf(clazz.getName(), superClass);
            } else {
                isSubclassOf = true;
            }

        } catch (ClassNotFoundException e) {
            /* Ignore */
        }
        return isSubclassOf;
    }
}//end ConcreteFactory

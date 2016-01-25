/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nl.tu.api.apiworkshopteam2;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import nl.tu.api.apiworkshopteam2.*;

/**
 *
 * @author CLambrec
 */
public class AbstractFactoryTest {
    
    public AbstractFactoryTest() {
        
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }
      @org.junit.Test
        public void testX1andX2() {
          AbstractFactory cirIns = new ConcreteFactory();
          CircuitTarget cirTarg ;//= new CircuitAdapter(cirIns);
          cirIns.initiliazeEmptyCircuit();
          //circuitIncirInsstance.createCicruit("X1 AND X2");          
          cirIns.addInput("X1");
          cirIns.moveGate(1);
          cirIns.addInput("X2");
          cirIns.moveGate(2);
          cirIns.addGate("add");
          //CircuitTarget ct = new CircuitAdapter(cirIns);
          //ct = cirIns.createCicruit();
          cirTarg = cirIns.createCicruit();
          cirTarg.setInput(Boolean.TRUE, "X1");
          cirTarg.setInput(Boolean.TRUE, "X2");
          
          assertEquals(cirTarg.evaluate(), Boolean.TRUE);
	  
    }
    
    /** 
     * Create a circuit to evaluate (x1 and x2) or x3 and then
     * verify that its result is false for input (false, true, false) and
     * it is true for input (false, false, true).
     */
    @org.junit.Test
    public void testX1andX2orX3() {
        AbstractFactory circuitInstance = new ConcreteFactory();
        circuitInstance.initiliazeEmptyCircuit();
          //circuitInstance.createCicruit("X1 AND X2 OR X3");
          circuitInstance.addInput("X1");
          circuitInstance.moveGate(1);
          circuitInstance.addInput("X2");
          circuitInstance.moveGate(2);          
          circuitInstance.addGate("add");
          circuitInstance.moveGate(1);
          circuitInstance.addInput("X3");
          circuitInstance.moveGate(2); 
	  circuitInstance.addGate("or");
          //TODO: 
	   
           CircuitTarget cirTarg ;
            cirTarg = circuitInstance.createCicruit();
            
          cirTarg.setInput(Boolean.TRUE, "X1");
          cirTarg.setInput(Boolean.TRUE, "X2");
          cirTarg.setInput(Boolean.TRUE, "X3");
          assertEquals(cirTarg.evaluate(), Boolean.TRUE);
         
    }
    /** 
     * Create a circuit to evaluate (x1 or not(x1)) and then
     * verify that its result is true for all values of x1.
     */
    @org.junit.Test
    public void testAlwaysTrue() {
        AbstractFactory circuitInstance = new ConcreteFactory();
        circuitInstance.initiliazeEmptyCircuit();
          //circuitInstance.createCicruit("X1 OR NOT X1");
          circuitInstance.addInput("X1");
          circuitInstance.moveGate(1);
          circuitInstance.addGate("not");
          CircuitTarget cirTarg ;
            cirTarg = circuitInstance.createCicruit();
	   assertEquals(cirTarg.evaluate(), true);
    }
    
    
}

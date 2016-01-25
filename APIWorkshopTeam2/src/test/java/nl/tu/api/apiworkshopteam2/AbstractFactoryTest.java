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
    public void testSomeMethod() {
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
      @org.junit.Test
        public void testX1andX2() {
          AbstractFactory circuitInstance = new ConcreteFactory();
          //circuitInstance.createCicruit("X1 AND X2");
          
          circuitInstance.addInput("X1");
          circuitInstance.addInput("X2");
          circuitInstance.addGate("add");
          assertEquals(circuitInstance.createCicruit("true and true"), true);
	  
    }
    
    /** 
     * Create a circuit to evaluate (x1 and x2) or x3 and then
     * verify that its result is false for input (false, true, false) and
     * it is true for input (false, false, true).
     */
    @org.junit.Test
    public void testX1andX2orX3() {
        AbstractFactory circuitInstance = new ConcreteFactory();
          //circuitInstance.createCicruit("X1 AND X2 OR X3");
          circuitInstance.addInput("X1");
          circuitInstance.addInput("X2");          
          circuitInstance.addGate("add");
          circuitInstance.addInput("X3");
	  circuitInstance.addGate("or");
          //TODO: 
	   assertEquals(circuitInstance.createCicruit("true and true or true"), true);
    }
    /** 
     * Create a circuit to evaluate (x1 or not(x1)) and then
     * verify that its result is true for all values of x1.
     */
    @org.junit.Test
    public void testAlwaysTrue() {
        AbstractFactory circuitInstance = new ConcreteFactory();
          //circuitInstance.createCicruit("X1 OR NOT X1");
          circuitInstance.addInput("X1");       
          circuitInstance.addGate("not");	 
	   assertEquals(circuitInstance.createCicruit("true"), true);
    }
    
    
}

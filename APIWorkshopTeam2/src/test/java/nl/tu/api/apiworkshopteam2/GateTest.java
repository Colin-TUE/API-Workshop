package nl.tu.api.apiworkshopteam2;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import nl.tu.api.apiworkshopteam2.AbstractFactory;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author CLambrec
 */
public class GateTest {
    
    private AbstractFactory af;
    
    public GateTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        af = new ConcreteFactory();
    }
    
    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    
    
    public void Test1() {
        af.addInput("x1");
        af.addInput("x2");
        af.addGate("and");
        af.addInput("x3");
        af.addGate("or");
    }
}

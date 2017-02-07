/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplo.pkg1;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author 312A-10
 */
public class pitagorasTest {
    
    public pitagorasTest() {
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

    /**
     * Test of calcular_hipotenusa method, of class pitagoras.
     */
    @Test
    public void testCalcular_hipotenusa() {
        System.out.println("calcular_hipotenusa");
        double ladoa = 3;
        double ladob = 4;
        double expResult = 5.0;
        double result = pitagoras.calcular_hipotenusa(ladoa, ladob);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}

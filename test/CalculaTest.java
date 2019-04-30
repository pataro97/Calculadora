/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import calculadora.Calculadora;
import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author usuario
 */
public class CalculaTest {
    Calculadora calculadora = new Calculadora();
    public CalculaTest() {
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
    
    @Test
    public void suma(){
        
        int sum = (int) (calculadora.suma(2,3));
        assertEquals(sum, 5);
    }
    @Test
    public void resta(){
        int res = (int) (calculadora.resta(3,2));
        assertEquals(res, 1);
    }
    @Test
    public void divide(){
        double divide =  calculadora.divide(10,5);
        assertEquals(divide, 2, 0.1);
    }
    @Test
    public void multiplica(){
        int multi = (int) (calculadora.multiplica(2,3));
        assertEquals(multi, 6);
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}

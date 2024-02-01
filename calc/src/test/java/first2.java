/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import com.mycompany.calc.calculator;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Admin
 */
public class first2 {
    int a,b,a1[]={1,2,3,6},b1=4;
    public first2() {
    }
    public void main() {
        testadd();
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
        a=3;
        b=5;
    }
    
    @AfterEach
    public void tearDown() {
    }
    @Test 
    public void testadd(){
        assertEquals(8,calculator.add(3,5));
    }
    @Test 
    public void testmul(){
        assertEquals(15,calculator.mul(3,5));
    }
    @Test 
    public void testdiv(){
        assertEquals(0,calculator.div(3,5));
    }
    @Test 
    public void testdivdouble(){
        assertEquals(0.6,calculator.divd(3,5));
    }
    @Test
    public void testmax(){
        assertEquals(6,calculator.maxe(a1));
    }
    @Test
    public void testmaxf(){
        assertEquals(2,calculator.maxe(a1));
    }
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}

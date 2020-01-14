/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trainticketselling;

import static org.hamcrest.CoreMatchers.allOf;
import static org.hamcrest.CoreMatchers.anyOf;
import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.CoreMatchers.endsWith;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.hamcrest.CoreMatchers.startsWith;
import org.hamcrest.core.IsAnything;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author chelynvalenciawardhanie
 */
public class FormTest {
    
    public FormTest() {
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
     * Test of Data method, of class Form.
     */
    @Test
    public void testData() {
        System.out.println("Data");
        Form instance = new Form();
        instance.Data();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of Button method, of class Form.
     */
    @Test
    public void testButton() {
        System.out.println("Button");
        Form instance = new Form();
        instance.Button();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of main method, of class Form.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Form.main(args);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of txt_routecode method, of class Form.
     */
    @Test
    public void testdeparture() {
        String departure = "D";
        Form instance = new Form();
        String expResult = "D";
        String result = instance.departure(departure);
        if(!departure.equals(expResult))
        {
            System.out.println("Value not match with expectation");
        }
        else{
            System.out.println("Departure = " + departure);
        }
        assertThat(departure, (IsAnything.anything()), 
                is(notNullValue()));
        assertThat(departure,anyOf(startsWith("D")
                ,containsString("!") ,endsWith(".re")));
        assertEquals(expResult, result);
    }

    /**
     * Test of departure method, of class form.
     */
    @Test
    public void testdestination() {
        String destination = "Depok";
        Form instance = new Form();
        String expResult = "Depok";
        String result = instance.destination(destination);
        if(!destination.equals(expResult))
        {
            System.out.println("Value not match with expectation");
        }
        else{
            System.out.println("Departure = " + destination);
        }
        assertThat(destination,allOf(startsWith("De")
                ,endsWith("ok"), is(equalTo(expResult))));
        assertEquals(expResult, result);
        assertEquals(expResult, result);
    }

    /**
     * Test of txt_price method, of class ItemStock.
     */
    

    
    /**
     * Test of destination method, of class Form.
     */
    @Test
    public void testDestination() {
        System.out.println("destination");
        String destination = "";
        Form instance = new Form();
        String expResult = "";
        String result = instance.destination(destination);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of Button method, of class Form.
     */
    @Test
    public void testButton_0args() {
        System.out.println("Button");
        Form instance = new Form();
        instance.Button();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of Button method, of class Form.
     */
    @Test
    public void testButton_String() {
        System.out.println("Button");
        String Button = "";
        Form instance = new Form();
        String expResult = "";
        String result = instance.Button(Button);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of departure method, of class Form.
     */
    @Test
    public void testDeparture() {
        System.out.println("departure");
        String departure = "";
        Form instance = new Form();
        String expResult = "";
        String result = instance.departure(departure);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

   

    /**
     * Test of txt_price method, of class Form.
     */
    @Test
    public void testTxt_price() {
        System.out.println("txt_price");
        String txt_price = "";
        Form instance = new Form();
        String expResult = "";
        String result = instance.txt_price(txt_price);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of txt_routecode method, of class Form.
     */
    @Test
    public void testTxt_routecode() {
        System.out.println("txt_routecode");
        String txt_routecode = "";
        Form instance = new Form();
        String expResult = "";
        String result = instance.txt_routecode(txt_routecode);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of txt_seatnumber method, of class Form.
     */
    @Test
    public void testTxt_seatnumber() {
        System.out.println("txt_seatnumber");
        String txt_seatnumber = "";
        Form instance = new Form();
        String expResult = "";
        String result = instance.txt_seatnumber(txt_seatnumber);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of txt_name method, of class Form.
     */
    @Test
    public void testTxt_name() {
        System.out.println("txt_name");
        String txt_name = "";
        Form instance = new Form();
        String expResult = "";
        String result = instance.txt_name(txt_name);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of txt_qty method, of class Form.
     */
    @Test
    public void testTxt_qty() {
        System.out.println("txt_qty");
        String txt_qty = "";
        Form instance = new Form();
        String expResult = "";
        String result = instance.txt_qty(txt_qty);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of txt_totalprice method, of class Form.
     */
    @Test
    public void testTxt_totalprice() {
        System.out.println("txt_totalprice");
        String txt_totalprice = "";
        Form instance = new Form();
        String expResult = "";
        String result = instance.txt_totalprice(txt_totalprice);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of txt_cash method, of class Form.
     */
    @Test
    public void testTxt_cash() {
        System.out.println("txt_cash");
        String txt_cash = "";
        Form instance = new Form();
        String expResult = "";
        String result = instance.txt_cash(txt_cash);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of txt_change method, of class Form.
     */
    @Test
    public void testTxt_change() {
        System.out.println("txt_change");
        String txt_change = "";
        Form instance = new Form();
        String expResult = "";
        String result = instance.txt_change(txt_change);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
}

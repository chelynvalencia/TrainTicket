/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trainticketselling;

import static org.hamcrest.CoreMatchers.anyOf;
import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.CoreMatchers.endsWith;
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
public class LoginTest {
    
    public LoginTest() {
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
     * Test of email method, of class Login.
     */
    @Test
    public void testEmail() {
        System.out.println("email");
        Login lg = new Login();
        String email = lg.email("adminka@gmail.com");
        String exp = "adminka@gmail.com";
        assertThat(email,containsString("@"));
        assertThat(email, startsWith("adm"));
        assertThat(email,is(notNullValue()));
        assertThat(email,endsWith(".com"));
        assertThat(email,is(IsAnything.anything()));
        assertEquals(exp,email);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of password method, of class Login.
     */
    @Test
    public void testPassword() {
         System.out.println("password");
        Login lg = new Login();
        String password = lg.password("123");
        String exp = "123";
        assertThat(password,is(notNullValue()));
        assertThat(password,is(IsAnything.anything()));
        assertThat(password,anyOf(
                containsString("1"),
                containsString("2"),
                containsString("3"),
                containsString("4"),
                containsString("5"),
                containsString("6"),
                containsString("7"),
                containsString("8"),
                containsString("9"),
                containsString("0")));
        assertEquals(password,exp);
    }

    /**
     * Test of main method, of class Login.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Login.main(args);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}

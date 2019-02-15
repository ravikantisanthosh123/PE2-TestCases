package com.stackroute.PE2;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class FactorialTest {


    Factorial fact ;

    @Before
    public void setUp() throws Exception {
        fact = new Factorial();
    }

    @After
    public void tearDown() throws Exception {
        fact = null;
    }

    @Test
    public void longFactorialPositive() {



        assertEquals (1,fact.longFactorial(1));

        assertEquals (2,fact.longFactorial(2));

        assertEquals (1,fact.longFactorial(0));

        assertEquals (0,fact.longFactorial(21));

        assertEquals (0,fact.longFactorial(100));

    }

    @Test
    public void longFactorialNegative() {

        assertEquals (0,fact.longFactorial(-1));

        assertEquals (0,fact.longFactorial(-100));

    }

    @Test
    public void longFactorialNull() {

        assertNotNull(fact.longFactorial(12));

        assertNotNull(fact.longFactorial(10));

        assertNotNull(fact.longFactorial(20));


    }

}
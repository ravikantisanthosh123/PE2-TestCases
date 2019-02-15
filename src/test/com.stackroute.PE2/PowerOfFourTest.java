package com.stackroute.PE2;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PowerOfFourTest {

    PowerOfFour p = new PowerOfFour();

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
        p = null;
    }

    @Test
    public void powerSuccess() {

        assertEquals(true,p.power(256));
        assertEquals(true,p.power(54700816));
        assertEquals(true,p.power(84934656));
        assertEquals(true, p.power(0));
        assertEquals(false, p.power(-12));
        assertEquals(false,p.power(1235465672));

    }

    @Test
    public void powerFailure() {

        assertNotEquals(false ,p.power(-8));
        assertNotEquals(false , p.power(-0));
        assertNotEquals(false ,p.power(1235465672));

    }
}
package com.stackroute.PE2;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CheckEvenNoTest {
    public static CheckEvenNo check;

    @Before
    public void setUp() throws Exception {
        check = new CheckEvenNo();
    }

    @After
    public void tearDown() throws Exception {
        check=null;
    }

    @Test
    public void isEven() {


        assertEquals(true, check.isEven(4));
        assertEquals(true, check.isEven(98));
        assertEquals(true, check.isEven(102));
        assertEquals(true, check.isEven(1024));
        assertEquals(true, check.isEven(498868898));
        assertEquals(true, check.isEven(-6776));

    }

    @Test
    public void isEvenFailure() {


        assertNotEquals(true, check.isEven(5));
        assertNotEquals(true, check.isEven(95));
        assertNotEquals(true, check.isEven(101));
        assertNotEquals(true, check.isEven(1027));
        assertNotEquals(true, check.isEven(-492376329));

    }
}
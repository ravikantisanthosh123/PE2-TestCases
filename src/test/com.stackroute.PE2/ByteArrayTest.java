package com.stackroute.PE2;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ByteArrayTest {

    ByteArray ba;

    @Before
    public void setUp() throws Exception {
        ba = new ByteArray();
    }

    @After
    public void tearDown() throws Exception {
        ba = null;
    }

    @Test
    public void byteArrayfile1() {

        byte[] arr = {'a','p','p','l','e'};

        assertArrayEquals(arr,ba.byteArray("testfolder","ax"));
        assertNotNull(ba.byteArray("testfolder","ax"));
        assertEquals(arr[0],ba.byteArray("testfolder","ax")[0]);

    }

    @Test
    public void byteArrayfile2() {

        byte[] arr = {'b','a','n','a','n','a'};

        assertArrayEquals(arr,ba.byteArray("testfolder","bx"));
        assertNotNull(ba.byteArray("testfolder","bx"));
        assertEquals(arr[0],ba.byteArray("testfolder","bx")[0]);

    }

    @Test
    public void byteArrayfile3() {

        byte[] arr = {'c','a','t'};

        assertArrayEquals(arr,ba.byteArray("testfolder","cx"));
        assertNotNull(ba.byteArray("testfolder","cx"));
        assertEquals(arr[0],ba.byteArray("testfolder","cx")[0]);

    }

    @Test
    public void byteArrayfile4() {

        byte[] arr = {'d','o','g'};

        assertArrayEquals(arr,ba.byteArray("testfolder","dx"));
        assertNotNull(ba.byteArray("testfolder","dx"));
        assertEquals(arr[0],ba.byteArray("testfolder","dx")[0]);

    }

    @Test
    public void byteArrayFile5() {

        byte[] arr = {'1','2','3','4','5'};

        assertArrayEquals(arr,ba.byteArray("testfolder","ex"));
        assertNotNull(ba.byteArray("testfolder","ex"));
        assertEquals(arr[0],ba.byteArray("testfolder","ex")[0]);

    }

    @Test
    public void byteArrayfile6() {

        byte[] arr = {'t','w','o',' ','w','o','r','d','s'};

        assertArrayEquals(arr,ba.byteArray("testfolder","fx"));
        assertNotNull(ba.byteArray("testfolder","fx"));
        assertEquals(arr[0],ba.byteArray("testfolder","fx")[0]);

    }
}
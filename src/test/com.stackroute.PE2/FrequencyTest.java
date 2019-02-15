package com.stackroute.PE2;

import org.junit.Test;

import java.io.File;

import static org.junit.Assert.*;

public class FrequencyTest {

    Frequency f = new Frequency();

    @Test
    public void wordsSuccess() {

        assertEquals(2,f.words(new File("file1.txt")));
        assertEquals(1,f.words(new File("file2.txt")));
        assertEquals(20,f.words(new File("file3.txt")));
        assertEquals(0,f.words(new File("file4.txt")));

    }

    @Test
    public void wordsFailure() {

        assertNotEquals(2,f.words(new File("file1.txt")));
        assertNotEquals(1,f.words(new File("file2.txt")));
        assertNotEquals(6,f.words(new File("file3.txt")));
        assertNotEquals(0,f.words(new File("file4.txt")));

    }

}
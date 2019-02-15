package com.stackroute.PE2;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import java.util.Scanner;
import java.io.*;
import static org.junit.Assert.*;

public class UpperCaseTest {

    private static UpperCase uppercase;

    @BeforeClass
    public static void setup() {
        // This methods runs, before running any one of the test case
        // This method is used to initialize the required variables
        uppercase = new UpperCase();

    }

    @AfterClass
    public static void teardown() {
        // This method runs, after running all the test cases
        // This method is used to clear the initialized variables
        uppercase = null;

    }

    @Test
    public void upperCaseSuccess() {

        File file = new File("./src/main/inputFiles/input.txt");
        String path = file.getAbsolutePath();
       assertNull("The filename Dosen't exist",uppercase.upperCase(" "));
       assertEquals("successfully converted to uppercase","AMAN BATHLA",uppercase.upperCase(path));
       assertNotEquals("Spaces should not be there","amanbathla",uppercase.upperCase(path));
        assertNotEquals("Error in converting to uppercase","aman bathla",uppercase.upperCase(path));
        assertNotEquals("full name is not there","AMAN",uppercase.upperCase(path));
        assertEquals("successfully converted to uppercase","AMAN BATHLA",uppercase.upperCase(path));

    }
    @Test
    public void upperCaseSuccess1() {

        File file = new File("./src/main/inputFiles/input1.txt");
        String path = file.getAbsolutePath();
        assertNull("The filename Dosen't exist",uppercase.upperCase(" "));
        assertEquals("successfully converted to uppercase","SANTOSH",uppercase.upperCase(path));
        assertNotEquals("Spaces should not be there","santosh",uppercase.upperCase(path));
        assertNotEquals("Error in converting to uppercase","santosh",uppercase.upperCase(path));
        assertNotEquals("full name is not there","SANTOSH",uppercase.upperCase(path));
        assertEquals("successfully converted to uppercase","santosh",uppercase.upperCase(path));

    }

    @Test
    public void upperCaseSuccess2() {

        File file = new File("./src/main/inputFiles/input2.txt");
        String path = file.getAbsolutePath();
        assertNull("The filename Dosen't exist",uppercase.upperCase(" "));
        assertEquals("successfully converted to uppercase","FARHAAN",uppercase.upperCase(path));
        assertNotEquals("Spaces should not be there","farhaan",uppercase.upperCase(path));
        assertNotEquals("Error in converting to uppercase","farhaan",uppercase.upperCase(path));
        assertNotEquals("full name is not there","FARHAAN",uppercase.upperCase(path));
        assertEquals("successfully converted to uppercase","farhan",uppercase.upperCase(path));

    }
    @Test
    public void upperCaseSuccess3() {

        File file = new File("./src/main/inputFiles/input3.txt");
        String path = file.getAbsolutePath();
        assertNull("The filename Dosen't exist",uppercase.upperCase(" "));
        assertEquals("successfully converted to uppercase","AJAY",uppercase.upperCase(path));
        assertNotEquals("Spaces should not be there","ajay",uppercase.upperCase(path));
        assertNotEquals("Error in converting to uppercase","ajay",uppercase.upperCase(path));
        assertNotEquals("full name is not there","AJAY",uppercase.upperCase(path));
        assertEquals("successfully converted to uppercase","AJAY",uppercase.upperCase(path));

    }


}
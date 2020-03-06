package io.zipcoder.interfaces;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestStudents {
    Students test;

    @Before
    public void setup() {
        test = Students.getInstance();
    }

//    @After
//    public void teardown() {
//        test.removeAll();
//    }

    @Test
    public void testStudents() {
        String expected = "ID: 511, Name: Mo Aydin";

        String actual = test.findById(511L).toString();

        assertEquals(expected, actual);
    }
}
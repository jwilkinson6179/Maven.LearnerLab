package io.zipcoder.interfaces;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestInstructors
{
    Instructors test;

    @Before
    public void init()
    {
        test = Instructors.getInstance();
    }

    @Test
    public void testInstructors()
    {
        String expected = "ID: 992, Name: Roberto DeDeus";

        String actual = test.findById(992L).toString();

        assertEquals(expected, actual);
    }
}
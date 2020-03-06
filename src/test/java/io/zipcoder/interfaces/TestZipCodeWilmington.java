package io.zipcoder.interfaces;

import org.junit.Before;
import org.junit.Test;

import static io.zipcoder.interfaces.Educator.*;
import static org.junit.Assert.assertEquals;

public class TestZipCodeWilmington
{
    ZipCodeWilmington testSchool;

    @Before
    public void setup()
    {
        testSchool = testSchool.getInstance();
    }

    @Test
    public void lectureTest()
    {
        Double expected = 0.2;

        testSchool.hostLecture(NOBLES, 2.0);
        Double actual = testSchool.getStudents().findById(543L).getTotalStudyTime();

        assertEquals(expected, actual);
    }
}
package io.zipcoder.interfaces;

//        Create a testLearn method that ensures a Student's totalStudyTime instance variable is incremented by the
//        specified numberOfHours by invoking the .learn method.

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class TestStudent {
    Student testStudent;

    @Before
    public void initialize()
    {
        testStudent = new Student(1040L, "James");
    }

    @Test
    public void testImplementation()
    {
        assertTrue(testStudent instanceof Learner);
    }

    @Test
    public void testInheritance()
    {
        assertTrue(testStudent instanceof Person);
    }

    @Test
    public void testLearn()
    {
        Double expected = 14.5;

        testStudent.learn(14.5);
        Double actual = testStudent.getTotalStudyTime();

        assertEquals(expected, actual);
    }

}

package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class TestInstructors
{
    Instructors test;
    Instructor teacher;

    @Before
    public void init()
    {
        test = Instructors.getInstance();
        teacher = new Instructor(12345L, "Dolio");
    }

    @Test
    public void addingATeacher()
    {
        test.addPerson(teacher);

        assertTrue(test.contains(teacher));
    }
}

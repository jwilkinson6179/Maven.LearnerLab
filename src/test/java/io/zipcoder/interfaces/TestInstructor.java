package io.zipcoder.interfaces;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class TestInstructor
{
    Instructor testInstructor;
    Student testStudent;

    @Before
    public void setup()
    {
        testInstructor = new Instructor(1000L, "Professor Oak");
        testStudent = new Student(9L, "Ash Ketchum");
    }

    @Test
    public void testIfTeacher()
    {
        assertTrue(testInstructor instanceof Teacher);
    }

    @Test
    public void testIfPerson()
    {
        assertTrue(testInstructor instanceof Person);
    }

    @Test
    public void testTeachStudent()
    {
        // GIVEN

        Double expected = 35.0;

        // WHEN

        testInstructor.teach(testStudent, 35.0);
        Double actual = testStudent.getTotalStudyTime();

        // THEN

        assertEquals(expected, actual);
    }

    @Test
    public void testLecture()
    {
        // GIVEN
        Student[] testClass = { new Student(1L, "Jessie"), new Student(2L, "James") };
        Double expectedFirstStudent = 10.0;
        Double expectedSecondStudent = 10.0;
        // WHEN

        testInstructor.lecture(testClass, 20.0);
        Double actualFirstStudent = testClass[0].getTotalStudyTime();
        Double actualSecondStudent = testClass[1].getTotalStudyTime();

        // THEN

        assertEquals(expectedFirstStudent, actualFirstStudent);
        assertEquals(expectedSecondStudent, actualSecondStudent);
    }
}

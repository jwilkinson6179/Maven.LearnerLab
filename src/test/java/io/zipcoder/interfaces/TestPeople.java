package io.zipcoder.interfaces;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestPeople
{
    People testPeople;
    Student testStudent;
    Student testSearchedStudent;
    Instructor testTeacher;

    @Before
    public void setup()
    {
        testPeople = new People();
        testStudent = new Student(500L, "Sisko");
        testSearchedStudent = new Student(1000L, "Dax");
        testTeacher = new Instructor(45L, "Bashir");
    }

    @Test
    public void addStudent()
    {
        Person[] expected = { testStudent };

        testPeople.addPerson(testStudent);
        Person[] actual = testPeople.toArray();

        assertEquals(expected, actual);
    }

    @Test
    public void removeStudent()
    {
        Person[] expected = {  };

        testPeople.addPerson(testStudent);
        testPeople.remove(500L);
        Person[] actual = testPeople.toArray();

        assertEquals(expected, actual);
    }

    @Test
    public void testSearchedForId()
    {
        Person expected = testSearchedStudent;

        testPeople.addPerson(testSearchedStudent);
        Person actual = testPeople.findById(1000L);

        assertEquals(expected, actual);
    }
}

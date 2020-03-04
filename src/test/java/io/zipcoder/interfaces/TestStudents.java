package io.zipcoder.interfaces;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestStudents {
    Students test;
    Students test2;
    Student tStudent1;
    Student tStudent2;
    Student tStudent3;
    Student tStudent4;
    Student tStudent5;
    Student tStudent6;

    @Before
    public void setup()
    {
        test = Students.getInstance();
        tStudent1 = new Student(111L, "Tony Stark");
        tStudent2 = new Student(222L, "Bruce Banner");
        tStudent3 = new Student(333L, "Thor Odinson");
        tStudent4 = new Student(444L, "Clint Barton");
        tStudent5 = new Student(555L, "Steve Rogers");
        tStudent6 = new Student(666L, "Natasha Romanov");
        test.addPerson(tStudent1);
        test.addPerson(tStudent2);
        test.addPerson(tStudent3);
        test.addPerson(tStudent4);
        test.addPerson(tStudent5);
        test.addPerson(tStudent6);
        test2 = Students.getInstance();
    }

   @After
   public void teardown()
    {
        test.removeAll();
    }

    @Test
    public void testStudents()
    {
        Person[] expected = { tStudent1, tStudent2, tStudent3, tStudent4, tStudent5, tStudent6 };

        Person[] actual = test.toArray();

        assertEquals(expected, actual);
    }

    @Test
    public void changesAcrossDifferentVars()
    {
        Person[] expectedBefore = { tStudent1, tStudent2, tStudent3, tStudent4, tStudent5, tStudent6 };
        Person[] expectedAfter = { tStudent1, tStudent2, tStudent4, tStudent5, tStudent6 };

        Person[] actualBefore = test.toArray();
        test2.remove(333L);
        Person[] actualAfter = test.toArray();

        assertEquals(expectedBefore, actualBefore);
        assertEquals(expectedAfter, actualAfter);
    }
}
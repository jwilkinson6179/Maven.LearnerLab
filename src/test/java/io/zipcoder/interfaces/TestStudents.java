package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestStudents {
    Students test;

    @Test
    public void testStudents()
    {
        Person[] expected = {new Student(111L, "Tony Stark"), new Student(222L, "Bruce Banner"),
                new Student(333L, "Thor Odinson"), new Student(444L, "Clint Barton"),
                new Student(555L, "Steve Rogers"), new Student(666L, "Natasha Romanov")};

        Person[] actual = Students.getInstance().toArray();

        assertEquals(expected, actual);
    }
}
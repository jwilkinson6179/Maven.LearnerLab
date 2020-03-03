package io.zipcoder.interfaces;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestPerson
{
    Person testPerson;

    @Test
    public void testConstructor()
    {
        // GIVEN
        testPerson = new Person(500L, "Lois Lane");
        String expectedName = "Lois Lane";
        Long expectedId = 500L;

        // WHEN

        String actualName = testPerson.getName();
        Long actualId = testPerson.getId();

        // THEN

        assertEquals(expectedName, actualName);
        assertEquals(expectedId, actualId);
    }

    @Test
    public void setNameTest()
    {
        // GIVEN
        testPerson = new Person(1L, "Clark Kent");
        String expected = "Superman";

        // WHEN

        testPerson.setName("Superman");
        String actual = testPerson.getName();

        // THEN

        assertEquals(expected, actual);
    }
}
package io.zipcoder.interfaces;

public final class Students
{
    private static final Students INSTANCE = new Students();

    private Students()
    {
        INSTANCE.addPerson(new Student(111L, "Tony Stark"));
        INSTANCE.addPerson(new Student(222L, "Bruce Banner"));
        INSTANCE.addPerson(new Student(333L, "Thor Odinson"));
        INSTANCE.addPerson(new Student(444L, "Clint Barton"));
        INSTANCE.addPerson(new Student(555L, "Steve Rogers"));
        INSTANCE.addPerson(new Student(666L, "Natasha Romanov"));
    }

    public static Students getInstance()
    {
        return INSTANCE;
    }
}

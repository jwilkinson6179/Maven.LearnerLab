package io.zipcoder.interfaces;

import static io.zipcoder.interfaces.Educator.*;

public final class Instructors extends People<Instructor>
{
    private static final Instructors INSTANCE = new Instructors();

    private Instructors()
    {
        personList.add(DOLIO.instructor());
        personList.add(YOUNGER.instructor());
        personList.add(ROBERTO.instructor());
        personList.add(NOBLES.instructor());
    }

    @Override
    public Instructor[] toArray()
    {
        Instructor[] result = new Instructor[personList.size()];

        for(Integer i = 0; i < personList.size(); i++)
        {
            result[i] = personList.get(i);
        }

        return result;
    }

    public static Instructors getInstance()
    {
        return INSTANCE;
    }
}
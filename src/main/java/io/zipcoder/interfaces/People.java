package io.zipcoder.interfaces;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class People implements Iterable<Person> {
    List<Person> personList;

    public People()
    {
        personList = new ArrayList<>();
    }

    public void addPerson(Person addedPerson)
    {
        personList.add(addedPerson);
    }

    public Person findById(Long searchedId)
    {
        for(Person element : personList)
        {
            if(element.getId().equals(searchedId))
            {
                return element;
            }
        }

        return null;
    }

    public Boolean contains(Person searchedPerson)
    {
        return personList.contains(searchedPerson);
    }

    public Boolean remove(Long idToRemove)
    {
        for(Person element : personList)
        {
            if(element.getId().equals(idToRemove))
            {
                personList.remove(element);
                return true;
            }
        }

        return false;
    }

    public void removeAll()
    {
        personList.clear();
    }

    public Integer count()
    {
        return personList.size();
    }

    public Person[] toArray()
    {
        Person[] result = new Person[personList.size()];

        for(Person element : personList)
        {
            personList.add(element);
        }

        return result;
    }

    @Override
    public Iterator<Person> iterator() {
        return personList.iterator();
    }
}
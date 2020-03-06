package io.zipcoder.interfaces;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

abstract public class People<E extends Person> implements Iterable<E> {
    List<E> personList;

    public People()
    {
        personList = new ArrayList<>();
    }

    public void addPerson(E addedPerson)
    {
        personList.add(addedPerson);
    }

    public E findById(Long searchedId)
    {
        for(E element : personList)
        {
            if(element.getId().equals(searchedId))
            {
                return element;
            }
        }

        return null;
    }

    public Boolean contains(E searchedPerson)
    {
        return personList.contains(searchedPerson);
    }

    public Boolean remove(Long idToRemove)
    {
        for(E element : personList)
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

    abstract public E[] toArray();

    @Override
    public Iterator<E> iterator() {
        return personList.iterator();
    }
}
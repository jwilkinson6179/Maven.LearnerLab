package io.zipcoder.interfaces;

public class Person {
    private final Long id;
    private String name;

    public Person(Long idNumber, String initName)
    {
        name = initName;
        id = idNumber;
    }

    public Long getId()
    {
        return id;
    }

    public void setName(String updatedName)
    {
        name = updatedName;
    }

    public String getName()
    {
        return name;
    }
}

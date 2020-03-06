package io.zipcoder.interfaces;

public final class Students extends People<Student>
{
    private static final Students INSTANCE = new Students();

    private Students()
    {
        personList.add(new Student(543L, "James Wilkinson"));
        personList.add(new Student(571L, "Zanetta Norris"));
        personList.add(new Student(509L, "Chris Farmer"));
        personList.add(new Student(511L, "Mo Aydin"));
        personList.add(new Student(529L, "Greg David"));
        personList.add(new Student(556L, "James Churu"));
        personList.add(new Student(541L, "Von Li"));
        personList.add(new Student(550L, "April Howard"));
        personList.add(new Student(501L, "Giles Bradford"));
        personList.add(new Student(598L, "Chip Fody"));
    }

    @Override
    public Student[] toArray()
    {
        Student[] result = new Student[personList.size()];

        for(Integer i = 0; i < personList.size(); i++)
        {
            result[i] = personList.get(i);
        }

        return result;
    }

    public static Students getInstance()
    {
        return INSTANCE;
    }
}
package io.zipcoder.interfaces;

public class Student extends Person implements Learner {
    Double totalStudyTime;

    public Student(Long id, String name)
    {
        super(id, name);
        totalStudyTime = 0.0;
    }

    public void learn(Double numberOfHours)
    {
        totalStudyTime += numberOfHours;
    }

    public Double getTotalStudyTime()
    {
        return totalStudyTime;
    }
}

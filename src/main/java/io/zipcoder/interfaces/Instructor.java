package io.zipcoder.interfaces;

public class Instructor extends Person implements Teacher {

    public Instructor(Long idNumber, String initName)
    {
        super(idNumber, initName);
    }

    public void teach(Learner pupil, Double numberOfHours)
    {
        pupil.learn(numberOfHours);
    }

    public void lecture(Learner students[], Double numberOfHours)
    {
        for(Learner pupil : students)
        {
            pupil.learn(numberOfHours / students.length);
        }
    }
}
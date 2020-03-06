package io.zipcoder.interfaces;

public enum Educator implements Teacher {
    DOLIO   (new Instructor(981L, "Dolio Durant")),
    YOUNGER (new Instructor(911L, "Kris Younger")),
    ROBERTO (new Instructor(992L, "Roberto DeDeus")),
    NOBLES  (new Instructor(974L, "Chris Nobles"))
    ;

    private final Instructor instructor;
    private Double timeWorked;

    private Educator(Instructor instructor)
    {
        timeWorked = 0.0;
        this.instructor = instructor;
    }

    public Instructor instructor()
    {
        return this.instructor;
    }

    @Override
    public void teach(Learner pupil, Double numberOfHours)
    {
        timeWorked += numberOfHours;
        instructor.teach(pupil, numberOfHours);
    }

    @Override
    public void lecture(Learner students[], Double numberOfHours)
    {
        timeWorked += numberOfHours;
        instructor.lecture(students, numberOfHours);
    }
}
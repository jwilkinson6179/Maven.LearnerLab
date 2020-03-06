package io.zipcoder.interfaces;

import java.util.HashMap;
import java.util.Map;

public class ZipCodeWilmington
{
    private static final ZipCodeWilmington INSTANCE = new ZipCodeWilmington();
    private Students students = Students.getInstance();
    private Instructors instructors = Instructors.getInstance();

    private ZipCodeWilmington()
    {

    }

    public static ZipCodeWilmington getInstance()
    {
        return INSTANCE;
    }

    public Students getStudents()
    {
        return students;
    }

    public Instructors getInstructors()
    {
        return instructors;
    }

    public void hostLecture(Educator teacher, Double numberOfHours)
    {
        Student[] attendants = students.toArray();

        teacher.lecture(attendants, numberOfHours);
    }


    public Map<Student, Double> getStudyMap()
    {
        Map<Student, Double> studyMap = new HashMap<>();

        for(Student element : students)
        {
            studyMap.put(element, element.totalStudyTime);
        }

        return studyMap;
    }
}

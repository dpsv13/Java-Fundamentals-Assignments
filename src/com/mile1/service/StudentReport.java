
package src.com.mile1.service;

import src.com.mile1.bean.Student;
import src.com.mile1.exception.NullMarksArrayException;
import src.com.mile1.exception.NullNameException;
import src.com.mile1.exception.NullStudentObjectException;

public class StudentReport {

    public String validate(Student student)
            throws NullStudentObjectException,
                   NullNameException,
                   NullMarksArrayException {

        if (student == null) {
            throw new NullStudentObjectException();
        }

        if (student.getName() == null) {
            throw new NullNameException();
        }

        if (student.getMarks() == null) {
            throw new NullMarksArrayException();
        }

        return "VALID";
    }

    public String findGrades(Student student) {

        int[] marks = student.getMarks();
        int sum = 0;

        for (int mark : marks) {
            sum += mark;
        }

        double average = sum / 3.0;

        if (average >= 80) {
            return "A";
        } else if (average >= 60) {
            return "B";
        } else if (average >= 40) {
            return "C";
        } else {
            return "F";
        }
    }
}
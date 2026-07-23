
package com.mile1.main;

import com.mile1.bean.Student;
import com.mile1.exception.NullMarksArrayException;
import com.mile1.exception.NullNameException;
import com.mile1.exception.NullStudentObjectException;
import com.mile1.service.StudentReport;
import com.mile1.service.StudentService;

public class StudentMain {

    public static void main(String[] args) {

        Student data[] = new Student[4];

        data[0] = new Student("Sekar", new int[] {85, 75, 95});
        data[1] = new Student(null, new int[] {11, 22, 33});
        data[2] = new Student("Manoj", null);
        data[3] = null;

        StudentReport report = new StudentReport();
        StudentService service = new StudentService();

        System.out.println("Grade Calculation");

        for (int i = 0; i < data.length; i++) {

            try {

                if ("VALID".equals(report.validate(data[i]))) {

                    String grade = report.findGrades(data[i]);
                    data[i].setGrade(grade);

                    System.out.println(
                            data[i].getName() + " : " + data[i].getGrade());

                }

            } catch (NullStudentObjectException e) {

                System.out.println(e);

            } catch (NullNameException e) {

                System.out.println(e);

            } catch (NullMarksArrayException e) {

                System.out.println(e);

            }

        }

        System.out.println();
        System.out.println("Statistics");
        System.out.println("----------------------------");
        System.out.println("Null Objects : "
                + service.findNumberOfNullObjects(data));
        System.out.println("Null Names   : "
                + service.findNumberOfNullNames(data));
        System.out.println("Null Marks   : "
                + service.findNumberOfNullMarksArray(data));
    }
}

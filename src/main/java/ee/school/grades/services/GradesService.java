package ee.school.grades.services;

import ee.school.grades.dto.Grade;
import ee.school.grades.dto.Student;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Service
public class GradesService {
    public List<Student> getStudents() {

        List<Student> students = new ArrayList<>();
        List<Grade> grades = new ArrayList<>();

        Student student1 = new Student(1, "S. Tudent");
        Grade grade1 = new Grade(1, "CS", 1, 4);

        grades.add(grade1);
        student1.setGrades(grades);
        students.add(student1);
        return students;
    }

    public Student getStudentFilter(int id, String subject) {

        List<Grade> grades = new ArrayList<>();

        Student student1 = new Student(id, "S. Tudent");
        Grade grade1 = new Grade(1, Objects.requireNonNullElse(subject, "CS"), 1, 4);
        Grade grade2 = new Grade(2, Objects.requireNonNullElse(subject, "Math"), 1, 5);

        grades.add(grade1);
        grades.add(grade2);
        student1.setGrades(grades);
        return student1;
    }

    public Student putStudent(int id, Student newStudent) {

        List<Grade> grades = new ArrayList<>();

        Student student1 = new Student(id, "S. Tudent");
        Grade grade1 = new Grade(1, "CS", 1, 4);

        student1.setName(newStudent.getName());

        grades.add(grade1);
        student1.setGrades(grades);
        return student1;
    }

    public Grade putGrade(int id, Grade newGrade) {
        Student student1 = new Student(1, "S. Tudent");
        Grade grade1 = new Grade(id, "CS", 1, 4);

        grade1.setSubject(newGrade.getSubject());

        grade1.setStudent(student1);
        return grade1;
    }

    public List<Grade> getGrades() {
        List<Grade> grades = new ArrayList<>();

        Student student1 = new Student(1, "S. Tudent");
        Grade grade1 = new Grade(1, "CS", 1, 4);
        Grade grade2 = new Grade(2, "Math", 1, 4);

        grade1.setStudent(student1);
        grade2.setStudent(student1);

        grades.add(grade1);
        grades.add(grade2);
        student1.setGrades(grades);
        return grades;
    }

    public List<Grade> getGradesFilter(String studentName, String subject) {
        List<Grade> grades = new ArrayList<>();

        Student student1 = new Student(1, Objects.requireNonNullElse(studentName, "S. Tudent"));
        Grade grade1 = new Grade(1, Objects.requireNonNullElse(subject, "CS"), 1, 4);

        grade1.setStudent(student1);

        grades.add(grade1);
        student1.setGrades(grades);
        return grades;
    }

    public Student postStudent(Student newStudent) {
        return newStudent;
    }

    public Grade postGrade(Grade newGrade) {
        return newGrade;
    }

}

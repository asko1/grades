package ee.school.grades.controller;

import ee.school.grades.dto.Grade;
import ee.school.grades.dto.Student;
import ee.school.grades.services.GradesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.swing.text.html.Option;
import java.util.List;
import java.util.Optional;

@RestController
public class GradesController {

    @Autowired
    GradesService gradesService;

    @GetMapping("v1/students")
    List<Student> getStudents() {
        return gradesService.getStudents();
    }

    @GetMapping("v1/students/{id}")
    Student getStudentFilter(@PathVariable int id, @RequestParam(required = false, value = "subject") String subject) {
        return gradesService.getStudentFilter(id, subject);
    }

    @PutMapping("v1/students/{id}")
    Student putStudent(@PathVariable int id, @RequestBody Student newStudent) {
        return gradesService.putStudent(id, newStudent);
    }

    @PutMapping("v1/grades/{id}")
    Grade putGrade(@PathVariable int id, @RequestBody Grade newGrade) {
        return gradesService.putGrade(id, newGrade);
    }

    @PostMapping("v1/students")
    Student postStudent(@RequestBody Student newStudent) {
        return gradesService.postStudent(newStudent);
    }

    @PostMapping("v1/grades")
    Grade postGrade(@RequestBody Grade newGrade) {
        return gradesService.postGrade(newGrade);
    }

    @DeleteMapping("v1/students/{id}")
    String deleteStudent(@PathVariable int id) {
        return "Student " + id + " deleted!";
    }

    @DeleteMapping("v1/grades/{id}")
    String deleteGrade(@PathVariable int id) {
        return "Grade " + id + " deleted!";
    }

    @GetMapping("v1/grades")
    List<Grade> getGradesFilter(@RequestParam(required = false, value = "studentName") String studentName, @RequestParam(required = false, value = "subject") String subject) {
        return gradesService.getGradesFilter(studentName, subject);
    }
}

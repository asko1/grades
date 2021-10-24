package ee.school.grades.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import java.time.LocalDate;


@Data
public class Grade {
    private int id;
    private String subject;
    private int semester;
    private int grade;
    private LocalDate date = LocalDate.now();

    @JsonIgnoreProperties("grades")
    private Student student;

    public Grade(int id, String subject, int semester, int grade) {
        this.id = id;
        this.subject = subject;
        this.semester = semester;
        this.grade = grade;
    }
}

package ee.school.grades.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import java.util.List;

@Data
public class Student {

    private int id;
    private String name;

    @JsonIgnoreProperties("student")
    private List<Grade> grades;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }
}

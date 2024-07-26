package peaksoft.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "courses")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "course_gen")
    @SequenceGenerator(name = "course_gen",sequenceName = "course_seq",allocationSize = 1)
    private Long id;
    private String name;
    private int price;
    private LocalDate dateOfStart;
    @ManyToMany
    private List<Mentor> mentors;
    @ManyToMany(mappedBy = "courses")
    private List<Student> students;
    @OneToMany(mappedBy = "course")
    private List<Lesson> lessons;

    public Course(String name, int price, LocalDate dateOfStart) {
        this.name = name;
        this.price = price;
        this.dateOfStart = dateOfStart;
    }
}

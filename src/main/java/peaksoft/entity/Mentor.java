package peaksoft.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "mentors")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Mentor {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "mentor_gen")
    @SequenceGenerator(name = "mentor_gen",sequenceName = "mentor_seq",allocationSize = 1)
    private Long id;
    @Column(name = "first_name")
    private String firstName;
    @Column(unique = true)
    private String email;
    @Column(name = "year_of_birth")
    private int yearOfBirth;
}

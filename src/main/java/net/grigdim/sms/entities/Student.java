package net.grigdim.sms.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.UniqueElements;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "students", uniqueConstraints = @UniqueConstraint(name = "email", columnNames = "email"))
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Student {
    @Id
    @SequenceGenerator(
            name = "student_sequence",
            sequenceName = "student_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "student_sequence"
    )    @Column(name = "student_id")
    private Long id;
    @Column(name = "first_name", nullable = false)
    @NotBlank(message = "First name cannot be null")
    private String firstName;
    @Column(name = "last_name", nullable = false)
    @NotBlank(message = "Last name cannot be null")
    private String lastName;
    @Column(name = "email", nullable = false)
    @Email
    private String email;
    @Embedded
    private Guardian guardian;

}

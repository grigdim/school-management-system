package net.grigdim.sms.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.validation.constraints.Email;

@Embeddable
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@AttributeOverrides({
        @AttributeOverride(
                name = "name",
                column = @Column(name= "guardian_name")
        ),
        @AttributeOverride(
                name = "email",
                column = @Column(name="guardian_email")
        ),
        @AttributeOverride(
                name = "mobile",
                column = @Column (name= "guardian_mobile")
        )
})
public class Guardian {

    @Column(name = "guardian_name")
    private String name;
    @Column(name = "guardian_email")
    @Email
    private String email;
    @Column(name = "guardian_mobile")
    private String mobile;
}

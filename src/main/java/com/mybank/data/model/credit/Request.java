package com.mybank.data.model.credit;

import com.mybank.data.model.common.AbstractExpiringEntity;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.validator.constraints.Email;

import javax.persistence.Column;
import javax.persistence.Entity;

/**
 * @author Yugov Alexandr.
 */
@Entity
@Getter
@Setter
@NoArgsConstructor
public class Request extends AbstractExpiringEntity {

    @Column(name = "first_name", nullable = false)
    private String firstName;

    @Column(name = "last_name", nullable = false)
    private String lastName;

    @Column(nullable = false)
    private String patronymic;

    @Email
    @Column(nullable = false)
    private String email;

    @Column(nullable = false)
    private String phone;
}

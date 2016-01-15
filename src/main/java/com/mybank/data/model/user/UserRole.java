package com.mybank.data.model.user;


import com.mybank.data.model.common.AbstractExpiringEntity;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;

/**
 * @author admin.
 */
@Entity
@Getter
@Setter
@NoArgsConstructor
public class UserRole extends AbstractExpiringEntity {

    @Column(unique = true)
    private String role;

    public UserRole(String role) {
        this.role = role;
    }
}
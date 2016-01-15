package com.mybank.data.model.bank;

import com.mybank.data.model.common.AbstractExpiringEntity;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;

/**
 * @author admin.
 */
@Entity
@Getter
@Setter
@NoArgsConstructor
public class CreditType extends AbstractExpiringEntity {
    @Getter
    @Setter
    private String name;

    public CreditType(String name) {
        this.name = name;
    }
}

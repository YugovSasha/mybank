package com.mybank.data.model.common;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;

/**
 * Created by admin on 11/2/2015.
 */
@MappedSuperclass
@Getter
@Setter
@NoArgsConstructor
public abstract class AbstractExpiringEntity extends AbstractEntity {

    @Column(nullable = false)
    private boolean expired;

    public void expire() {
        expired = true;
    }
}

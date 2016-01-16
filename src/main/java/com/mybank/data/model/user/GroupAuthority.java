package com.mybank.data.model.user;

import com.mybank.data.model.common.AbstractEntity;
import com.mybank.data.model.common.AbstractExpiringEntity;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;

/**
 * @author a2.yugov.
 */
@Entity
@Getter
@Setter
@NoArgsConstructor
public class GroupAuthority extends AbstractExpiringEntity {

    @Column
    private String name;
}

package com.mybank.data.model.credit;

import com.mybank.data.model.common.AbstractExpiringEntity;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * @author Yugov Alexandr.
 */
@Entity
@Table(name = "credit_type")
@Getter
@Setter
@NoArgsConstructor
public class CreditType extends AbstractExpiringEntity {

    private String name;
}

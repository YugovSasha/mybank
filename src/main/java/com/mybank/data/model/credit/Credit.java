package com.mybank.data.model.credit;

import com.mybank.data.model.common.AbstractExpiringEntity;
import com.mybank.data.model.user.UserProfile;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 * @author Yugov Alexandr.
 */
@Entity
@Getter
@Setter
@NoArgsConstructor
public class Credit extends AbstractExpiringEntity {

    @ManyToOne(fetch = FetchType.EAGER, targetEntity = UserProfile.class)
    @JoinColumn(name = "user_profile_id", nullable = false)
    private UserProfile userProfile;

    @ManyToOne
    @JoinColumn(name = "credit_type_id", nullable = false)
    private CreditType creditType;
}

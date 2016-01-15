package com.mybank.data.model.bank;

import com.mybank.data.model.common.AbstractExpiringEntity;
import com.mybank.data.model.user.User;
import com.mybank.data.model.user.UserCredit;
import com.mybank.service.status.PaymentType;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

/**
 * Created by admin on 09.01.2016.
 */
@Getter
@Setter
@NoArgsConstructor
@Entity
public class Payment extends AbstractExpiringEntity {
    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private User user;
    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private UserCredit userCredit;

    private double value;

    @Enumerated(EnumType.STRING)
    private PaymentType paymentType;
}

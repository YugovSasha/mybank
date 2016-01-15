package com.mybank.data.model.dto;

import com.mybank.data.model.bank.Accrual;
import com.mybank.data.model.user.UserCredit;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * Created by admin on 15.01.2016.
 */
@NoArgsConstructor
@Getter
@Setter
public class PayCreditDto {
    private UserCredit credit;
    private Accrual accrual;
    private double sum;
}

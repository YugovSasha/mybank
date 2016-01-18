package com.mybank.data.model.user;

import com.mybank.data.model.credit.Credit;
import com.mybank.data.model.common.AbstractExpiringEntity;
import com.mybank.data.model.credit.Request;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

/**
 * @author admin.
 */
@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "user_profile")
public class UserProfile extends AbstractExpiringEntity {

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String LastName;

    @Column(name = "patronymic")
    private String patronymic;

    @OneToOne(fetch = FetchType.EAGER, optional = false,
            cascade = {CascadeType.PERSIST, CascadeType.REMOVE, CascadeType.MERGE}, targetEntity = User.class)
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    @OneToMany(fetch = FetchType.EAGER, mappedBy = "userProfile")
    private List<Credit> credits;

    @OneToMany(fetch = FetchType.EAGER, targetEntity = Request.class)
    @JoinColumn(name = "user_profile_id")
    private List<Request> requests;
}

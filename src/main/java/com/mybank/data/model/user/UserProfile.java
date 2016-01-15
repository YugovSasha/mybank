package com.mybank.data.model.user;

import com.mybank.data.model.common.AbstractExpiringEntity;
import lombok.*;

import javax.persistence.*;

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
}

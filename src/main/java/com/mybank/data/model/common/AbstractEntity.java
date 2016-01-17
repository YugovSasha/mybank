package com.mybank.data.model.common;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import com.mybank.data.Identifiable;
import lombok.NoArgsConstructor;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import java.io.Serializable;

/**
 * Created by admin on 11/2/2015.
 */
@JsonIdentityInfo(generator = ObjectIdGenerators.UUIDGenerator.class)
@MappedSuperclass
@NoArgsConstructor
public abstract class AbstractEntity implements Serializable, Identifiable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Override
    public Long getId() {
        return id;
    }

    public void resetId() {
        id = null;
    }
}

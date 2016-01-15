package com.mybank.data.model.common;

import com.mybank.data.Identifiable;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * Created by admin on 11/2/2015.
 */
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
}

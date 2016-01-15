package com.mybank.data.config.repository;

import com.mybank.data.Identifiable;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by a2.yugov on 15.01.2016.
 */
public interface EntityRepository<T extends Identifiable> extends JpaRepository<T, Long> {
}

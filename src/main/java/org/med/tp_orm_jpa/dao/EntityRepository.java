package org.med.tp_orm_jpa.dao;

import java.util.List;

public interface EntityRepository<T> {
    T save(T p);
    List<T> findAll();
    List<T> findByDesignation(String mc);
    T findOne(Long id);
    T update(T p);
    void delete(Long id);
}

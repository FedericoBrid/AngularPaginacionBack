package com.AngularSpringBoot.AngularPaginacion.repository;

import com.AngularSpringBoot.AngularPaginacion.entity.Pais;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPaisRepository extends JpaRepository<Pais, Long> {
}

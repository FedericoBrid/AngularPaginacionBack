package com.AngularSpringBoot.AngularPaginacion.service;

import com.AngularSpringBoot.AngularPaginacion.entity.Pais;
import com.AngularSpringBoot.AngularPaginacion.repository.IPaisRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class PaisService {
    @Autowired
    IPaisRepository paisRepository;

    public Page<Pais> paginas(Pageable pageable){
        return paisRepository.findAll(pageable);
    }
}

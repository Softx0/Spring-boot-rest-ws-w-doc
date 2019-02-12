package com.rest.documentation.repositories;

import com.rest.documentation.domain.Estudiante;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

import java.util.Collection;

@RepositoryRestResource
public interface EstudianteRepository extends JpaRepository<Estudiante, Long> {

    //@RestResource(path = "by-matricula_estudiante")
    //Collection<Estudiante> findByMatricula_estudiante(@Param("matricula_estudiante") String mastricula);
}

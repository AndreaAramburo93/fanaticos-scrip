package com.iudigital.floristeriaapi.repositories;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.iudigital.floristeriaapi.models.ArreglosFloralesModel;

@Repository
public interface IArreglosFloralesRepository extends JpaRepository<ArreglosFloralesModel, Long> {
  
}

package com.iudigital.floristeriaapi.repositories;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.iudigital.floristeriaapi.models.FloresArreglosFloralesModel;

@Repository
public interface IFloresArreglosFloralesRepository extends JpaRepository<FloresArreglosFloralesModel, Long>{

}
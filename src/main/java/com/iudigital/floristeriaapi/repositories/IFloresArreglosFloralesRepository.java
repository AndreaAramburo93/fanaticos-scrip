package com.iudigital.floristeriaapi.repositories;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.iudigital.floristeriaapi.models.FloresArreglosFloralesModel;

@Repository
public interface IFloresArreglosFloralesRepository extends JpaRepository<FloresArreglosFloralesModel, Long>{
  
  @Query("SELECT f FROM FloresArreglosFloralesModel f WHERE f.arreglo.id_arreglo = :idArreglo")
  List<FloresArreglosFloralesModel> findByArregloId(@Param("idArreglo") Long idArreglo);

}

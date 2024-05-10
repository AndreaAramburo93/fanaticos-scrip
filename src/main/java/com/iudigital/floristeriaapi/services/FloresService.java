package com.iudigital.floristeriaapi.services;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iudigital.floristeriaapi.models.FloresModel;
import com.iudigital.floristeriaapi.repositories.IFloresRepository;

@Service
public class FloresService {

  @Autowired
  private IFloresRepository floresRepository;

  public ArrayList<FloresModel> getFlores() {
    return (ArrayList<FloresModel>) this.floresRepository.findAll();
  }

  public FloresModel saveFlor(FloresModel flor) {
    return this.floresRepository.save(flor);
  }

  public Optional<FloresModel> getFlorById(Integer id) {
    return this.floresRepository.findById(id);
  }

  public FloresModel updateById(FloresModel flor, Integer id) {
    FloresModel florToUpdate = this.floresRepository.findById(id).get();
    florToUpdate.setNombre(flor.getNombre());
    florToUpdate.setColor(flor.getColor());
    florToUpdate.setVariedad(flor.getVariedad());
    florToUpdate.setCantidadDisponible(flor.getCantidadDisponible());
    florToUpdate.setPrecioCompra(flor.getPrecioCompra());
    florToUpdate.setPrecioVenta(flor.getPrecioVenta());
    return this.floresRepository.save(florToUpdate);
  }

  public Boolean deleteFlor (Integer id) {
    try {
      this.floresRepository.deleteById(id);
      return true;
    } catch (Exception e) {
      return false;
    }
  }
}

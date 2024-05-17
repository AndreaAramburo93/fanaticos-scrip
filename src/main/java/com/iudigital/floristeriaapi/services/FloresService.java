package com.iudigital.floristeriaapi.services;
import java.util.Optional;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.iudigital.floristeriaapi.models.FloresModel;
import com.iudigital.floristeriaapi.repositories.IFloresRepository;


@Service
public class FloresService {
  
  @Autowired
  private IFloresRepository floresRepository;
  public FloresService(IFloresRepository floresRepository){
    this.floresRepository=floresRepository;
  }
 
  public List<FloresModel> getAllFlores() {
    return  this.floresRepository.findAll();
  }

  public FloresModel saveFlor(FloresModel flor) {
    return this.floresRepository.save(flor);
  }

  public void deleteFlorById(long id_flor) {
    this.floresRepository.deleteById(id_flor);
}



  public Optional<FloresModel> getFlorById(Long id) {
    return this.floresRepository.findById(id);
  }

  public FloresModel updateById(FloresModel flor, long id) {
    FloresModel florToUpdate = this.floresRepository.findById(id).get();
    florToUpdate.setNombre(flor.getNombre());
    florToUpdate.setColor(flor.getColor());
    florToUpdate.setVariedad(flor.getVariedad());
    florToUpdate.setCantidad_disponible(flor.getCantidad_disponible());
    florToUpdate.setPrecio_compra(flor.getPrecio_compra());
    florToUpdate.setPrecio_venta(flor.getPrecio_venta());
    return this.floresRepository.save(florToUpdate);
  }

  // public Boolean deleteFlor (long id) {
  //   try {
  //     this.floresRepository.deleteById(id);
  //     return true;
  //   } catch (Exception e) {
  //     return false;
  //   }
  // }
}

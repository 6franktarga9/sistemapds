package net.apps.rsapp.repository;

import java.util.List;
import net.apps.rsapp.dto.CampiDTO.CampiDTO;
import net.apps.rsapp.entity.Campi.Campi;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface CampiRepository extends JpaRepository<Campi, String>{
    @Query("SELECT c.siglacampi FROM Campi c")
    List<CampiDTO> findAllCampis();
}

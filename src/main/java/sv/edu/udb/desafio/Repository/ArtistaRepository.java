package sv.edu.udb.desafio.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import sv.edu.udb.desafio.Model.ArtistasModel;

@Repository
public interface ArtistaRepository extends CrudRepository<ArtistasModel, Long> {

}

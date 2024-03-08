package sv.edu.udb.desafio.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import sv.edu.udb.desafio.Model.DiscosModel;

@Repository
public interface DiscoRepository extends CrudRepository<DiscosModel, Long> {

}

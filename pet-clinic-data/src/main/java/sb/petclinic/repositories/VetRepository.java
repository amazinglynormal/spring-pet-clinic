package sb.petclinic.repositories;

import org.springframework.data.repository.CrudRepository;
import sb.petclinic.model.Vet;

public interface VetRepository extends CrudRepository<Vet, Long> {
}

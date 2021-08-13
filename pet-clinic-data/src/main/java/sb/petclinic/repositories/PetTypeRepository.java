package sb.petclinic.repositories;

import org.springframework.data.repository.CrudRepository;
import sb.petclinic.model.PetType;

public interface PetTypeRepository extends CrudRepository<PetType, Long> {
}

package sb.petclinic.repositories;

import org.springframework.data.repository.CrudRepository;
import sb.petclinic.model.Pet;

public interface PetRepository extends CrudRepository<Pet, Long> {
}

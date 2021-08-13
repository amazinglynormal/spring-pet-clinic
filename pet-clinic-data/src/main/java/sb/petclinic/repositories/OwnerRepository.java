package sb.petclinic.repositories;

import org.springframework.data.repository.CrudRepository;
import sb.petclinic.model.Owner;

public interface OwnerRepository extends CrudRepository<Owner, Long> {
}

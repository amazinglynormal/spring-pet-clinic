package sb.petclinic.repositories;

import org.springframework.data.repository.CrudRepository;
import sb.petclinic.model.Visit;

public interface VisitRepository extends CrudRepository<Visit, Long> {
}

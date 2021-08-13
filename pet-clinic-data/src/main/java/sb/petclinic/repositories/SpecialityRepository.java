package sb.petclinic.repositories;

import org.springframework.data.repository.CrudRepository;
import sb.petclinic.model.Speciality;

public interface SpecialityRepository extends CrudRepository<Speciality, Long> {
}

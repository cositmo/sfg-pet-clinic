package guru.springframework.hcopetclinic.repositories;

import guru.springframework.hcopetclinic.model.Speciality;
import org.springframework.data.repository.CrudRepository;

public interface SpecialityRepository extends CrudRepository<Speciality, Long> {
}

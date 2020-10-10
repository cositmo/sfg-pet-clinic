package guru.springframework.hcopetclinic.repositories;

import guru.springframework.hcopetclinic.model.PetType;
import org.springframework.data.repository.CrudRepository;

public interface PetTypeRepository extends CrudRepository<PetType, Long> {
}

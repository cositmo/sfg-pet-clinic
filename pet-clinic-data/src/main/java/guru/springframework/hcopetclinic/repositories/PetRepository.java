package guru.springframework.hcopetclinic.repositories;

import guru.springframework.hcopetclinic.model.Pet;
import org.springframework.data.repository.CrudRepository;

public interface PetRepository extends CrudRepository<Pet, Long> {
}

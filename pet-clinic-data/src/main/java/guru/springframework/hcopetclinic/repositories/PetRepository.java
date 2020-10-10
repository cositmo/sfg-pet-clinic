package guru.springframework.hcopetclinic.repositories;

import org.springframework.data.repository.CrudRepository;

public interface PetRepository extends CrudRepository<Pet, Long> {
}

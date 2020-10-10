package guru.springframework.hcopetclinic.repositories;

import guru.springframework.hcopetclinic.model.Vet;
import org.springframework.data.repository.CrudRepository;

public interface VetRepository extends CrudRepository<Vet, Long> {
}

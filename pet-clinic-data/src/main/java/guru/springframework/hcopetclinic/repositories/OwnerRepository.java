package guru.springframework.hcopetclinic.repositories;

import guru.springframework.hcopetclinic.model.Owner;
import org.springframework.data.repository.CrudRepository;

public interface OwnerRepository extends CrudRepository<Owner, Long> {


}

package guru.springframework.hcopetclinic.repositories;

import guru.springframework.hcopetclinic.model.Visit;
import org.springframework.data.repository.CrudRepository;

public interface VisitRepository extends CrudRepository<Visit, Long> {
}

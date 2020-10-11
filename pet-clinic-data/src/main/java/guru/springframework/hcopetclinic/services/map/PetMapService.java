package guru.springframework.hcopetclinic.services.map;

import guru.springframework.hcopetclinic.model.Pet;
import guru.springframework.hcopetclinic.services.PetService;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class PetMapService extends AbstractMapService<Pet, Long> implements PetService {
    @Override
    public Set<Pet> findAll() {
        return super.findAll();
    }

    @Override
    public void delete(Pet object) {
        super.delete(object);
    }

    @Override
    public Pet save(Pet object) {
        return super.save(object);
    }

    @Override
    public void deleteById(Long id) {
        super.deletebyId(id);
    }

    @Override
    public Pet findById(Long id) {
        return super.findById(id);
    }
}

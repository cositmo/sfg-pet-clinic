package guru.springframework.hcopetclinic.services;

import guru.springframework.hcopetclinic.model.Pet;

import java.util.Set;

public interface PetService {

    Pet findById(Long id);

    Pet save(Pet pet);

    Set<Pet> findAll();
}

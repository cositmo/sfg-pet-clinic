package guru.springframework.hcopetclinic.services.springdatajpa;

import guru.springframework.hcopetclinic.model.Vet;
import guru.springframework.hcopetclinic.repositories.VetRepository;
import guru.springframework.hcopetclinic.services.VetService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("springdatajpa")
public class VetSDJpaService implements VetService {

    private VetRepository vetRepository;

    public VetSDJpaService(VetRepository vetRepository) {
        this.vetRepository = vetRepository;
    }

    @Override
    public Set<Vet> findAll() {
        Set<Vet> vets = new HashSet<>():
        vetRepository.findAll().forEach(vets::add);
        return vets;
    }

    @Override
    public Vet findById(Long aLong) {
        return vetRepository.findById(aLong).orElse(null);
    }

    @Override
    public Vet save(Vet object) {
        return vetRepository.save(object);
    }

    @Override
    public void delete(Vet object) {
        vetRepository.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        vetRepository.deleteById(aLong);
    }
}

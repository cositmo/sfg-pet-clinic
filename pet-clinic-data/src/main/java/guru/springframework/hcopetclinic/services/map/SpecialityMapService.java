package guru.springframework.hcopetclinic.services.map;

import guru.springframework.hcopetclinic.model.Speciality;
import guru.springframework.hcopetclinic.services.SpecialityService;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class SpecialityMapService extends AbstractMapService<Speciality, Long> implements SpecialityService {

    @Override
    public Set<Speciality> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long aLong) {
super.deletebyId(aLong);
    }

    @Override
    public void delete(Speciality object) {
super.delete(object);
    }

    @Override
    public Speciality save(Speciality speciality) {
        return super.save(speciality);
    }

    @Override
    public Speciality findById(Long id) {
        return super.findById(id);
    }
}

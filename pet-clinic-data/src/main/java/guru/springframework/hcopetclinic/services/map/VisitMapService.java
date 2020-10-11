package guru.springframework.hcopetclinic.services.map;

import guru.springframework.hcopetclinic.model.Visit;
import guru.springframework.hcopetclinic.services.VisitService;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class VisitMapService extends AbstractMapService<Visit, Long> implements VisitService {

    @Override
    public Set<Visit> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long aLong) {
        super.deletebyId(aLong);
    }

    @Override
    public void delete(Visit object) {
        super.delete(object);
    }

    @Override
    public Visit save(Visit visit) {
        if(visit.getPet() ==null  ||visit.getPet().getOwner() ==null ||visit.getPet().getId()==null){
            throw new RuntimeException("Invalid visit");
        }
        return super.save(visit);
    }

    @Override
    public Visit findById(Long id) {
        return null;
    }
}
package guru.springframework.hcopetclinic.bootstrap;


import guru.springframework.hcopetclinic.model.*;
import guru.springframework.hcopetclinic.services.OwnerService;
import guru.springframework.hcopetclinic.services.PetTypeService;
import guru.springframework.hcopetclinic.services.SpecialityService;
import guru.springframework.hcopetclinic.services.VetService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;
    private final PetTypeService petTypeService;
    private final SpecialityService specialityService;

    public DataLoader(OwnerService ownerService, VetService vetService, PetTypeService petTypeService, SpecialityService specialityService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
        this.petTypeService = petTypeService;
        this.specialityService = specialityService;
    }

    @Override
    public void run(String... args) throws Exception {
        int count = petTypeService.findAll().size();

        if(count == 0) {
            loadData();
        }
    }

    private void loadData() {
        PetType cat = new PetType();
        cat.setName("Cat");
        petTypeService.save(cat);

        PetType dog = new PetType();
        cat.setName("Dog");
        petTypeService.save(dog);


        Owner owner1 = new Owner();
        owner1.setFirstName("Hans");
        owner1.setLastName("Corsmit");
        owner1.setAddress("Grimbergen 40");
        owner1.setCity("Eine");
        owner1.setTelephone("0494412092");

        Pet poemba = new Pet();
        poemba.setName("Poemba");
        poemba.setOwner(owner1);
        poemba.setPetType(cat);
        poemba.setBirthDate(LocalDate.now());

        owner1.getPets().add(poemba);

        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setFirstName("Kaat");
        owner2.setLastName("Schoot");
        owner2.setAddress("Grimbergen 40");
        owner2.setCity("Eine");
        owner2.setTelephone("0494412092");

        Pet rosa = new Pet();
        rosa.setName("Rosa");
        rosa.setOwner(owner2);
        rosa.setPetType(dog);
        rosa.setBirthDate(LocalDate.now());

        owner2.getPets().add(rosa);

        ownerService.save(owner2);

        System.out.println("Loaded owners....");

        Speciality radiology = new Speciality();
        radiology.setDescription("Radiology");

        Speciality surgery = new Speciality();
        surgery.setDescription("Surgery");

        Speciality dentistry = new Speciality();
        dentistry.setDescription("Dentistry");

        specialityService.save(radiology);
        specialityService.save(surgery);
        specialityService.save(dentistry);

        Vet vet1 = new Vet();
        vet1.setFirstName("Peter");
        vet1.setLastName("Janssens");
        vet1.getSpecialities().add(radiology);

        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setFirstName("Jan");
        vet2.setLastName("Peeters");
        vet2.getSpecialities().add(surgery);

        vetService.save(vet2);
    }
}

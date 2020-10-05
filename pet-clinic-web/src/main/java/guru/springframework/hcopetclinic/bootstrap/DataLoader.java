package guru.springframework.hcopetclinic.bootstrap;


import guru.springframework.hcopetclinic.model.Owner;
import guru.springframework.hcopetclinic.model.Pet;
import guru.springframework.hcopetclinic.model.PetType;
import guru.springframework.hcopetclinic.model.Vet;
import guru.springframework.hcopetclinic.services.OwnerService;
import guru.springframework.hcopetclinic.services.PetService;
import guru.springframework.hcopetclinic.services.PetTypeService;
import guru.springframework.hcopetclinic.services.VetService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;
    private final PetTypeService petTypeService;
    private final PetService petService;

    public DataLoader(OwnerService ownerService, VetService vetService, PetTypeService petTypeService, PetService petService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
        this.petTypeService = petTypeService;
        this.petService = petService;
    }

    @Override
    public void run(String... args) throws Exception {

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

        Vet vet1 = new Vet();
        vet1.setFirstName("Peter");
        vet1.setLastName("Janssens");

        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setFirstName("Jan");
        vet2.setLastName("Peeters");

        vetService.save(vet2);
    }
}

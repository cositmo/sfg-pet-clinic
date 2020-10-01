package guru.springframework.hcopetclinic.bootstrap;


import guru.springframework.hcopetclinic.model.Owner;
import guru.springframework.hcopetclinic.model.Vet;
import guru.springframework.hcopetclinic.services.OwnerService;
import guru.springframework.hcopetclinic.services.VetService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;


    public DataLoader(OwnerService ownerService, VetService vetService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
    }

    @Override
    public void run(String... args) throws Exception {
        Owner owner1 = new Owner();
        owner1.setFirstName("Hans");
        owner1.setLastName("Corsmit");

        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setFirstName("Kaat");
        owner2.setLastName("Schoot");

        ownerService.save(owner2);

        System.out.println("Loaded owners....");

        Vet vet1 = new Vet();
        vet1.setFirstName("Poemba");
        vet1.setLastName("The cat");

        vetService.save(vet1);

        Vet vet2 = new Vet();
         vet2.setFirstName("Rosa");
        vet2.setLastName("The dog");

        vetService.save(vet2);
    }
}

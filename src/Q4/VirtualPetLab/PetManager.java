package Q4.VirtualPetLab;
import java.util.ArrayList;

public class PetManager {
    private ArrayList<Pet> pets = new ArrayList<>();

    // TODO: Implement methods as needed to interact with the pets list
    public void addPet(Pet pet) {
        pets.add(pet);
    }

    public void removePet(Pet pet) {
        for (int lcv = 0; lcv < pets.size(); lcv++) {
            Pet curPet = pets.get(lcv);
            if (curPet.getName().equals(pet.getName()) && curPet.getHunger() == pet.getHunger() && curPet.getHappiness() == pet.getHappiness() && curPet.getEnergy() == pet.getEnergy() && curPet.getImage().equals(pet.getImage())) {
                pets.remove(lcv);
                break;
            }
        }
    }

    public ArrayList<Pet> getPets() {
        return pets;
    }

}

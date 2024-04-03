package VirtualPetLab;

public class Dog extends Pet {
    public Dog(String name) {
        super(name);
        super.setImage(ImageHelper.getRandomDogImg());
    }

    @Override
    public void feed() {
        Dog.setEnergy(Dog.getEnergy() + 10);
        Dog.setHappiness(Dog.getHappiness() + 10);
        Dog.setHunger(Dog.getHunger() - 10);

        if (Dog.getEnergy() > 100) { Dog.setEnergy(100); }
        if (Dog.getHappiness() > 100) { Dog.setHappiness(100); }
        if (Dog.getHunger() > 100) { Dog.setHunger(100); }
        if (Dog.getEnergy() < 0) { Dog.setEnergy(0); }
        if (Dog.getHappiness() < 0) { Dog.setHappiness(0); }
        if (Dog.getHunger() < 0) { Dog.setHunger(0); }
    }

    @Override
    public void play() {
        Dog.setEnergy(Dog.getEnergy() - 5);
        Dog.setHappiness(Dog.getHappiness() + 15);
        Dog.setHunger(Dog.getHunger() + 15);

        if (Dog.getEnergy() > 100) { Dog.setEnergy(100); }
        if (Dog.getHappiness() > 100) { Dog.setHappiness(100); }
        if (Dog.getHunger() > 100) { Dog.setHunger(100); }
        if (Dog.getEnergy() < 0) { Dog.setEnergy(0); }
        if (Dog.getHappiness() < 0) { Dog.setHappiness(0); }
        if (Dog.getHunger() < 0) { Dog.setHunger(0); }
    }

    @Override
    public void sleep() {
        Dog.setEnergy(Dog.getEnergy() + 15);
        Dog.setHappiness(Dog.getHappiness() + 5);
        Dog.setHunger(Dog.getHunger() + 5);

        if (Dog.getEnergy() > 100) { Dog.setEnergy(100); }
        if (Dog.getHappiness() > 100) { Dog.setHappiness(100); }
        if (Dog.getHunger() > 100) { Dog.setHunger(100); }
        if (Dog.getEnergy() < 0) { Dog.setEnergy(0); }
        if (Dog.getHappiness() < 0) { Dog.setHappiness(0); }
        if (Dog.getHunger() < 0) { Dog.setHunger(0); }
    }
}

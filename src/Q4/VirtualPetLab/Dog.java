package Q4.VirtualPetLab;

public class Dog extends Pet {
    public Dog(String name) {
        super(name);
        setImage(ImageHelper.getRandomDogImg());
    }

    @Override
    public void feed() {
        setEnergy(getEnergy() + 10);
        setHappiness(getHappiness() + 10);
        setHunger(getHunger() - 10);

        if (getEnergy() > 100) { setEnergy(100); }
        if (getHappiness() > 100) { setHappiness(100); }
        if (getHunger() > 100) { setHunger(100); }
        if (getEnergy() < 0) { setEnergy(0); }
        if (getHappiness() < 0) { setHappiness(0); }
        if (getHunger() < 0) { setHunger(0); }
    }

    @Override
    public void play() {
        setEnergy(getEnergy() - 5);
        setHappiness(getHappiness() + 15);
        setHunger(getHunger() + 15);

        if (getEnergy() > 100) { setEnergy(100); }
        if (getHappiness() > 100) { setHappiness(100); }
        if (getHunger() > 100) { setHunger(100); }
        if (getEnergy() < 0) { setEnergy(0); }
        if (getHappiness() < 0) { setHappiness(0); }
        if (getHunger() < 0) { setHunger(0); }
    }

    @Override
    public void sleep() {
        setEnergy(getEnergy() + 15);
        setHappiness(getHappiness() + 5);
        setHunger(getHunger() + 5);

        if (getEnergy() > 100) { setEnergy(100); }
        if (getHappiness() > 100) { setHappiness(100); }
        if (getHunger() > 100) { setHunger(100); }
        if (getEnergy() < 0) { setEnergy(0); }
        if (getHappiness() < 0) { setHappiness(0); }
        if (getHunger() < 0) { setHunger(0); }
    }
}

package Q4.VirtualPetLab;

public class Fox extends Pet {
    public Fox(String name) {
        super(name);
        setImage(ImageHelper.getRandomFoxImg());
    }

    @Override
    public void feed() {
        setEnergy(getEnergy() + 5);
        setHappiness(getHappiness() + 5);
        setHunger(getHunger() - 15);

        if (getEnergy() > 100) { setEnergy(100); }
        if (getHappiness() > 100) { setHappiness(100); }
        if (getHunger() > 100) { setHunger(100); }
        if (getEnergy() < 0) { setEnergy(0); }
        if (getHappiness() < 0) { setHappiness(0); }
        if (getHunger() < 0) { setHunger(0); }
    }

    @Override
    public void play() {
        setEnergy(getEnergy() + 10);
        setHappiness(getHappiness() + 20);
        setHunger(getHunger() + 20);

        if (getEnergy() > 100) { setEnergy(100); }
        if (getHappiness() > 100) { setHappiness(100); }
        if (getHunger() > 100) { setHunger(100); }
        if (getEnergy() < 0) { setEnergy(0); }
        if (getHappiness() < 0) { setHappiness(0); }
        if (getHunger() < 0) { setHunger(0); }
    }

    @Override
    public void sleep() {
        setEnergy(getEnergy() + 10);
        setHappiness(getHappiness() + 5);
        setHunger(getHunger());

        if (getEnergy() > 100) { setEnergy(100); }
        if (getHappiness() > 100) { setHappiness(100); }
        if (getHunger() > 100) { setHunger(100); }
        if (getEnergy() < 0) { setEnergy(0); }
        if (getHappiness() < 0) { setHappiness(0); }
        if (getHunger() < 0) { setHunger(0); }
    }
}

package VirtualPetLab;

public class Cat extends Pet {
    public Cat(String name) {
        super(name);
        super.setImage(ImageHelper.getRandomCatImg());
    }

    @Override
    public void feed() {
        Cat.setEnergy(Cat.getEnergy() + 15);
        Cat.setHappiness(Cat.getHappiness() + 5);
        Cat.setHunger(Cat.getHunger() - 15);

        if (Cat.getEnergy() > 100) { Cat.setEnergy(100); }
        if (Cat.getHappiness() > 100) { Cat.setHappiness(100); }
        if (Cat.getHunger() > 100) { Cat.setHunger(100); }
        if (Cat.getEnergy() < 0) { Cat.setEnergy(0); }
        if (Cat.getHappiness() < 0) { Cat.setHappiness(0); }
        if (Cat.getHunger() < 0) { Cat.setHunger(0); }
    }

    @Override
    public void play() {
        Cat.setEnergy(Cat.getEnergy() - 10);
        Cat.setHappiness(Cat.getHappiness() + 10);
        Cat.setHunger(Cat.getHunger() + 10);

        if (Cat.getEnergy() > 100) { Cat.setEnergy(100); }
        if (Cat.getHappiness() > 100) { Cat.setHappiness(100); }
        if (Cat.getHunger() > 100) { Cat.setHunger(100); }
        if (Cat.getEnergy() < 0) { Cat.setEnergy(0); }
        if (Cat.getHappiness() < 0) { Cat.setHappiness(0); }
        if (Cat.getHunger() < 0) { Cat.setHunger(0); }
    }

    @Override
    public void sleep() {
        Cat.setEnergy(Cat.getEnergy() + 10);
        Cat.setHappiness(Cat.getHappiness() + 0);
        Cat.setHunger(Cat.getHunger() + 5);

        if (Cat.getEnergy() > 100) { Cat.setEnergy(100); }
        if (Cat.getHappiness() > 100) { Cat.setHappiness(100); }
        if (Cat.getHunger() > 100) { Cat.setHunger(100); }
        if (Cat.getEnergy() < 0) { Cat.setEnergy(0); }
        if (Cat.getHappiness() < 0) { Cat.setHappiness(0); }
        if (Cat.getHunger() < 0) { Cat.setHunger(0); }
    }
}

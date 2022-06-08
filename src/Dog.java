public abstract class Dog {

    String breed;
    int energy;

    public Dog(int intialEnergy){
        this.energy = intialEnergy;
    }

    public abstract void eat();
    public abstract void poop();

}

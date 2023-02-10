public class Apple extends Fruits{
    private Vitamin vitamin;
    public Apple(String nameOfTheFruit, String color, double weight,Vitamin vitamin) {
        super(nameOfTheFruit, color, weight);
        this.vitamin = vitamin;
    }

    public Apple() {
    }

    public Vitamin getVitamin() {
        return vitamin;
    }

    public void setVitamin(Vitamin vitamin) {
        this.vitamin = vitamin;
    }

    @Override
    public String toString() {
        return super.toString() + vitamin;
    }
}

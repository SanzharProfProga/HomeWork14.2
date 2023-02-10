public class Fruits {
private String nameOfTheFruit;
private String color;
private double weight;

    public Fruits(String nameOfTheFruit, String color, double weight) {
        this.nameOfTheFruit = nameOfTheFruit;
        this.color = color;
        this.weight = weight;
    }
    public Fruits(){

    }

    public String getNameOfTheFruit() {
        return nameOfTheFruit;
    }

    public void setNameOfTheFruit(String nameOfTheFruit) {
        this.nameOfTheFruit = nameOfTheFruit;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "\nFruits" +
                "\nName of the fruit: " + nameOfTheFruit +
                "\nColor: " + color +
                "\nWeight: " + weight ;
    }
}

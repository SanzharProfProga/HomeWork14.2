public class Vitamin {
    private char vitamin;

    public Vitamin(char vitamin) {
        this.vitamin = vitamin;
    }

    public char getVitamin() {
        return vitamin;
    }

    public void setVitamin(char vitamin) {
        this.vitamin = vitamin;
    }

    @Override
    public String toString() {
        return "\nVitamin: " + vitamin ;
    }
}

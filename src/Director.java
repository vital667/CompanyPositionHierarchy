public class Director extends People {
    public Director(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return "Director: " + super.getName();
    }

}

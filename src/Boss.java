public class Boss extends People {
    public Boss(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return "|-----Boss: " + super.getName();
    }

}

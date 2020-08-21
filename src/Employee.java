public class Employee extends People {
    public Employee(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return "      |-----Employee: " + super.getName();
    }
}

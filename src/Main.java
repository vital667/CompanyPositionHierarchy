import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Employee> employeesList1 = new ArrayList<>();
        List<Employee> employeesList2 = new ArrayList<>();
        List<Employee> employeesList3 = new ArrayList<>();
        List<Employee> employeesList4 = new ArrayList<>();
        List<Employee> employeesList5 = new ArrayList<>();

        Map<Boss, List<Employee>> bosses1 = new LinkedHashMap<>();
        Map<Boss, List<Employee>> bosses2 = new LinkedHashMap<>();

        Map<Director, Map<Boss, List<Employee>>> directors = new LinkedHashMap<>();

        for (int i = 1; i <= 3; i++)
            employeesList1.add(new Employee("employee" + i));

        for (int i = 4; i <= 7; i++)
            employeesList2.add(new Employee("employee" + i));

        for (int i = 8; i <= 10; i++)
            employeesList3.add(new Employee("employee" + i));

        for (int i = 11; i <= 14; i++)
            employeesList4.add(new Employee("employee" + i));

        for (int i = 15; i <= 19; i++)
            employeesList5.add(new Employee("employee" + i));

        bosses1.put(new Boss("Boss 1"), employeesList1);
        bosses1.put(new Boss("Boss 2"), employeesList2);
        bosses1.put(new Boss("Boss 3"), employeesList3);
        bosses2.put(new Boss("Boss 4"), employeesList4);
        bosses2.put(new Boss("Boss 5"), employeesList5);

        directors.put(new Director("Director 1"), bosses1);
        directors.put(new Director("Director 2"), bosses2);

        for (Map.Entry<Director, Map<Boss, List<Employee>>> i : directors.entrySet()) {
            System.out.println(i.getKey());
            for (Map.Entry<Boss, List<Employee>> entry : i.getValue().entrySet()) {
                System.out.println(entry.getKey());
                for (Employee j : entry.getValue())
                    System.out.println(j);
            }
        }
    }
}